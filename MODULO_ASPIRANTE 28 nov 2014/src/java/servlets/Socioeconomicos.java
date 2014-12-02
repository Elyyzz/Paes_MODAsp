/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import ConexionBD.Procedimientos;
import beans.BaseDatos;
import beans.Bdatos_aspirante;
import beans.Carrera;
import beans.Carreras;
import beans.Catalogos;
import beans.fecha;
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
import javax.servlet.http.HttpSession;
import modelos.LlenaFecha;
import modelos.llenarBD;

/**
 *
 * @author ElyyzZ BaRruEtA
 */
public class Socioeconomicos extends HttpServlet {

    LlenaFecha fe = new LlenaFecha();
    llenarBD bd = new llenarBD();
    String pass = "fichas";
    String usuario = "fichas";
    List<BaseDatos> estado;
    List<BaseDatos> municipio;
    List<BaseDatos> NivelEstudios;
    List<BaseDatos> Dependencia;
    List<BaseDatos> Ocupaciones;
    List<BaseDatos> Escuela;
    List<BaseDatos> pais;
    List<BaseDatos> numero = bd.llenaNumero();
    List<BaseDatos> Ingresos = bd.llenaIngresos();
    Catalogos catalogo = new Catalogos();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//        String usuario = request.getParameter("usuario");
//        String pass = request.getParameter("pass");
//        System.out.println(usuario + "/" + pass);
        Procedimientos p = new Procedimientos();

        try {
            pais = p.getCatalogos(usuario, pass, 1);
            pais = catalogo.AgregaS(pais);
            estado = p.getCatalogos(usuario, pass, 2);
            estado = catalogo.AgregaS(estado);
            municipio = p.getCatalogos(usuario, pass, 3);
            municipio = catalogo.AgregaS(municipio);
            Escuela = p.getCatalogos(usuario, pass, 8);
            Escuela = catalogo.AgregaS(Escuela);
//            c.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(Fecha.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Fecha.class.getName()).log(Level.SEVERE, null, ex);
        }

        HttpSession session = request.getSession(true);

        session.setAttribute("estado", estado);
        session.setAttribute("pais", pais);
        session.setAttribute("municipio", municipio);;
        session.setAttribute("numero", numero);
        session.setAttribute("Ingresos", Ingresos);
        session.setAttribute("Dependencia", Dependencia);
        session.setAttribute("Ocupaciones", Ocupaciones);
        session.setAttribute("NivelEstudios", NivelEstudios);
        session.setAttribute("Escuela", Escuela);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

    }

}
