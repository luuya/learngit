import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	public LoginServlet() {
		System.out.println("�ұ�������");
	}
	
	public void init(ServletConfig config) {
		System.out.println("init(ServletConfig)");
	}
	
	public void destroy() {
		System.out.println("�ұ������ˣ���������������������������������������������������������������");
	}
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String html=null;
		if("admin".equals(name)&&"123".equals(password)) {
			html="<div style='color:green'>��½�ɹ�</div>";
		}else {
			html="<div style='color:red'>��½ʧ��</div>";
		}
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = response.getWriter();
		pw.println(html);
		
		System.out.println("name: "+name);
		System.out.println("password:"+password);
	}

}
