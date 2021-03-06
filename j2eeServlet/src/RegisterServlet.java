import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HelloServlet {
	protected void service(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("获取单值参数name:"+request.getParameter("name"));
		
		String[] hobits = request.getParameterValues("hobits");
		System.out.println("获取多值参数hobits:"+Arrays.asList(hobits));
		
		System.out.println("通过getParameterMap遍历所有参数：");
		Map<String, String[]> parameters = request.getParameterMap();
		
		Set<String> paramNames  = parameters.keySet();
		for (String param : paramNames) {
			String[] value = parameters.get(param);
			System.out.println(param+":"+Arrays.asList(value));
		}
		
	}
}
