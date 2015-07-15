<%-- 
    Document   : index
    Created on : 10-03-2014, 09:11:24 AM
    Author     : neto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi primer aplicación con JAVA EE</title>
    </head>
    <body>
        <h1 style="color:red" >0<c:out value="Bienvenidos al Curso de JSP" /></h1>
        <h1>Hola Bienvenidos a nuestro curso de JEE</h1>
        <form action="holaMundo" method="POST">
            <label>Nombre</label><input type="text" required="true" name="nombre" id="nombre" value="" />
            <input type="submit" value="Enviar" />
        </form>
    </body>
</html>
