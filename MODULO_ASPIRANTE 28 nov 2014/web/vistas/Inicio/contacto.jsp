<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page language="java" import="captchas.CaptchasDotNet" %>
<html>
    <head>
        <script src="JQueryClases/PAES_js.js" type="text/javascript"></script>
        <script src="JQueryClases/Map.js" type="text/javascript"></script>
        <link href="Estilos/css/bootstrap1.css" rel="stylesheet">
        <link href="Estilos/css/style.css" rel="stylesheet">

        <script src="JQueryClases/jquery-1.11.1.min.js" type="text/javascript"></script>
        <script src="JQueryClases/bootstrap.min.js" type="text/javascript"></script>
        <!--<script src="JQueryClases/jquery.validate.min.js" type="text/javascript"></script>-->

        <script src="JQueryClases/jquery-1.9.1.min.js"></script>      
        <script src="JQueryClases/jquery.validate.min.js"></script>        
        <script src="JQueryClases/formulario.js"></script>
        <script src="JQueryClases/ValidaMail.js" type="text/javascript"></script>

        <style type="text/css" media="screen">
            html,body{
                height:100%;
                margin:0%;
                padding:0%;
            }
            #map{
                height:80%;
            }
        </style>

        <script type="text/javascript">
            $(document).ready(function () {
                $(".tooltip-examples a").tooltip({
                    placement: 'top'
                });
            });
        </script>
    </head>
    <%
        CaptchasDotNet captchas = new captchas.CaptchasDotNet(request.getSession(true), "demo", "secret");
    %>
    <body>
        <br>
        <div id="carrera" class="demo ui-tabs ui-widget ui-corner-all">
            <div id="pestana_carrera">
                <ul id="ul_carrera" class="ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all" role="tablist">
                    <li id="li_carrera" class="ui-state-default ui-corner-top ui-tabs-selected ui-state-active">
                        <a class="ui-tabs-anchor" tabindex="-1">Contacto</a>
                    </li>
                </ul>
                <div id="mapa">
                    <h5><b>Direcci&oacute;n: Av. Tecnol&oacute;gico S/N, Fraccionamiento la Virgen, Metepec, Edo, De M&eacute;xico, C.P. 52149</b></h5>
                    
                    <script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false&language=es&callback=iniciar">
                        
                    </script>

                    <div id="map">

                    </div>
                </div>
                <div id="telefono">
                    <div id="panelizquierda"><h4><b>Telefono:</b><br>01 (722) 208 7200 ext. 3051</h4></div>
                    <div id="panelderecha"><img src="Imagenes/Phone-icon.png" alt="Teléfono" width="50" height="50"></div> 
                </div>
                <div id="mail" class="ui-corner-all tooltip-examples">
                    <div id="panelizquierda"><h4><b>Email:</b><br><a data-toggle="tooltip" data-original-title="Envianos tus dudas y comentarios. Nosotros te responderemos"  href="#" onclick="lightbox_open_correo();">aspirantes@ittoluca.edu.mx</a></h4></div>
                    <div id="panelderecha">
                        <a data-toggle="tooltip" data-original-title="Envianos tus dudas y comentarios. Nosotros te responderemos" href="#" onclick="lightbox_open_correo();">
                            <img src="Imagenes/email.jpg" alt="Correo" width="50" height="50">
                        </a>
                    </div> 
                </div>
<!--                <div id="red" class="ui-corner-all tooltip-examples">
                    <div id="panelizquierda"><h4><b>Redes sociales:</b> <br> <a data-toggle="tooltip" data-original-title="Házte nuestro amigo en las redes sociales."   href="https://www.facebook.com/division.tecnologicodetoluca" target="_blank">Facebook ITT</a></h4></div>
                    <div id="panelderecha"><a data-toggle="tooltip" data-original-title="Házte nuestro amigo en las redes sociales."  href="https://www.facebook.com/division.tecnologicodetoluca" target="_blank"><img src="Imagenes/facebook.png" alt="aqui va una descripcion" width="50" height="50"></a></div> 
                </div>-->
            </div>

            <div id="light_correo">
                <form action="servlet/SendMail" class="form-horizontal" id="formulario_inicio" onsubmit="return validar()">
                    <div class="control-group">
                        <label class="control-label" for="inputNombre">Nombre :</label>
                        <div class="controls">
                            <input type="text" name="txtNombre" id="txtNombre"  size="32" placeholder="Nombre">
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="inputEmail">Email :</label>
                        <div class="controls">
                            <input type="text" name="txtEmail" id="txtEmail" size="32" placeholder="Email">
                        </div>
                    </div>
                    <div class="control-group">
                        <label class="control-label" for="inputDescripcion">Descripci&oacute;n :</label>
                        <div class="controls">
                            <textarea name="txtDescripcion" id="txtDescripcion" style="overflow:auto; resize:none" rows="10" cols="30" placeholder="Inserte aquí el cuerpo de su mensaje."></textarea>
                        </div>
                    </div>
                    <div class="control-group">
                        <form method="get" action="<%=response.encodeUrl("check.jsp")%>">
                            <div class="controls">
                                <br>
                                Introduce el Código: 
                                <input name="password" size="16" />

                                <br>
                                <br>
                                <%= captchas.image()%><br>
                                <br>
                                <br>
                                <button type="submit" id="sendMail" class="btn btn-default sendMail">Enviar</button>
                                <button type="button" class="btn btn-default" onClick="lightbox_close_correo();">Cancelar</button>
                            </div>
                        <!--</form>-->
                    </div>
                    <div class="img_correo_pop">
                        <img src="Imagenes/ico_correo.gif" alt="ico_Correo" width="110" height="110">
                    </div>
                </form>
            </div>
            <div id="fade_correo" onClick="lightbox_close();"></div>  
        </div>
    </body>
    </form>
</html>