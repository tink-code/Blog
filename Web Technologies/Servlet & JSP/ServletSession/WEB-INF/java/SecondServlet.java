import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SecondServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response){
		try{
			response.setContentType("text/html");
			PrintWriter pwriter = response.getWriter();
			HttpSession session=request.getSession(false);
			String myName=(String)session.getAttribute("uname");
			String myPass=(String)session.getAttribute("upass");
			pwriter.print("<center><h2 color='#FF0000'>Name : "+myName+"<br>Password : "+myPass+"</h2>");
			pwriter.close();
		}
		catch(Exception exp){
			System.out.println(exp);
		}
	}
}