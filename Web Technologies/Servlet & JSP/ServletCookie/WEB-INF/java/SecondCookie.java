import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
  
public class SecondCookie extends HttpServlet {  
  public void doPost(HttpServletRequest request, HttpServletResponse response){        
    try{  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        Cookie ck[]=request.getCookies();  
        out.print("<center><h2><u>Accessing data from Cookie</u></h2><br><br>"); 
        out.print("<h3>Good day <div style='color:#ff0000;'>"+ck[0].getValue().toUpperCase()+"<div></h3>"); 
        out.print("<h3>Your Roll No. is : <div style='color:#ff0000;'>"+ck[1].getValue().toUpperCase()+"</div></h3>");		      
        out.close();  
      }
    catch(Exception e){
      System.out.println(e);
    }         
  }    
}  