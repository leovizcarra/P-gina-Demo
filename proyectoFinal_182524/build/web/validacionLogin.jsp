<%-- 
    Document   : validacionLogin
    Created on : 11/07/2021, 01:13:32 PM
    Author     : Leo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Validando...</title>
    </head>
    <body>
        <%
            if (session.getAttribute("usuario") == null) { //If encargado de verificar que exista un usuario, en caso de que por alguna vulnerabilidad se haya logrado omitir el login
                response.sendRedirect("index.html"); //Si existe un usuario valido, se redirecciona a el menu principal del sitio
            } else {
                response.sendRedirect("menuPrincipal.html"); //Si no existe un usuario valido, se redirecciona al login nuevamente
            }
        %>
    </body>
</html>
