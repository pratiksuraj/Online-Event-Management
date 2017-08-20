/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
 
import java.sql.*;
import static java.sql.JDBCType.NULL;
import javax.servlet.*;
import javax.servlet.http.*;

public class a_login extends HttpServlet
{
    public void doPost(HttpServletRequest req,
            HttpServletResponse res)throws IOException,
            ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        String a_id=req.getParameter("n1");
        String a_pass=req.getParameter("n2");
       
        try
       {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","pass1");
                   Statement stmt=con.createStatement();
                   
                    String q1="select a_id from a_db where a_id= '"+a_id+"' ";
                    
                    ResultSet rs1=stmt.executeQuery(q1);
                    
                    
                    if(rs1.next())
                    {
                        
                    String q2="select a_pass from a_db where a_pass= '"+a_pass+"' ";
                    
                    ResultSet rs2=stmt.executeQuery(q2);
                    
                    
                    if(rs2.next())
                    {
                    //here rs is a name given to the cursor
                 
                   
                            pw.println("<html>\n" +
"    <head>\n" +
"        <title></title>\n" +
"        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
"    </head>\n" +
"    <body>\n" +
"       <a href=\"a_login.jsp\"><img src=\"login.jpg\"></a>\n"   +    
"    </body>\n" +
"</html>\n" +
"\n" +
"\n" +
"\n" +
"");
                    }  
                    }
                    
                     else
                   {
                              pw.println("<html>\n" +
"    <head>\n" +
"    </head>\n" +
"    <body>\n" +
 "       <a href=\"a_login.jsp\"><img src=\"login.jpg\"></a>\n"   +                                     
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
               pw.println("Some Error Occured");
           
           }
    }
}