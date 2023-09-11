package process;

import javax.servlet.http.HttpServlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

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
public class jsonUploadServlet extends HttpServlet {
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
	                    if (!contentType.startsWith("json")) {
	                        // 实现简单的错误提示
	                        req.setAttribute("Msg1", "您上传的文件格式不正确，请重新上传！");
	                        req.getRequestDispatcher("upload.jsp").forward(req, resp);
	                        return;  // 如果不是类型则不再对请求进行处理
	                    }
	                    // 将上传的文件保存到服务器      UUID.randomUUID().toString()+"."+FilenameUtils.getExtension(fileItem.getName())
	                	String fileName = FilenameUtils.getName(fileItem.getName());
	                    fileItem.write(new File("/home/qin/文档/apache-tomcat-7.0.73/bin/json", fileName));
	                    //MysqlJdbc.add(fileName);
	                    req.setAttribute("Msg1",fileName+"上传成功!");
	//////////////////               /////     ////////////////////////
	                    String path="/home/qin/文档/apache-tomcat-7.0.73/bin/json/"+fileName;
	                    String s = readJsonFile.readJson(path);
	                    JSONObject jobj = JSON.parseObject(s);
	                    //System.out.println("type :"+jobj.get("type"));
	                     JSONArray features = jobj.getJSONArray("features");
	                     int total=features.size()/3+5;
	                     
	                     String []Distance=new String [total];
	                     for(int j=0;j<total;j++){Distance[j]=" 0";}
	                     
	                     int d=0;//distance[] number 
	                     System.out.println(features.size());
	                     
	                     for (int i = 2 ; i < features.size();i+=3){
	                         JSONObject key1 = (JSONObject)features.get(i);
	                         String type = (String)key1.get("type");
	                        
	                         JSONObject geometry = (JSONObject)key1.getJSONObject("geometry");
	                         String type1 =(String)geometry.get("type");
	                         
	                         //System.out.println(type);
	                        // System.out.println(type1);
	                         
	                         JSONObject properties = (JSONObject)key1.getJSONObject("properties");
	                         String name =(String)properties.get("name");
	                         String distance =(String)properties.get("distance");
	                         if(name!=null){
	                        // System.out.println(name);
	                         	}
	                         if(distance!=null){
	                         System.out.print(distance+"  Dis:");
	                         d=(i-2)/3;
	                         Distance[d]=distance;
	                         System.out.println(Distance[d]+" i:"+i+" d:"+d);
	                         
	                         }
	                     }
	                   ////
	                     String prefix=fileName.substring(fileName.lastIndexOf("."));//如果想获得不带点的后缀，变为fileName.lastIndexOf(".")+1
	                     int num=prefix.length();//得到后缀名长度
	                     String fileOtherName=fileName.substring(0, fileName.length()-num);
	                     MysqlJdbc.add(fileOtherName,Distance[0],Distance[1],Distance[2],Distance[3],Distance[4],Distance[5],Distance[6]);
	                   System.out.print("ok");
	                   req.setAttribute("BH",Distance[0]);
	                   req.setAttribute("WH",Distance[1]);
	                   req.setAttribute("BL",Distance[2]);
	                   req.setAttribute("RL",Distance[3]);
	                   req.setAttribute("RW",Distance[4]);
	                   req.setAttribute("HH",Distance[5]);
	                   req.setAttribute("HW",Distance[6]);
	                     ///////////////////    ///////////////////////
	                    req.getRequestDispatcher("upload.jsp").forward(req, resp);
	                }
	            }
	                
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
	
