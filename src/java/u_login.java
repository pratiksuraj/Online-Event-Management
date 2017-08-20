/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
 
import java.sql.*;
import static java.sql.JDBCType.NULL;
import javax.servlet.*;
import javax.servlet.http.*;

public class u_login extends HttpServlet
{
    public void doPost(HttpServletRequest req,
            HttpServletResponse res)throws IOException,
            ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        String e_id=req.getParameter("n1");
        String e_pass=req.getParameter("n2");
       
        
        try
        {
            HttpSession ses=req.getSession();
            //when the request is comming
            //Establishing a session
            ses.setAttribute("nm1",e_id);
            //It stores the string in encrypted format
            String s1= (String)ses.getAttribute("nm1");
            pw.println(s1);
          
        }
        catch(Exception e)
        {
            
        }
        try
       {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","pass1");
                   Statement stmt=con.createStatement();
                   
                    String q1="select e_id from u_db where e_id= '"+e_id+"' ";
                    
                    ResultSet rs1=stmt.executeQuery(q1);
                    
                    
                    if(rs1.next())
                    {
                        
                    String q2="select u_pass from u_db where u_pass= '"+e_pass+"' ";
                    
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
"       <a href=\"l_home.jsp\"><img src=\"login.jpg\"></a>\n"   +    
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