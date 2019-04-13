import javax.servlet.*;
import java.io.*;
public class LoginController extends GenericServlet{    
	private String user1,pwd1,user2,pwd2,user3,pwd3,User,Pwd;   
	
	public void init(ServletConfig sc){ 
		user1=sc.getInitParameter("username1");
		pwd1=sc.getInitParameter("password1");
		user2=sc.getInitParameter("username2");
		pwd2=sc.getInitParameter("password2");
		user3=sc.getInitParameter("username3");
		pwd3=sc.getInitParameter("password3");
	}
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		User=req.getParameter("username");
		Pwd=req.getParameter("password");
		
		if((User.equals(user1)&&Pwd.equals(pwd1)) || (User.equals(user2)&&Pwd.equals(pwd2)) || (User.equals(user3)&&Pwd.equals(pwd3))){
			out.println("<h3> Welcome "+User.toUpperCase()+"</h3>");
		}
		else{
			out.println("<h3> You are not authorized user. <a href='login.html'>Go to Login</a></h3>");
		}
	}
	
}