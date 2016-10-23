import java.io.*;
import java.util.*;
import  javax.servlet.*;
import java.io.*;
import javax.servlet.*;
public class test_1_jsp implements Servlet {  
public void destroy(){}
public ServletConfig getServletConfig() {return null;}
public String getServletInfo(){return null;}
public void init(ServletConfig arg0) throws ServletException {}
public void service(ServletRequest arg0, ServletResponse arg1)throws ServletException, IOException {
PrintWriter out = arg1.getWriter();
out.println("<html>");
out.println("<head>");
out.println("<title>this is a test</title>");
out.println("</head>");
out.println("<body>");
for(int i=0;i<5;i++) {
out.println("ssss");
out.println("<br/>");
} 
out.println("</body>");
out.println("</html>");
}
}