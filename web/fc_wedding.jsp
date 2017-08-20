<%@page import="java.sql.* " %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <title>Marriage</title>
        
	<link rel="stylesheet" type="text/css" href="about.css" />
      <SCRIPT type="text/javascript">     window.history.forward();     function noBack() { window.history.forward(); } </SCRIPT> 

	
    </head>
    <body bgcolor="orange" onload="noBack();"    onpageshow="if (event.persisted) noBack();" onunload="">
        
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
            
            <br><br><br><br><br>
        <h2>
        <% 
        
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","project","pass1");
                             
                     
        String dd_date=request.getParameter("n1");
        String mm_date=request.getParameter("n9");
        String yyyy_date=request.getParameter("n10");
        
        String b_date=dd_date+mm_date+yyyy_date;
        
        String venue=request.getParameter("n2");
        String theme=request.getParameter("n3");
        String decoration =request.getParameter("n4");
        String sound=request.getParameter("n5");
        String person=request.getParameter("n6");
        int n_person = Integer.parseInt(person);
        String v_catering =request.getParameter("n7");
        String nv_catering=request.getParameter("n8");
        
        
        String nm1=request.getParameter("n1");
        HttpSession ses=request.getSession();
        String s1= (String)ses.getAttribute("nm1");
        
        try
       {
           
           out.println("User entered details <br>");
             out.println("<br>Booking Date <br>"+b_date);
             out.println("<br><br>Venue <br>"+venue);
             out.println("<br><br>Theme <br>"+theme);
             out.println("<br><br>Decoration <br>"+decoration);
             out.println("<br><br>Sound <br>"+sound);
             out.println("<br><br>No. of expected Person <br>"+person);
             out.println("<br><br>Catering Veg <br>"+v_catering);
             out.println("<br><br>Catering Non-veg <br>"+nv_catering);  
             
          }
           catch(Exception e)
           {
               out.println("Unsuccessfull Record Entry <br> please try again");
           
           }   
           
            try
             {

                Statement stmt=con.createStatement();
                String q1="select venue from d_"+b_date+" where venue= '"+venue+"' ";
                int x=stmt.executeUpdate(q1);
                
         
                
                if(x==0)
                {
                String q2="insert into d_"+b_date+" values ("+b_date+",'"+venue+"','Booked') ";
                int y=stmt.executeUpdate(q2);
                
                String q7="select * from u_db where e_id='"+s1+"' ";
                    out.println("<br><br>Your e_id is:<br>"+s1);
                     ResultSet rs7=stmt.executeQuery(q7); 
                     String b;
                     String contact;                     
                     while(rs7.next())
                     {
                      b=rs7.getString(1);
                      contact=rs7.getString(5);
                      out.println("<br><br>"+b+" your booking is successful<br>");
                      
                      String q4="create table "+b+""+contact+" (b_date varchar2(10),venue varchar2(30) primary key not null,status varchar2(30))";
                        int p=stmt.executeUpdate(q4);
                
                     String q5="insert into "+b+""+contact+" values ("+b_date+",'"+venue+"','Booked') ";
                     int s=stmt.executeUpdate(q5);
                     }
               
               
                out.println("<br><br>Your booking is successful<br>");
                
                 String q3="select b_charges from c_db where c_name= '"+venue+"' ";
                int b_charges=stmt.executeUpdate(q3);
                 
                if(b_charges>0)
                {
                    b_charges=50000;
                }
                if("Yes".equals(decoration))
                 {
                     b_charges=b_charges+10000;
                 }
                if("Yes".equals(sound))
                 {
                     b_charges=b_charges+10000;
                 }
                
                if(("Yes".equals(v_catering)) && "Yes".equals(nv_catering))
                 {
                    b_charges=b_charges+(n_person*250);
                     out.println("<br>Your booking charges:"+b_charges);
                 }
                else if("Yes".equals(v_catering))
                 {
                     b_charges=b_charges+(n_person*100);
                  
                     out.println("<br>Your booking charges:"+b_charges);
                 }
                else if("Yes".equals(nv_catering))
                 {
                     b_charges=b_charges+(n_person*150);
                    
                     out.println("<br>Your booking charges:"+b_charges);
                 }
               
                }
                
                
                
                else
                {
                    out.println("<br><br>The requested venue is pre booked on this day pls try some other venue<br>");
                }
             }
             
             catch(Exception e)
             {
               
               Statement stmt=con.createStatement();
               
                          
                    
                String q7="select * from u_db where e_id='"+s1+"' ";
                    out.println("<br><br>Your e_id is:<br>"+s1);
                     ResultSet rs7=stmt.executeQuery(q7); 
                     String b;
                     String contact;                     
                     while(rs7.next())
                     {
                      b=rs7.getString(1);
                      contact=rs7.getString(5);
                      out.println("<br><br>"+b+" your booking is Successful<br>");
                      
                      String q33="create table "+b+""+contact+" (b_date varchar2(10),venue varchar2(30) primary key not null,status varchar2(30))";
                       int p=stmt.executeUpdate(q33);
                
                        String q34="insert into "+b+""+contact+" values ("+b_date+",'"+venue+"','Booked') ";
                     int s=stmt.executeUpdate(q34);
                     }
               
                
                
               
                String q1="create table d_"+b_date+" (b_date varchar2(10),venue varchar2(30) primary key not null,status varchar2(30))";
                int x=stmt.executeUpdate(q1);
                
                String q2="insert into d_"+b_date+" values ("+b_date+",'"+venue+"','Booked') ";
                int y=stmt.executeUpdate(q2);
                
                 String q3="select b_charges from c_db where c_name= '"+venue+"' ";
                int b_charges=stmt.executeUpdate(q3);
                 
                if(b_charges>0)
                {
                    b_charges=50000;
                }
                if("Yes".equals(decoration))
                 {
                     b_charges=b_charges+10000;
                 }
                if("Yes".equals(sound))
                 {
                     b_charges=b_charges+10000;
                 }
                
                if(("Yes".equals(v_catering)) && "Yes".equals(nv_catering))
                 {
                    b_charges=b_charges+(n_person*250);
                     out.println("<br>Your booking charges:"+b_charges);
                 }
                else if("Yes".equals(v_catering))
                 {
                     b_charges=b_charges+(n_person*100);
                  
                     out.println("<br>Your booking charges:"+b_charges);
                 }
                else if("Yes".equals(nv_catering))
                 {
                     b_charges=b_charges+(n_person*150);
                    
                     out.println("<br>Your booking charges:"+b_charges);
                 }
               
                
             
                
             } 
 
      
        %>
    <br>
        <a href="Home.jsp">Back</a>
        </h2>
        </body>
</html>
