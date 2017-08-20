/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
 
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class wedding extends HttpServlet
{
    public void doPost(HttpServletRequest req,
            HttpServletResponse res)throws IOException,
            ServletException
    {
        res.setContentType("text/html");
        PrintWriter pw1=res.getWriter();
        String date=req.getParameter("n1");
        String venue=req.getParameter("n2");
        String theme=req.getParameter("n3");
        String decoration =req.getParameter("n4");
        String sound=req.getParameter("n5");
        String person=req.getParameter("n6");
        String v_catering =req.getParameter("n7");
        String nv_catering=req.getParameter("n8");
       
        try
       {
             pw1.println("Registration Successfull"+date);
             pw1.println("Registration Successfull"+venue);
             pw1.println("Registration Successfull"+theme);
             pw1.println("Registration Successfull"+decoration);
             pw1.println("Registration Successfull"+sound);
             pw1.println("Registration Successfull"+person);
             pw1.println("Registration Successfull"+v_catering);
             pw1.println("Registration Successfull"+nv_catering);
             
             
             
             
          }
           catch(Exception e)
           {
               pw1.println(e);
           
           }
        
        
        
        
        
    }
}    


