/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function LlamarServlet() {
//    var correo = $('#InCorreoE').val();
//    var usuario = "desarrollo";
//    var pass = "d3s4rr0ll0";
    var usuario = "FICHAS";
    var pass = "FICHAS";
//     var correo=$.get("correo");
//     alert(correo);
    $.get('/MODULO_ASPIRANTE/ServletCatalogos',
            {usuario: usuario, pass: pass},
    function(retorno) {
//        doDelay(1000);
        setTimeout(1000);
//        $("#contenido").load("vistas/Aspirante/Datos_Aspirante.jsp");
    }
    );
}
function doDelay(wait) {

    var date = new Date();
    var startDate = date.getTime();
    var a = 1;
    var b = 0;
    while (a !== 0) {
        date = new Date();
        if ((date.getTime() - startDate) >= wait) {
            a = 0;
        }
        b++;
    }

}


$(document).ready(function() {

    LlamarServlet();
});
window.onbeforeunload = function() {
    return "Los datos no ha sido guardados.";
};