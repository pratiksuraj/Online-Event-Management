<%-- 
    Document   : wedding
    Created on : Jul 20, 2017, 5:46:05 PM
    Author     : PRATIK SURAJ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.* " %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Marriage</title>
        
	<link rel="stylesheet" type="text/css" href="about.css" />
      
	
    </head>
    <body bgcolor="orange">
        
        <div id="header">  
<div id="headbar">
<h1 >STELLAR</h1> 
<div id="logo"><img src="logo.jpg" height="100" width="100" >
    
    </div>


<h2 id="head1">Come Celebrate with Us
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="l_home.jsp">Home</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
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
%>              
<a href="Home.jsp" title="Click here to logout"><font color="white"><%out.println(s1);%></font></a><%
            
           /* String ss=s1.substring(1, 3);
            out.println(ss);
            session.setAttribute(nm1, null);
            session.removeAttribute(nm1);
            */
        }
        catch(Exception e)
        {
            
        }
      
            %>

</h2>     
    </div>
     
      </div>
        
        <center>
            <br><br><br><br><br>
            
        <img src="wedding.jpg" width="100%" height="400">       
         <h2>
        <form method="post" action="fc_wedding.jsp">
           
    <table  border ="2" align="center" width="100%" height="100" bgcolor="white" cellpadding="10" cellspacing="10">
    
    <tr> <td  align="center">Date of Wedding</td>
       <td >
           <table><td><input type="text" name="n1" placeholder="DD" required></td>
        <td ><input type="text" name="n9" placeholder="MM" required></td>
    <td ><input type="text" name="n10" placeholder="YYYY" required></td></table></tr>
        
        <tr><td align="center">
        <label>Wedding Venue:</label> </td>
            
        <td > <select name="n2">
            <option value="-1" >Venues</option>
            <%
                
                try
                {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","pass1");
                   Statement stmt=con.createStatement();
                   
                    String q1="select c_name from c_db";
                    
                    ResultSet rs=stmt.executeQuery(q1);
                    
                    while(rs.next())
                    {
                        %>
                        
                        <option value="<%=rs.getString("c_name")%>" ><%=rs.getString("c_name")%></option>
                        
                        <%
                    }
                    
                }
                
                catch(Exception e)
                {
                            
                }
                
                
             %>
        </select>
        </td>
        
         <tr><td align="center">Theme of Wedding :</td><td><input type ="radio" name="n3" VALUE="Royal" CHECKED>Royal <br><input type ="radio" name="n3" VALUE="Vintage">Vintage</td></tr>
        
        <tr><td align="center">Decoration:</td><td><input type ="radio" name="n4" VALUE="Yes" CHECKED>Yes <br><input type ="radio" name="n4" VALUE="No">No</td></tr>
        
        <tr><td align="center">Sound System:</td><td><input type ="radio" name="n5" VALUE="Yes" CHECKED>Yes <br><input type ="radio" name="n5" VALUE="No">No</td></tr>
        
        <tr><td align="center">Expected number of people :</td><td><input type ="text" name="n6" ></td></tr>
        
        <tr><td align="center">Catering Service:</td><td><input type ="checkbox" name="n7" VALUE="Yes" >Vegetarian <br><input type ="checkbox" name="n8" VALUE="Yes">Non-Vegetarian</td></tr>
        
        
        <tr><td colspan ="2" align="center">&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="Submit"></td></tr>
</table>
</form>
    
 </h2>
        </center>
    </body>
</html>
