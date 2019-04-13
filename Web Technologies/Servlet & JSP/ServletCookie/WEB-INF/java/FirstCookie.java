import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class FirstCookie extends HttpServlet {  
  public void doPost(HttpServletRequest request, HttpServletResponse response){  
    try{  
      response.setContentType("text/html");  
      PrintWriter out = response.getWriter();   
      out.print("<center><h2><u>Storing data to Cookie</u></h2><br><br>");
      String name=request.getParameter("username"); 
      String roll=request.getParameter("rollnumber"); 		
      out.print("<h3>Welcome <div style='color:#ff0000;'>"+name.toUpperCase()+"</div></h3><br>");  
      
      Cookie ck1=new Cookie("uname",name);//creating cookie object  
      Cookie ck2=new Cookie("uroll",roll);//creating cookie object  
      response.addCookie(ck1);//adding cookie in the response  
      response.addCookie(ck2);//adding cookie in the response  
      
      //creating submit button   
      out.print("<form action='servlet2' method='POST'>");  
      out.print("<input type='submit' value='Access Roll Number'>");  
      out.print("</form>");
      out.close();  
    }
    catch(Exception e){
      System.out.println(e);
    }  
  }  
}  