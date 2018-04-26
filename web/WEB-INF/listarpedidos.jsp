<%-- 
    Document   : listarpedidos
    Created on : 25/04/2018, 12:22:41
    Author     : Vinicius
--%>

<%@page import="java.util.List"%>
<%@page import="Codigos.Pedido"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Pedidos</h1>
        <table border="1">
            <thead>
                <tr>
                    <th>Pedido</th>
                    <th>Mesa</th>
                    <th>Responsável</th>
                    <th>Hora de Abertura</th>
                    <th>Hora de Fechamento</th>
                    <th>Listar Itens</th>
                    <th>Fechar/REABRIR Comanda</th>
                </tr>
            </thead>
            <tbody>
                <%

                    for (Pedido pedidos : (List<Pedido>) request.getAttribute("pedidos")) {
                %> 
                <%-- <c:forEach items="${pedidos}" var="pedidos">--%>
                <tr>
                    <td><%=pedidos.getId()%></td>
                    <td><%=pedidos.getIdmesa()%></td>
                    <td><%=pedidos.getCliente()%></td>
                    <td><%=pedidos.getAbertura()%></td>
                    <td><%=pedidos.getFechamento()!=null?pedidos.getFechamento():""%></td>
                    <%-- <td><a href="listar-itens-comanda.html?id=${comanda.getId()}">Listar</a></td>
                     <td><a href="fechar-comanda.html?id=${comanda.getId()}">${comanda.getHoraFechamento() == null ? "Fechar" : "REABRIR"}</a></td>--%>
                </tr>
                <%}%>
                <%-- </c:forEach>--%>
            </tbody>
        </table>
<a href="index.html">Voltar</a>
    </body>
</html>
