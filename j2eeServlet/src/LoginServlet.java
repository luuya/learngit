import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	public LoginServlet() {
		System.out.println("我被调用了");
	}
	
	public void init(ServletConfig config) {
		System.out.println("init(ServletConfig)");
	}
	
	public void destroy() {
		System.out.println("我被销毁了！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
	}
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String html=null;
		if("admin".equals(name)&&"123".equals(password)) {
			html="<div style='color:green'>登陆成功</div>";
		}else {
			html="<div style='color:red'>登陆失败</div>";
		}
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.println(html);
		
		System.out.println("name: "+name);
		System.out.println("password:"+password);
	}

}
