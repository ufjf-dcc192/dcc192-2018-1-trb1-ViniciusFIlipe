/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ice
 */
@WebServlet(name = "MainServlet", urlPatterns = {"/index.html", "/novopedido.html"})
public class MainServlet extends HttpServlet {
List<Produto> produtos = new ProdLista().getInstance();
ArrayList<Produto> prodlist = new ArrayList<>();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if ("/novopedido.html".equals(request.getServletPath())) {
            
            request.setAttribute("produtos",produtos);
            
            RequestDispatcher dispachante = request.getRequestDispatcher("/WEB-INF/novopedido.jsp");
            dispachante.forward(request, response);
            
        }
        RequestDispatcher dispachante = request.getRequestDispatcher("/WEB-INF/mainjsp.jsp");
        dispachante.forward(request, response);

    }
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer quant =  Integer.parseInt(request.getParameter("quantidade"));
        Integer item =  Integer.parseInt(request.getParameter("itens"));
        
        
        prodlist.add(produtos.get(item));
        request.setAttribute("produtoslist",prodlist);
        request.setAttribute("quantidade",quant);
        response.sendRedirect("novopedido.html");
   }
}
