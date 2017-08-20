<%-- 
    Document   : lhome
    Created on : Jul 26, 2017, 1:59:36 AM
    Author     : PRATIK SURAJ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Stellar</title>
        
	<link rel="stylesheet" type="text/css" href="Home_c.css" />
      
	
    </head>
    <body bgcolor="orange">
        
        <pre>
<a href="u_register.html"><marquee DIRECTION="RIGHT" BEHAVIOR="ALTERNATE" SCROLLAMOUNT="8"><img src="bg_register.jpg" height="600" width="50%" > </a>  <a href="u_login.html"><img src="bg_login.jpg" height="600" width="50%" ></marquee></a>
        </pre>
        <div id="header">  
<div id="headbar">
<h1 >STELLAR</h1> 
<div id="logo"><img src="logo.jpg" height="100" width="100" >
    
    </div>


<h2 id="head1">Come Celebrate with Us
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="Home.html">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="about.html">About</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="Home.html">Our Experts</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="career.html">Careers</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="contact_us.html">Contact Us</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<% 
            try
        {
             String nm1=request.getParameter("n1");
            HttpSession ses=request.getSession();
            String s1= (String)ses.getAttribute("nm1");

            out.println(s1);
        }
        catch(Exception e)
        {
            
        }
      
            %>

</h2>     
    </div>
      <div id="image"> <marquee BEHAVIOR="ALTERNATE" SCROLLAMOUNT="11"> <img src="royal-wedding.jpg" height="400" width="100%" > <img src="Birthday-Parties.jpg" height="400" width="100%" > <img src="sports.jpg" height="400" width="100%" > <img src="inauguration.jpg" height="400" width="100%" > <img src="award show.jpg" height="400" width="100%" > <img src="anniversary.jpg" height="400" width="100%" > <img src="parties.jpg" height="400" width="100%" > <img src="bussiness meetup.jpg" height="400" width="100%" > </marquee> </div> 
      
      </div>
        
          
            
        <H1><b><font color="mediumvioletred">Categories of Events</H1>
        <Table border="0" cellspacing="5" align="center">
            <tr>
                <td > <a href="wedding.html" title="Marriage"> <img src="wedding.jpg" height="400" width="400"> </a>>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                <td > &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="birthday.html" title="Birthday"><img src="birthday.jpg" height="400" width="400" > </a></td>
            </tr>
        </table>


<br><br><br><b><br><br><br><br><br><br><br><br>
<a href="Home.html" title="Go to Top"><img src="top.jpg" width="50" height="50"></a>
    <table border="0" bgcolor="black" width="100%" cellspacing="0" height="80">
       
        <tr>
            <td></td>
            <td></td>
            <td> <h3><a href="l_home.html"><font color="white">Booking History</a></h3> </td>
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
            <td><h3><a href="a_login.html"><font color="white">Admin Login</a></h3></td>
            
            
            <td align="right"> <h3><font color="white">Copyright 2017 | All Rights Reserved. Designed by P4</h3> </td>
        </tr>
    </table>
        </body>
</html>