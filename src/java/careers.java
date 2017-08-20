/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
 
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class careers extends HttpServlet
{
    public void doPost(HttpServletRequest req,
            HttpServletResponse res)throws IOException,
            ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String name=req.getParameter("n1");
        String qual=req.getParameter("n2");
        String age=req.getParameter("n3");
        String tech=req.getParameter("n4");
        String phn=req.getParameter("n5");
        String e_mail=req.getParameter("n6");
        try
       {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","pass1");
                   Statement stmt=con.createStatement();
                   String ql="insert into careers values('"+name+"','"+qual+"','"+age+"','"+tech+"','"+phn+"','"+e_mail+"')";
                   int x=stmt.executeUpdate(ql);
                   if(x>0)
                   {
                       pw1.println("Details submitted Successfully");
                        pw1.println("<html>\n" +
"    <head>\n" +
"    </head>\n" +
"    <body>\n" +
"        <a href=\"Home.html\"><h1>click here to go to home page of our website<h1></a>\n" +
"    </body>\n" +
"</html>\n" +
"\n" +
"\n" +
"");
                       
                   }
                   else
                   {
                       pw1.println("error!!!");
                         pw1.println("<html>\n" +
"    <head>\n" +
"    </head>\n" +
"    <body>\n" +
"        <a href=\"Home.html\">Please try to register again!!</a>\n" +
"    </body>\n" +
"</html>\n" +
"\n" +
"\n" +
"");
                     
                   }
                    con.close();
       }
           catch(Exception e)
           {
               pw1.println(e);
           
           }
        
        
        
        
        
    }
}    


