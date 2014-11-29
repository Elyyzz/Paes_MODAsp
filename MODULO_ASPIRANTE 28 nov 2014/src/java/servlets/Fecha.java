/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import ConexionBD.Conexion;
import ConexionBD.IngresoAbd;
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
import java.util.ArrayList;
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
public class Fecha extends HttpServlet {

    private static final long serialVersionUID = 1L;
    LlenaFecha fe = new LlenaFecha();
    llenarBD bd = new llenarBD();
    List<fecha> dia = fe.llenadia();
    List<fecha> mes = fe.llenames();
    List<fecha> anio = fe.llenaaño();
    List<BaseDatos> estado;
    List<BaseDatos> municipio;
    List<BaseDatos> ClaveCCT;
    List<BaseDatos> NivelEstudios;
    List<BaseDatos> Dependencia;
    List<BaseDatos> Ocupaciones;
    List<BaseDatos> Escuela;

    List<BaseDatos> sangre = bd.llenaSangre();
    List<BaseDatos> pais;
    List<BaseDatos> numero = bd.llenaNumero();
    List<BaseDatos> Ingresos = bd.llenaIngresos();
    List<BaseDatos> promedio = bd.llenaPromedio();

    Carreras carr = new Carreras();
    List<Carrera> opciones = carr.llenaCarrera();
    Catalogos catalogo = new Catalogos();
    List<Carrera> opciones1 = opciones;
    List<Carrera> opciones2 = opciones;
    List<Carrera> opciones3 = opciones;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String correo = request.getParameter("correo");
        Bdatos_aspirante aspirante = new Bdatos_aspirante();
        aspirante.setEmail(correo);
//        String d = request.getParameter("valo");
        String usuario = request.getParameter("usuario");
        String pass = request.getParameter("pass");
        Procedimientos p = new Procedimientos();
//        Conexion c=new  Conexion(usuario, pass);
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
        session.setAttribute("mes", mes);
        session.setAttribute("dia", dia);
        session.setAttribute("anio", anio);
        session.setAttribute("estado", estado);
        session.setAttribute("sangre", sangre);
        session.setAttribute("pais", pais);
        session.setAttribute("municipio", municipio);
//        session.setAttribute("ClaveCCT", ClaveCCT);
        session.setAttribute("opciones1", opciones1);
        session.setAttribute("opciones2", opciones2);
        session.setAttribute("opciones3", opciones3);
        session.setAttribute("promedio", promedio);
//        session.setAttribute("numero", numero);
//        session.setAttribute("Ingresos", Ingresos);
//        session.setAttribute("Dependencia", Dependencia);
//        session.setAttribute("Ocupaciones", Ocupaciones);
//        session.setAttribute("NivelEstudios", NivelEstudios);
        session.setAttribute("Escuela", Escuela);

//        session.setAttribute("aspirante", aspirante);
//        System.out.println(ClaveCCT.get(0).getClave());
//        System.out.println(ClaveCCT.get(0).getNombre());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

    }

}