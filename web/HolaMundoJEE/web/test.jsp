<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@page language="java" contentType="text/html" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1><h:outputText value="Hello World!"/></h1>
        <%
            out.println("<br/>Your IP address is " + request.getRemoteAddr());
        %>
    </body>
</html>

