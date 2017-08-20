package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class c_005fbooking_005fdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>A_LOGIN</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"about.css\" />\n");
      out.write("    </head>\n");
      out.write("   <body bgcolor=\"orange\">\n");
      out.write("       \n");
      out.write("<div id=\"headbar\"> \n");
      out.write("<h1>STELLAR</h1> \n");
      out.write("<div id=\"logo\"><img src=\"logo.jpg\" height=\"100\" width=\"100\" >\n");
      out.write("<h2 id=\"head1\">\n");
      out.write("    Come Celebrate with Us\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<a href=\"Home.html\">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<a href=\"about.html\">About</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<a href=\"our_experts.html\">Our Experts</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<a href=\"Careers.html\">Careers</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<a href=\"contact_us.html\">Contact Us</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("</h2> \n");
      out.write("    \n");
      out.write("     </div>\n");
      out.write("     </div>\n");
      out.write("       <br><br><br><br>\n");
      out.write("       <h1><FONT size=\"10\" color=\"mediumvioletred\"> User's Details </font></h1>      \n");
      out.write("<h3>\n");
      out.write("       ");

           try
           {
            Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","pass1");
                   Statement stmt=con.createStatement();
                
                   String q1="select * from u_db ";
                    
                     ResultSet rs=stmt.executeQuery(q1);
                
                     int c=1;
                     while(rs.next())
                        //next check the next record is present or not
                    {
                        out.println("<br><br>"+c+". The Customer's Full name is :" +rs.getString(1));
                        out.println("<br><br>"+c+". The Customer's Last name is :" +rs.getString(2));
                        out.println("<br><br>"+c+". The Customer's Gender is :" +rs.getString(3));
                        out.println("<br><br>"+c+". The Customer's Address is :" +rs.getString(4));
                        out.println("<br><br>"+c+". The Customer's Phone no is :" +rs.getString(5));
                        out.println("<br><br>"+c+". The Customer's e-mail id is :" +rs.getString(6));
                        
                        
                        
                        out.println("<br><br>");
                        c++;
 
                    }
          
                     if(c==1)
                     {
                         out.println("There is no record in the table");
                     }
                    con.close();
           }
      
         catch(Exception e)
             {
                out.println(e);
             }
           
           
           
      out.write("\n");
      out.write("</h3>\n");
      out.write("     \n");
      out.write("\n");
      out.write("\n");
      out.write("<a href=\"Home.html\" title=\"Go to Top\"><img src=\"top.jpg\" width=\"50\" height=\"50\"></a>\n");
      out.write("    <table border=\"0\" bgcolor=\"black\" width=\"100%\" cellspacing=\"0\" height=\"80\">\n");
      out.write("       \n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td></td>\n");
      out.write("            <td> <h3><a href=\"a_login.html\"><font color=\"white\">Admin Login</a></h3> </td>\n");
      out.write("            <td> <h3><a href=\"c_register.html\"><font color=\"white\">Register your Company</a></h3> </td>\n");
      out.write("            <td> <h3><a href=\"c_login.html\"><font color=\"white\">Contact Us</a></h3> </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            \n");
      out.write("            <td><h1><font color=\"white\">Follow Us on </h1></td>\n");
      out.write("            <td></td>\n");
      out.write("            <td></td>\n");
      out.write("            <td><h3><a href=\"Home.html\"><font color=\"white\">Company Login</a></h3></td>\n");
      out.write("            <td> <h3><a href=\"careers.html\"><font color=\"white\">Careers</a></h3> </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            \n");
      out.write("            <td><a href=\"https://www.facebook.com/pratik.suraj.12\" title=\"Follow us on Facebook\"><img src=\"fb.jpg\" width=\"50\" height=\"50\"><a href=\"https://plus.google.com/u/0/104490409921796032702\" title=\"Follow Us on Google+\"><img src=\"google_plus.jpg\" width=\"50\" height=\"50\"></td>\n");
      out.write("            <td></td>\n");
      out.write("            <td></td>\n");
      out.write("            <td></td>\n");
      out.write("            <td> <h3><a href=\"https://www.google.co.in/maps/place/Asansol+Engineering+College/@23.7157019,86.9511464,15z/data=!4m5!3m4!1s0x0:0xc2814fdb4c367784!8m2!3d23.7157019!4d86.9511464\"><font color=\"white\">Sitemap</a></h3> </td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td></td>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <td align=\"right\"> <h3><font color=\"white\">Copyright 2017 | All Rights Reserved. Designed by P4</h3> </td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("        </body>\n");
      out.write("       \n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
