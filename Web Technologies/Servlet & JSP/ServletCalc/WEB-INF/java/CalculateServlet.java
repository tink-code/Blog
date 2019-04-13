import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class CalculateServlet extends HttpServlet 
{
public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
 { 
	//display();
	PrintWriter out = response.getWriter(); 
	//out.println("hello");
	String n1 = request.getParameter("no1");
	String n2 = request.getParameter("no2");
	String opt = request.getParameter("opt");
	if(opt.equals("a"))
	out.println(Integer.parseInt(n1) + Integer.parseInt(n2));
	else if(opt.equals("s")) 
	out.println(Integer.parseInt(n1) - Integer.parseInt(n2)); 
	else if(opt.equals("m")) 
	out.println(Integer.parseInt(n1) * Integer.parseInt(n2));
	else if(opt.equals("d")) 
	out.println(Integer.parseInt(n1) / Integer.parseInt(n2)); 
	else if(opt.equals("mod")) 
	out.println(Integer.parseInt(n1) % Integer.parseInt(n2));
} 

public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException {
	doPost(request,response); 
}
}