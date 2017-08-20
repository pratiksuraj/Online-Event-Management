<%-- 
    Document   : a_login
    Created on : Jul 30, 2017, 8:25:59 AM
    Author     : PRATIK SURAJ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.* " %>
<!DOCTYPE html>
<html>
    <head>
        <title>A_LOGIN</title>
        <link rel="stylesheet" type="text/css" href="about.css" />
    </head>
   <body bgcolor="orange">
       
<div id="headbar"> 
<h1>STELLAR</h1> 
<div id="logo"><img src="logo.jpg" height="100" width="100" >
<h2 id="head1">
    Come Celebrate with Us
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="Home.html">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="about.html">About</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="our_experts.html">Our Experts</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="Careers.html">Careers</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="contact_us.html">Contact Us</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</h2> 
    
     </div>
     </div>
       <br><br><br><br>
       <h1><FONT size="10" color="mediumvioletred"> Booking Details </font></h1>      
<h3>
       <%
           try
           {
            Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","pass1");
                   Statement stmt=con.createStatement();
                
                                
        String dd_date=request.getParameter("n1");
        String mm_date=request.getParameter("n9");
        String yyyy_date=request.getParameter("n10");
        
        String b_date=dd_date+mm_date+yyyy_date;
        
                   String q1="select * from d_"+b_date+" ";
                    
                     ResultSet rs=stmt.executeQuery(q1);
                
                     int c=1;
                     while(rs.next())
                        //next check the next record is present or not
                    {
                        out.println("<br><br>"+c+". The Date of Booking is :" +rs.getString(1));
                        out.println("<br><br>"+c+". The Venue name is :" +rs.getString(2));
                        out.println("<br><br>"+c+". The Status is :" +rs.getString(3));
                        
                        
                        
                        
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
           
           
           %>
</h3>
     


<a href="Home.html" title="Go to Top"><img src="top.jpg" width="50" height="50"></a>
    <table border="0" bgcolor="black" width="100%" cellspacing="0" height="80">
       
        <tr>
            <td></td>
            <td></td>
            <td> <h3><a href="a_login.html"><font color="white">Admin Login</a></h3> </td>
            <td> <h3><a href="c_register.html"><font color="white">Register your Company</a></h3> </td>
            <td> <h3><a href="c_login.html"><font color="white">Contact Us</a></h3> </td>
        </tr>
        <tr>
            
            <td><h1><font color="white">Follow Us on </h1></td>
            <td></td>
            <td></td>
            <td><h3><a href="Home.html"><font color="white">Company Login</a></h3></td>
            <td> <h3><a href="careers.html"><font color="white">Careers</a></h3> </td>
        </tr>
        <tr>
            
            <td><a href="https://www.facebook.com/pratik.suraj.12" title="Follow us on Facebook"><img src="fb.jpg" width="50" height="50"><a href="https://plus.google.com/u/0/104490409921796032702" title="Follow Us on Google+"><img src="google_plus.jpg" width="50" height="50"></td>
            <td></td>
            <td></td>
            <td></td>
            <td> <h3><a href="https://www.google.co.in/maps/place/Asansol+Engineering+College/@23.7157019,86.9511464,15z/data=!4m5!3m4!1s0x0:0xc2814fdb4c367784!8m2!3d23.7157019!4d86.9511464"><font color="white">Sitemap</a></h3> </td>
        </tr>
        <tr>
            <td></td>
            <td></td>
            
            
            <td align="right"> <h3><font color="white">Copyright 2017 | All Rights Reserved. Designed by P4</h3> </td>
        </tr>
    </table>
        </body>
       
</html>