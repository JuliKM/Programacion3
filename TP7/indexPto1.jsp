<%-- 
    Document   : index
    Created on : 22 nov. 2021, 16:20:27
    Author     : JuliKM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Punto 1</title>
    </head>
    <body>
        <h1>TP 1 JSP</h1>
        <form>
            Ingrese el número de filas deseadas: <input type="text" name="numeroF" id="filas"/>
            Ingrese el número de columnas deseadas: <input type="text" name="numeroC" id="col"/>
            <button type="submit">ENVIAR</button>
        </form>
        <table border="1">
            <%
                int filas = 0;
                int col = 0;
                if (request.getParameter("numeroF") != null) {
                filas = Integer.parseInt(request.getParameter("numeroF"));
                        //request.getParameter("numeroF");
                }
                if (request.getParameter("numeroC") != null) {
                col = Integer.parseInt(request.getParameter("numeroC"));
                }
                int filasNro = filas;
                int colNro = col;
                for (int i = 0; i < filasNro; i++) {
            %>
            <tr>
                <%
                    for (int j = 0; j < colNro; j++) {
                %>
                <td><% out.println((i+1)+"."+(j+1));%></td>
                <%
                    }
                %>
            </tr>
            <%
                }
            %>
        </table>
    </body>
</html>
