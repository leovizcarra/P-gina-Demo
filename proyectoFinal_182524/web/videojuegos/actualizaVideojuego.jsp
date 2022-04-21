<%-- 
    Document   : actualizaVideojuegos
    Created on : 12/07/2021, 03:51:34 PM
    Author     : Leo
--%>
<%@page import="servletsVideojuegos.Videojuego"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                <li><a href="../control?tarea=listarVideojuegos">Listado de Videojuegos</a></li>
                <li><a href="../control?tarea=buscaVideojuego">Buscar Videojuegos</a></li>
            </ul>
        </nav>

        <article>
            <form action="../actualizaVideojuego" method="POST" autocomplete="off">
                <table border="1">
                    <tr>
                        <td>No. Catálogo</td>
                        <td>
                            <input name="numCatalogo" value="<c:out value="${videojuego.numCatalogo}" />" maxlength="10" readonly="readonly">
                        </td>
                    </tr>
                    <tr>
                        <td>Título</td>
                        <td><input name="titulo" value="<c:out value="${videojuego.titulo}" />" maxlength="35" />
                        </td>
                    </tr>
                    <tr>
                        <td>Género</td>
                        <td><input name="genero" value="<c:out value="${videojuego.genero}" />" maxlength="20" />
                        </td>
                    </tr>
                    <tr>
                        <td>Clasificación</td>
                        <td><input name="clasificacion" value="<c:out value="${videojuego.clasificacion}" />" maxlength="20" />
                        </td>
                    </tr>
                    <tr>
                        <td>Consola</td>
                        <td>
                            <input name="consola" value="<c:out value="${videojuego.consola}" />" maxlength="20">
                        </td>
                    </tr>
                    <tr>
                        <td>Fabricante</td>
                        <td>
                            <input name="fabricante" value="<c:out value="${videojuego.fabricante}" />" maxlength="35">
                        </td>
                    </tr>
                    <tr>
                        <td>Versión</td>
                        <td>
                            <input name="version" value="<c:out value="${videojuego.version}" />" maxlength="10">
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="reset" value="Restablecer" name="btnReset" />
                            <input type="submit" value="Actualizar" name="btnActualizar" />
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
