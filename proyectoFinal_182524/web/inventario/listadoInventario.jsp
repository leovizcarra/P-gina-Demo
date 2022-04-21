<%-- 
    Document   : listadoInventario
    Created on : 14/07/2021, 01:59:36 PM
    Author     : Leo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <link href="../css/estilo.css" rel="stylesheet" type="text/css"/> <!-- -->
        <link rel="icon" type="image/png" href="../img/favicon.png"/>    
        <title>Menú - Inventario</title> <!-- -->
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
                <li><a href="../control?tarea=inventariar">Inventariar</a></li>
                <li><a href="../control?tarea=desinventariar">Desinventariar</a></li>
            </ul>
        </nav>

        <article>
            <table border="1">
                <thead>
                    <tr>
                        <th>No. Catalogo</th>
                        <th>Existencia</th>
                        <th>Disponibilidad</th>
                    </tr>
                </thead>

                <tbody>
                    <c:forEach var="inventario" items="${lista}">
                        <tr>
                            <td><c:out value="${inventario.numCatalogo}"></c:out></td>
                            <td><c:out value="${inventario.existencia}"></c:out></td>    
                            <td><c:out value="${inventario.disponibilidad}"></c:out></td>
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
