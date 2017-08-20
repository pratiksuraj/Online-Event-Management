/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
 
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class u_register extends HttpServlet
{
    public void doPost(HttpServletRequest req,
            HttpServletResponse res)throws IOException,
            ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String f_name=req.getParameter("n1");
        String l_name=req.getParameter("n2");
        String u_gen=req.getParameter("n3");
        String u_add=req.getParameter("n4");
        String u_phn=req.getParameter("n5");
        String e_id=req.getParameter("n6");
        String u_pass=req.getParameter("n7");
        try
       {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","pass1");
                   Statement stmt=con.createStatement();
                   String ql="insert into u_db values('"+f_name+"','"+l_name+"','"+u_gen+"','"+u_add+"','"+u_phn+"','"+e_id+"','"+u_pass+"')";
                   int x=stmt.executeUpdate(ql);
                   if(x>0)
                   {
                       pw1.println("Registration Successfull");
                        pw1.println("<html>\n" +
"    <head>\n" +
"    </head>\n" +
"    <body>\n" +
"        <a href=\"Home.jsp\"><img src=\"REG.jpg\"></a>\n" +
"    </body>\n" +
"</html>\n" +
"\n" +
"\n" +
"");
                       
                   }
                   else
                   {
                       pw1.println("Registration Unsuccessfull");
                         pw1.println("<html>\n" +
"    <head>\n" +
"    </head>\n" +
"    <body>\n" +
"        <a href=\"Home.jsp\"><img src=\"reg un.jpg\"></a>\n" +
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


