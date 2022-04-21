<%-- 
    Document   : eliminaCliente
    Created on : 12/07/2021, 03:49:42 PM
    Author     : Leo
--%>
<%@page import="servletsClientes.Cliente"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <link href="../css/estilo.css" rel="stylesheet" type="text/css"/> <!-- -->
        <link rel="icon" type=".image/png" href="../img/favicon.png"/>    
        <title>Menú - Clientes</title> <!-- -->
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <header> <!-- -->
            <h1><a href="../menuPrincipal.html">Videocentro</a></h1> <!-- -->
        </header>
        <nav> <!-- -->
            <ul>
                <li><a href="../menuPrincipal.html" >Inicio</a></li>
                <li><a href="../control?tarea=agregarCliente">Agregar Clientes</a></li>
                <li><a href="../control?tarea=listarClientes">Listado de Clientes</a></li>
                <li><a href="../control?tarea=buscaCliente">Buscar Clientes</a></li>
            </ul>
        </nav>
        <article>
            <form action="../eliminarCliente" method="POST" autocomplete="off">
                <table border="1">
                    <tr>
                        <td>No. Credencial</td>
                        <td>
                            <input name="numCredencial" value="<c:out value="${cliente.numCredencial}" />" maxlength="10" readonly="readonly">
                        </td>
                    </tr>
                    <tr>
                        <td>Nombre</td>
                        <td><input name="nombre" value="<c:out value="${cliente.nombre}" />" maxlength="35" readonly="readonly"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Dirección</td>
                        <td><input name="direccion" value="<c:out value="${cliente.direccion}" />" maxlength="35" readonly="readonly"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Teléfono</td>
                        <td><input name="telefono" value="<c:out value="${cliente.telefono}" />" maxlength="10" readonly="readonly"/>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="4">
                            <input type="submit" value="Eliminar" name="btnEliminar" />
                        </td>
                    </tr>
                </table>
            </form>
        </article>

        <footer> <!-- -->
            Diseñador y programador: Leobardo Vizcarra Valdez
        </footer>
    </body>
</html>
