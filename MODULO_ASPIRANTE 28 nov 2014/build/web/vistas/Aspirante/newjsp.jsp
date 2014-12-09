<%-- 
    Document   : newjsp
    Created on : 9/12/2014, 11:44:52 AM
    Author     : ElyyzZ BaRruEtA
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="../../JQueryClases/jquery-1.11.1.min.js" type="text/javascript"></script>
        <script src="../../JQueryClases/pruebs.js" type="text/javascript"></script>

        <title>JSP Page</title>
    </head>
    <body>
        <select id="combopaisnacimiento" name="combo_edo_civil" class="Selects" >
            <c:forEach items="${pais}" var="pais">                                     
                <option value="${pais.getClave()}"><c:out value="${pais.getNombre()}"/></option>                                                                           
            </c:forEach>
        </select>
    </body> 
</html>
