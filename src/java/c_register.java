/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
 
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class c_register extends HttpServlet
{
    public void doPost(HttpServletRequest req,
            HttpServletResponse res)throws IOException,
            ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String c_name=req.getParameter("n1");
        String c_add=req.getParameter("n2");
        String c_type=req.getParameter("n3");
        String c_cont=req.getParameter("n4");
        String b_charges=req.getParameter("n7");
        String c_id=req.getParameter("n5");
        String c_pass=req.getParameter("n6");
        try
       {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","pass1");
                   Statement stmt=con.createStatement();
                   String ql="insert into c_db values('"+c_name+"','"+c_add+"','"+c_type+"','"+c_cont+"','"+c_id+"','"+c_pass+"','"+b_charges+"','NULL')";
                   int x=stmt.executeUpdate(ql);
                   if(x>0)
                   {
                       pw1.println("Details submitted Successfully");
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
                       pw1.println("error!!!");
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


