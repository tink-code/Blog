    import java.io.*;  
    import javax.servlet.*;  
    import javax.servlet.http.*;  
      
    public class SecondCookie extends HttpServlet {  
    public void doPost(HttpServletRequest request, HttpServletResponse response){  
        try{  
			response.setContentType("text/html");  
			PrintWriter out = response.getWriter();  
			  
			Cookie ck[]=request.getCookies();  
			out.print("<h3>Accessing data from Cookie</h3>"); 
			out.print("Hello "+ck[0].getValue()); 
			out.print("Your Roll No. is "+ck[1].getValue());		      
			out.close();  
			}
			catch(Exception e){
				System.out.println(e);
			}         
		}  
          
    }  