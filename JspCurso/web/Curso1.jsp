<%-- 
    Document   : Curso1
    Created on : 2 de ago. de 2023, 23:44:07
    Author     : italo
--%>

<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%out.println("italo mauricio");  %>
        <%--coments --%>
        <p>Data: <%= new Date()%></p>
        <%! int contador = 0; %>
        <p>Visitas: <%= contador++%></p>
    </body>
</html>
