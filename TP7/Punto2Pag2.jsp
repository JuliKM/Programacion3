

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Respuesta</title>
    </head>
    <body>
        <table border="1">
            <%
                String dni = "";
                String nombre = "";
                String dom = "";
                if (request.getParameter("dni") != null) {
                    dni = request.getParameter("dni");
                }
                if (request.getParameter("nombre") != null) {
                    nombre = request.getParameter("nombre");
                }
                if (request.getParameter("dom") != null) {
                    dom = request.getParameter("dom");
                }
            %>
            <tr><td><% out.println("DNI: " + dni);%></td></tr>
            <tr><td><% out.println("Nombre: " + nombre);%></td></tr>
            <tr><td><% out.println("Domicilio: " + dom);%></td></tr>

        </table>
    </body>
</body>
</html>
