import java.io.*;
import java.util.*;
import  javax.servlet.*;
import java.io.*;
import javax.servlet.*;
public class 11111_jsp implements Servlet {  
public void destroy(){}
public ServletConfig getServletConfig() {return null;}
public String getServletInfo(){return null;}
public void init(ServletConfig arg0) throws ServletException {}
public void service(ServletRequest arg0, ServletResponse arg1)throws ServletException, IOException {
PrintWriter out = arg1.getWriter();
out.println("<html>");
out.println("<head>");
out.println("<title>Display Current Date & Time</title>");
out.println("</head>");
out.println("<body>");
out.println("<center>");
out.println("<h1>");
out.println("Display Current Date & Time");
out.println("</h1>");
out.println("</center>");
out.println("");
for(int i=0;i<10;i++) {
out.println("xxxxxxxxxxxx");
out.println("hello,ni hao shuai zhu jiao!");
out.println("<br/>");
} 
out.println("</body>");
out.println("</html>");
}
}