/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servlets;

import ConexionBD.Procedimientos;
import beans.BaseDatos;
import beans.Carrera;
import beans.Carreras;
import beans.Catalogos;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ElyyzZ BaRruEtA
 */
public class CargaEstado extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
        List<BaseDatos> municipio;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            try 
            {
                Catalogos cat= new  Catalogos();
                response.setContentType("text/html;charset=UTF-8");
                PrintWriter out = response.getWriter();
                String pk = request.getParameter("pk");
                Carreras c= new  Carreras();
               int  foranea=Integer.parseInt(pk);
                String  usuario="desarrollo";
                String  pass="d3s4rr0ll0";
                Procedimientos p= new  Procedimientos();
                municipio=p.getCatalogos(usuario, pass, 3, foranea);
                municipio=cat.AgregaS(municipio);
                String estados=c.ConvertirJson(municipio);
                System.out.println(estados);
                out.println("{" + estados + "]}");
                
            } catch (SQLException ex) {
                Logger.getLogger(CargaEstado.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CargaEstado.class.getName()).log(Level.SEVERE, null, ex);
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
