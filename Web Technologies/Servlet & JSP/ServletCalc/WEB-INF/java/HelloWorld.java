import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class HelloWorld extends HttpServlet { 
   private String message;
   public void init() throws ServletException {
      // Do required initialization
      message = "Hello CSE";
   }
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {  
      // Set response content type
      response.setContentType("text/html");
      // Actual logic goes here.
      PrintWriter out = response.getWriter();
      out.println("<center><h2>" + message + "</h2>");
   }
   public void destroy() {
      // do nothing.
   }
}