<%-- 
    Document   : novopedido
    Created on : 20/04/2018, 21:55:30
    Author     : ice
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Codigos.Produto"%>
<%@page import="Codigos.MainServlet"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Novo Pedido</title>
    </head>
    <body>
        <h1>Novo Pedido!</h1>
        <form method="POST"><a>Mesa: </a>
            <select name="mesa">
                <option value="0">Selecione</option>
                <option value="1">Mesa 1</option>
                <option value="2">Mesa 2</option>
                <option value="3">Mesa 3</option>
                <option value="4">Mesa 4</option>
                <option value="5">Mesa 5</option>
                <option value="6" >Mesa 6</option>
            </select>
            <p>Produto: </p> 
            <select name="itens" size="1">
                <option>- Selecione -</option>
                <%for(Produto produtos : (List<Produto>) request.getAttribute("produtos")) {%> 
                <option value="<%=produtos.getCodigo()%>" onselect=""><%=produtos.getCodigo()%>-<%=produtos.getDescricao()%> -R$ <%=produtos.getVlrUnit()%></option>  
                <%}%>
            </select>
            <p>Quantidade: </p><input type="text" name="quantidade" value="0" /><input type="submit"/>

        </form>
        <table  border=1 >
            <thead>
                <tr>
                    <th>
                        <p>Produto</p>
                    </th>
                    <th>
                        <p>Quantidade</p>
                    </th>
                    <th>
                        <p>Subtotal</p>
                    </th>

                </tr>
            </thead>
            <tbody>
                <%--
                                    <%
                                       // for (Produto produtospedido :  request.getAttribute("produtos")) {
                                    %> 
                                    <tr>
                                        <td><%=produto.getDescricao()%></td>
                                        <td><%= request.getAttribute("quantidade")%></td>
                                        <td>vlr*quantidade</td>
                </tr>--%>
                <%

                    // }
                %>

                <c:forEach items="${pedido.getProduto()}" var="item">
                    <tr>
                        <td>${item.getDescricao()}</td>
                        <td>${item.value}</td>
                        <td>${item.key.getNome()}</td>
                        <td>${item.key.getValor()}</td>
                        <td>${item.value*item.key.getValor()}</td>
                        <c:if test="${comanda.getHoraFechamento() == null}">
                            <td><a href="remover-itens.html?id=${comanda.getId()}&id-item=${item.key.getId()}">Excluir</a></td>
                        </c:if>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <p>Valor Total: </p><input type="text" name="vlrtotal" value="0" disabled="disabled" />
        <input type="submit" value="Salva" name="salvar" />
        <input type="submit" value="Limpa" name="limpar" />   

        <a href="index.html">Voltar</a>
    </body>
</html>
