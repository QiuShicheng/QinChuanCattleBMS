package process;
	import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import org.apache.commons.fileupload.servlet.ServletFileUpload;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.UUID;

	public class changeServlet extends HttpServlet {
		public final static int END_MARK = 0;
	    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	        // 验证请求是否满足要求（post 请求 / enctype 是否以multipart打头
              String str=req.getParameter("txt");
              String command;
      		boolean test;
      		command="pcl_pcd2ply "+str+".pcd "+str+".ply";
      		test=cmd.excute(command);
            command="PotreeConverter "+str+".ply -o /home/qin/文档/apache-tomcat-7.0.73/webapps/potree --generate-page "+str;
            test=cmd.excute(command);
            System.out.println(test);
	    	// 如果不满足要求就立即结束对该请求的处理
            req.setAttribute("address",str);
            req.getRequestDispatcher("upload.jsp").forward(req, resp);	        
	    }
	}
	

