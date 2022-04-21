/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servletsVideojuegos;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Leo
 */
@WebServlet(name = "agregarVideojuego", urlPatterns = {"/agregarVideojuego"})
public class AgregarVideojuego extends HttpServlet {

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

            String numCatalogo = request.getParameter("numCatalogo");
            String titulo = request.getParameter("titulo");
            String genero = request.getParameter("genero");
            String clasificacion = request.getParameter("clasificacion");
            String consola = request.getParameter("consola");
            String fabricante = request.getParameter("fabricante");
            int version = Integer.parseInt(request.getParameter("version"));

            VideojuegoDAO videojuegoDao = new VideojuegoDAO();
            Videojuego videojuego = new Videojuego(numCatalogo, titulo, genero, clasificacion, consola, fabricante, version);

            try {

                videojuegoDao.agregarVideojuegos(videojuego);
                List<Videojuego> listaVideojuego = videojuegoDao.listarVideojuegos();

                HttpSession session = request.getSession();
                session.setAttribute("lista", listaVideojuego);
                response.sendRedirect("videojuegos/listadoVideojuegos.jsp");
            } catch (IOException e) {
                response.sendRedirect("videojuegos/agregarVideojuego.html");
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
