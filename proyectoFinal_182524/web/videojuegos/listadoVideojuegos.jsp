<%-- 
    Document   : listadoVideojuegos
    Created on : 12/07/2021, 03:52:59 PM
    Author     : Leo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <link href="../css/estilo.css" rel="stylesheet" type="text/css"/> <!-- -->
        <link rel="icon" type="image/png" href="../img/favicon.png"/>    
        <title>Menú - Videojuegos</title> <!-- -->
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
                <li><a href="../control?tarea=agregaVideojuego">Agregar Videojuegos</a></li>
                <li><a href="../control?tarea=buscaVideojuego">Buscar Videojuegos</a></li>
            </ul>
        </nav>

        <article>
            <table border="1">
                <thead>
                    <tr>
                        <th>No. Catalogo</th>
                        <th>Título</th>
                        <th>Género</th>
                        <th>Clasificación</th>
                        <th>Consola</th>
                        <th>Fabricante</th>
                        <th>Versión</th>
                    </tr>
                </thead>

                <tbody>
                    <c:forEach var="videojuego" items="${lista}">
                        <tr>
                            <td><c:out value="${videojuego.numCatalogo}"></c:out></td>
                            <td><c:out value="${videojuego.titulo}"></c:out></td>    
                            <td><c:out value="${videojuego.genero}"></c:out></td>
                            <td><c:out value="${videojuego.clasificacion}"></c:out></td>
                            <td><c:out value="${videojuego.consola}"></c:out></td>
                            <td><c:out value="${videojuego.fabricante}"></c:out></td>
                            <td><c:out value="${videojuego.version}"></c:out></td>
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
