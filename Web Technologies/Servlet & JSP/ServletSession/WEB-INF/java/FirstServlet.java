import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class FirstServlet extends HttpServlet {
   public void doGet(HttpServletRequest request, HttpServletResponse response){
		try{
			response.setContentType("text/html");
			PrintWriter pwriter = response.getWriter();

			String name = request.getParameter("name");
			String password = request.getParameter("pass");
			
			pwriter.print("<center><h2>Hello </h2><h3>"+name+"</h3>");
			pwriter.print("<h3>Your Password is: </h3><h2>"+password+"</h2><br><br>");
			HttpSession session=request.getSession();
			session.setAttribute("uname",name);
			session.setAttribute("upass",password);
			pwriter.print("<h3><a href='welcome'>Get data from Session</a></h3>");
			pwriter.close();
		}
		catch(Exception exp){
			System.out.println(exp);
		}
	}
}