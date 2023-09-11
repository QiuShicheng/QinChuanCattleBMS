package process;
	import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

	import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

	import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.UUID;

	public class UploadServlet extends HttpServlet {
		public final static int END_MARK = 0;
	    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        // 验证请求是否满足要求（post 请求 / enctype 是否以multipart打头
	        boolean isMultipart = ServletFileUpload.isMultipartContent(req);
	        // 如果不满足要求就立即结束对该请求的处理
	        if (!isMultipart) {
	            return;
	        }
	        
	        try {
	            // FileItem 是表单中的每一个元素的封装
	            // 创建一个 FileItem 的工厂类
	            FileItemFactory factory = new DiskFileItemFactory();
	         // 设置缓存大小 500kb
	            ((DiskFileItemFactory) factory).setSizeThreshold(1024*500);
	            // 设置临时目录
	            ((DiskFileItemFactory) factory).setRepository(new File("/home/qin/temp"));
	            // 创建一个文件上传处理器（装饰设计模式）
	            ServletFileUpload upload = new ServletFileUpload(factory);
	            // 解析请求
	            List<FileItem> items = upload.parseRequest(req);
	            for (FileItem fileItem :
	                    items) {
	                // 判断空间是否是普通控件
	                if (fileItem.isFormField()) {
	                    // 普通控件
	                } else {
	                    // 上传控件
	                	String contentType = FilenameUtils.getExtension(fileItem.getName());
	                    if (!contentType.startsWith("pcd")) {
	                        // 实现简单的错误提示
	                        req.setAttribute("Msg", "您上传的文件格式不正确，请重新上传！");
	                        req.getRequestDispatcher("upload.jsp").forward(req, resp);
	                        return;  // 如果不是图片类型则不再对请求进行处理
	                    }
	                    // 将上传的文件保存到服务器      UUID.randomUUID().toString()+"."+FilenameUtils.getExtension(fileItem.getName())
	                	String fileName = FilenameUtils.getName(fileItem.getName());
	                    fileItem.write(new File("/home/qin/文档/apache-tomcat-7.0.73/bin", fileName));
	                    ///MysqlJdbc.add();
	                    req.setAttribute("Msg",fileName+"上传成功!");
	                    req.getRequestDispatcher("upload.jsp").forward(req, resp);
	                }
	            }
	                
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
	
