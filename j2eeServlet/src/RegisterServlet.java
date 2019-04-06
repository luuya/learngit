import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HelloServlet {
	protected void service(HttpServletRequest request,HttpServletResponse response) {
		System.out.println("��ȡ��ֵ����name:"+request.getParameter("name"));
		
		String[] hobits = request.getParameterValues("hobits");
		System.out.println("��ȡ��ֵ����hobits:"+Arrays.asList(hobits));
		
		System.out.println("ͨ��getParameterMap�������в�����");
		Map<String, String[]> parameters = request.getParameterMap();
		
		Set<String> paramNames  = parameters.keySet();
		for (String param : paramNames) {
			String[] value = parameters.get(param);
			System.out.println(param+":"+Arrays.asList(value));
		}
		
	}
}
