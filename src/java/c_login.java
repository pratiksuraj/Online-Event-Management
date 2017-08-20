/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
 
import java.sql.*;
import static java.sql.JDBCType.NULL;
import javax.servlet.*;
import javax.servlet.http.*;

public class c_login extends HttpServlet
{
    public void doPost(HttpServletRequest req,
            HttpServletResponse res)throws IOException,
            ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        String c_id=req.getParameter("n1");
        String c_pass=req.getParameter("n2");
       
        try
       {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","pass1");
                   Statement stmt=con.createStatement();
                   
                    String q1="select c_id from c_db where c_id= '"+c_id+"' ";
                    
                    ResultSet rs1=stmt.executeQuery(q1);
                    
                    
                    if(rs1.next())
                    {
                        
                    String q2="select c_pass from c_db where c_pass= '"+c_pass+"' ";
                    
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
"       <a href=\"c_login.jsp\"><img src=\"login.jpg\"></a>\n"   +    
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
 "       <a href=\"Home.html\"><img src=\"unsuc.jpg\"></a>\n"   +                                     
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