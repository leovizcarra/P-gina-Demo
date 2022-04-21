<%-- 
    Document   : listadoClientes
    Created on : 12/07/2021, 03:49:14 PM
    Author     : Leo
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                <li><a href="../control?tarea=agregaCliente">Agregar Clientes</a></li>
                <li><a href="../control?tarea=buscaCliente">Buscar Clientes</a></li>
            </ul>
        </nav>
        <article>
            <table border="1">
                <thead>
                    <tr>
                        <th>No. Credencial</th>
                        <th>Nombre</th>
                        <th>Dirección</th>
                        <th>Teléfono</th>
                    </tr>
                </thead>

                <tbody>
                    <c:forEach var="cliente" items="${lista}">
                        <tr>
                            <td><c:out value="${cliente.numCredencial}"></c:out></td>
                            <td><c:out value="${cliente.nombre}"></c:out></td>    
                            <td><c:out value="${cliente.direccion}"></c:out></td>
                            <td><c:out value="${cliente.telefono}"></c:out></td>
                            </tr>
                    </c:forEach> 
                </tbody>
            </table>
        </article>

        <footer> <!-- -->
            Diseñador y programador: Leobardo Vizcarra Valdez
        </footer>
    </body>
</html>
