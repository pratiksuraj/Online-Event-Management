<%-- 
    Document   : logout
    Created on : Jul 29, 2017, 1:00:08 PM
    Author     : PRATIK SURAJ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <SCRIPT type="text/javascript">
	window.history.forward();
	function noBack() { window.history.forward(); }
</SCRIPT>
    </head>
    <body bgcolor="orange" onload="noBack();" 
	onpageshow="if (event.persisted) noBack();" onunload="">
        <%
             session.setAttribute("nm1", null);
            session.removeAttribute("nm1");
            response.sendRedirect("logout2");
            %>
    </body>
</html>
