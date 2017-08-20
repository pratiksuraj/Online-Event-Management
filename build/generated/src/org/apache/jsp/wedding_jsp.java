package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class wedding_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("      <title>Marriage</title>\n");
      out.write("        \n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"about.css\" />\n");
      out.write("      \n");
      out.write("\t\n");
      out.write("    </head>\n");
      out.write("    <body bgcolor=\"orange\">\n");
      out.write("        \n");
      out.write("        <div id=\"header\">  \n");
      out.write("<div id=\"headbar\">\n");
      out.write("<h1 >STELLAR</h1> \n");
      out.write("<div id=\"logo\"><img src=\"logo.jpg\" height=\"100\" width=\"100\" >\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<h2 id=\"head1\">Come Celebrate with Us\n");
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<a href=\"l_home.html\">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<a href=\"about.html\">About</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<a href=\"Home.html\">Our Experts</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<a href=\"career.html\">Careers</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("<a href=\"contact_us.html\">Contact Us</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
            try
        {
             String nm1=request.getParameter("n1");
            HttpSession ses=request.getSession();
            String s1= (String)ses.getAttribute("nm1");

      out.write("              \n");
      out.write("<a href=\"Home.jsp\" title=\"Click here to logout\"><font color=\"white\">");
out.println(s1);
      out.write("</font></a>");

            
           /* String ss=s1.substring(1, 3);
            out.println(ss);
            session.setAttribute(nm1, null);
            session.removeAttribute(nm1);
            */
        }
        catch(Exception e)
        {
            
        }
      
            
      out.write("\n");
      out.write("\n");
      out.write("</h2>     \n");
      out.write("    </div>\n");
      out.write("     \n");
      out.write("      </div>\n");
      out.write("        \n");
      out.write("        <center>\n");
      out.write("            <br><br><br><br><br>\n");
      out.write("            \n");
      out.write("        <img src=\"wedding.jpg\" width=\"100%\" height=\"400\">       \n");
      out.write("         <h2>\n");
      out.write("        <form method=\"post\" action=\"fc_wedding.jsp\">\n");
      out.write("           \n");
      out.write("    <table  border =\"2\" align=\"center\" width=\"100%\" height=\"100\" bgcolor=\"white\" cellpadding=\"10\" cellspacing=\"10\">\n");
      out.write("    \n");
      out.write("    <tr> <td  align=\"center\">Date of Wedding</td>\n");
      out.write("       <td >\n");
      out.write("           <table><td><input type=\"text\" name=\"n1\" placeholder=\"DD\" required></td>\n");
      out.write("        <td ><input type=\"text\" name=\"n9\" placeholder=\"MM\" required></td>\n");
      out.write("    <td ><input type=\"text\" name=\"n10\" placeholder=\"YYYY\" required></td></table></tr>\n");
      out.write("        \n");
      out.write("        <tr><td align=\"center\">\n");
      out.write("        <label>Wedding Venue:</label> </td>\n");
      out.write("            \n");
      out.write("        <td > <select name=\"n2\">\n");
      out.write("            <option value=\"-1\" >Venues</option>\n");
      out.write("            ");

                
                try
                {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","pass1");
                   Statement stmt=con.createStatement();
                   
                    String q1="select c_name from c_db";
                    
                    ResultSet rs=stmt.executeQuery(q1);
                    
                    while(rs.next())
                    {
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                        <option value=\"");
      out.print(rs.getString("c_name"));
      out.write("\" >");
      out.print(rs.getString("c_name"));
      out.write("</option>\n");
      out.write("                        \n");
      out.write("                        ");

                    }
                    
                }
                
                catch(Exception e)
                {
                            
                }
                
                
             
      out.write("\n");
      out.write("        </select>\n");
      out.write("        </td>\n");
      out.write("        \n");
      out.write("         <tr><td align=\"center\">Theme of Wedding :</td><td><input type =\"radio\" name=\"n3\" VALUE=\"Royal\" CHECKED>Royal <br><input type =\"radio\" name=\"n3\" VALUE=\"Vintage\">Vintage</td></tr>\n");
      out.write("        \n");
      out.write("        <tr><td align=\"center\">Decoration:</td><td><input type =\"radio\" name=\"n4\" VALUE=\"Yes\" CHECKED>Yes <br><input type =\"radio\" name=\"n4\" VALUE=\"No\">No</td></tr>\n");
      out.write("        \n");
      out.write("        <tr><td align=\"center\">Sound System:</td><td><input type =\"radio\" name=\"n5\" VALUE=\"Yes\" CHECKED>Yes <br><input type =\"radio\" name=\"n5\" VALUE=\"No\">No</td></tr>\n");
      out.write("        \n");
      out.write("        <tr><td align=\"center\">Expected number of people :</td><td><input type =\"text\" name=\"n6\" ></td></tr>\n");
      out.write("        \n");
      out.write("        <tr><td align=\"center\">Catering Service:</td><td><input type =\"checkbox\" name=\"n7\" VALUE=\"Yes\" >Vegetarian <br><input type =\"checkbox\" name=\"n8\" VALUE=\"Yes\">Non-Vegetarian</td></tr>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <tr><td colspan =\"2\" align=\"center\">&nbsp;&nbsp;&nbsp;&nbsp;<input type=\"submit\" value=\"Submit\"></td></tr>\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("    \n");
      out.write(" </h2>\n");
      out.write("        </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
