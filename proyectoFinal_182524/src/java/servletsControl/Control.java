/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletsControl;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Leo
 */
@WebServlet(name = "control", urlPatterns = {"/control"})
public class Control extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String tarea = request.getParameter("tarea"); //Se declara un string encargado de recibir el tipo de tarea
            String accion = request.getParameter("accion"); //Se declara un string encargado de recibir la accion de la tarea

            switch (tarea) {
                case "listarClientes":
                    response.sendRedirect("listarClientes");
                    break;
                case "agregaCliente":
                    response.sendRedirect("clientes/agregarCliente.html");
                    break;
                case "actualizarCliente":
                    response.sendRedirect("actualizaCliente");
                    break;
                case "buscaCliente":
                    response.sendRedirect("clientes/buscaCliente.html");
                    break;
                case "listarVideojuegos":
                    response.sendRedirect("listarVideojuegos");
                    break;
                case "agregaVideojuego":
                    response.sendRedirect("videojuegos/agregarVideojuego.html");
                    break;
                case "actualizarVideojuego":
                    response.sendRedirect("actualizaVideojuego");
                    break;
                case "buscaVideojuego":
                    response.sendRedirect("videojuegos/buscaVideojuego.html");
                    break;
                case "listarInventario":
                    response.sendRedirect("listarInventario");
                    break;
                case "inventariar":
                    response.sendRedirect("inventariar");
                    break;
                case "desinventariar":
                    response.sendRedirect("desinventariar");
                    break;
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
