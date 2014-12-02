package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"JQueryClases/jquery-1.11.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"JQueryClases/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"JQueryClases/jquery.validate.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"JQueryClases/PAES_js.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"JQueryClases/shadowbox.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"Estilos/PAES_css.css\" media=\"all\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Estilos/css/shadowbox.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Estilos/lookandfeel_tec.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Estilos/css/bootstrap-theme.min.css.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Estilos/css/bootstrap.min.css.css\" type=\"text/css\">     \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\".tooltip-examples a\").tooltip({\n");
      out.write("                    placement: 'top'\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("        <title>--MÓDULO ASPIRANTE--</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a name=\"InicioPag\"></a>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"encabezado\">\n");
      out.write("                <img alt=\"la imagen\" src=\"Imagenes/header_ittoluca.png\" title=\"footer\">                \n");
      out.write("            </div>\n");
      out.write("            <h1>M&oacute;dulo del registro de aspirantes</h1><br><br>\n");
      out.write("        </header>        \n");
      out.write("        <div id=\"contenido\">\n");
      out.write("            <div class=\"Contenido_menu\" id=\"grande\">\n");
      out.write("                <div id=\"Contenedor_Bienvenido\">\n");
      out.write("                    <br>\n");
      out.write("                    <!--llenar aqui-->\n");
      out.write("                    <div id=\"carrera\" class=\"demo ui-tabs ui-widget ui-corner-all tooltip-examples\">\n");
      out.write("                        <div id=\"pestana_carrera\">\n");
      out.write("                            <ul id=\"ul_carrera\" class=\"ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all\" role=\"tablist\">\n");
      out.write("                                <li id=\"li_carrera\" class=\"ui-state-default ui-corner-top ui-tabs-selected ui-state-active\">\n");
      out.write("                                    <a class=\"ui-tabs-anchor\" role=\"presentation\" tabindex=\"-1\">Registro del aspirante</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                            <label id=\"centrar_inf\"><h4>Para realizar su solicitud de registro como aspirante, asegurate de contar con lo siguientes datos y documentos.</h4></label>\n");
      out.write("                            <ul id=\"sangria\">\n");
      out.write("                                <li>Clave CURP<a href=\"http://consultas.curp.gob.mx/CurpSP/\"target=\"_blank\"><div id=\"aqui\">consultar aquí</div></a></li>\n");
      out.write("                                <li>Clave de la escuela de procedencia<a href=\"http://www.snie.sep.gob.mx/SNIESC/\" target=\"_blank\"><div id=\"aqui_escuela\">consultar aquí</div></a></li>\n");
      out.write("                                <li><div id=\"link_toolt\"><a data-toggle=\"tooltip\" data-original-title=\"Federal, Estatal, Privada\"  >Tipo de la escuela de procedencia</a></div></li>\n");
      out.write("                                <li>Tipo de sangre</li>\n");
      out.write("                                <li>Acta de nacimiento</li>\n");
      out.write("                            </ul>\n");
      out.write("                            <label id=\"centrar\">\n");
      out.write("                                <h5>\n");
      out.write("                                    Es responsabilidad del aspirante, una vez que haya sido aceptado, entregar todos los requisitos solicitados por servicios escolares en su inscripci&oacute;n, entre ellos el certificado de bachillerato o constancia de haber concluido el bachillerato, especificando que el certificado se encuentra en tr&aacute;mite, de lo contrario <u>NO PROCEDER&Aacute; SU INSCRIPCI&Oacute;N.</u>\n");
      out.write("                                </h5>\n");
      out.write("                            </label>\n");
      out.write("\n");
      out.write("                            <br>\n");
      out.write("                            <div id=\"Contenido_atencion\">\n");
      out.write("                                <h2>ATENCI&Oacute;N</h2> \n");
      out.write("                                <label>\n");
      out.write("                                    <h4>Es responsabilidad del aspirante ver que los datos de su registro sean ver&iacute;dicos <br></h4>\n");
      out.write("                                </label>\n");
      out.write("                            </div>\n");
      out.write("                            <label id=\"centrar\"><h4>Para ver el seguimiento de su proceso de registro como aspirante entre a la opci&oacute;n de \"Seguimiento\"</h4></label>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        <div id=\"Contenedor_radioButton\">\n");
      out.write("                            <label>\n");
      out.write("                                <h5><input id=\"comprobar\" type=\"checkbox\">He le&iacute;do &eacute;sta informaci&oacute;n. <br></h5>\n");
      out.write("                            </label>\n");
      out.write("                            <br>\n");
      out.write("                            <a> <label><input id=\"heleido\" type=\"button\" class=\"btn btn-info\" value=\"Aceptar\" style=\"display: none\"></label></a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div id=\"cargando\">\n");
      out.write("                            <div class=\"spinner-wave\">\n");
      out.write("                                <div></div>\n");
      out.write("                                <div></div>\n");
      out.write("                                <div></div>\n");
      out.write("                                <div></div>\n");
      out.write("                                <div></div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"contiene_opciones\">\n");
      out.write("                    <h4>Opciones</h4>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"Menu_desplegable\" class=\"Texto_centro\">\n");
      out.write("                    <ul>\n");
      out.write("                        <br>\n");
      out.write("                        <li id=\"inicio\">\n");
      out.write("                            <h3><span></span>Inicio</h3>\n");
      out.write("                        </li>\n");
      out.write("                        <li id=\"recuperar\">\n");
      out.write("                            <h3><span></span>Recuperar Preficha</h3>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li id=\"seguimiento\">\n");
      out.write("                            <h3><span></span>Seguimiento</h3>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li id=\"preguntas\">\n");
      out.write("                            <h3><span></span>Preguntas frecuentes</h3>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li id=\"ayuda\">\n");
      out.write("                            <h3><span></span>Ayuda</h3>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li id=\"contacto\">\n");
      out.write("                            <h3><span></span>Contacto</h3>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <br>\n");
      out.write("                    <img width=\"90%\" height=\"20%\" alt=\"la imagen\" src=\"Imagenes/imagen_itt_1.jpg\" title=\"footer\">                \n");
      out.write("                    <img width=\"90%\" height=\"18%\" alt=\"la imagen\" src=\"Imagenes/imagen_itt_2.jpg\" title=\"footer\">                \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("        </div>\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"pieDePagina\"><br><br>\n");
      out.write("                <label class=\"texto_inferior\">\n");
      out.write("                    Instituto Tecnol&oacute;gico de Toluca | www.ittoluca.edu.mx\n");
      out.write("                    <br>\n");
      out.write("                    Instituto Tecnol&oacute;gico de Toluca - Algunos derechos reservados © 2014\n");
      out.write("                    <br>\n");
      out.write("                </label>\n");
      out.write("                <br>\n");
      out.write("                <img width=\"940\" height=\"88\" alt=\"\" src=\"Imagenes/footer_ittoluca.png\" title=\"footer\">\n");
      out.write("                <br>\n");
      out.write("                <label class=\"texto_inferior\">\n");
      out.write("                    Av. Tecnol&oacute;gico s/n. Fraccionamiento La Virgen\n");
      out.write("                    <br>\n");
      out.write("                    Metepec, Edo. De M&eacute;xico, M&eacute;xico C.P. 52149\n");
      out.write("                    <br>\n");
      out.write("                    tel. (52) (722) 2 08 72 00\n");
      out.write("                </label>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
