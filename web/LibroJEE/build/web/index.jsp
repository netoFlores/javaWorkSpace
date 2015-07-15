<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" contentType="text/html" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            out.println("Su direccion ip es " + request.getRemoteAddr());
            String userAgent = request.getHeader("user-agent");
            String browser = "Desconocido";
            
            out.print("<br/> y su navegador es: ");
            if(userAgent != null){
                if(userAgent.indexOf("MSIE") > -1){
                    browser = "MS Internet Explorer";
                }else if(userAgent.indexOf("Firefox") > -1){
                    browser = "Mozilla Firefox";
                }else if(userAgent.indexOf("Opera") > -1){
                    browser = "Opera";
                }else if(userAgent.indexOf("Chrome") > -1){
                    browser = "Google Chrome";
                }else if(userAgent.indexOf("Safari") > -1){
                    browser = "Apple Safari";
                }
            }
            out.println(browser);
        %>
    </body>
</html>
