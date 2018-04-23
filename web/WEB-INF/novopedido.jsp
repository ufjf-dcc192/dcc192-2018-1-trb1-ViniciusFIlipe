<%-- 
    Document   : novopedido
    Created on : 20/04/2018, 21:55:30
    Author     : ice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Codigos.Produto"%>
<%@page import="Codigos.MainServlet"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Novo Pedido</title>
    </head>
    <body>
        <h1>Novo Pedido!</h1>
        <form> <table>
                <tr>
                    <td>
                        <a>Mesa: </a><select name="mesa">
                            <option>Selecione</option>
                            <option>Mesa 1</option>
                            <option>Mesa 2</option>
                            <option>Mesa 3</option>
                            <option>Mesa 4</option>
                            <option>Mesa 5</option>
                            <option>Mesa 6</option>
                        </select>
                    </td> 
                    <td>

                    </td>


                </tr>
                <tr>
                    <td> <p>Produto: </p> <select name="itens" size="1">
                            <option>Selecione</option>
                            <option><%=MainServlet.getByCod(1)%></option>
                            <option>Refrigerante</option>
                        </select>
                    </td>
                    <td>
                        <p>Valor:</p> <input type="text" name="valor" value="0" disabled="disabled" />
                    </td>
                    <td>
                        <p>Quantidade: </p><input type="text" name="quantidade" value="0" /><input type="submit" value="ok" name="ok" />
                    </td>
                </tr>

                <table  border=1 >
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
                    <tr>
                        <td>Prod1</td>
                        <td>Quant1</td>
                        <td>vlr*quantidade</td>
                    </tr>
                </table>
                <tr>
                    <td>
                        <p>Valor Total: </p><input type="text" name="vlrtotal" value="0" disabled="disabled" />
                    </td>

                </tr>
                <tr>
                    <td>

                        <input type="submit" value="Salva" name="salvar" />
                    </td>
                    <td>
                        <input type="submit" value="Limpa" name="limpar" />
                    </td>
                </tr>
            </table>
        </form>






        <a href="index.html">Voltar</a>
    </body>
</html>
