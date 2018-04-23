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

    private static List<Produto> prod;

    public static List<Produto> getInstance() {
        if (prod == null) {
            prod = new ArrayList<>();
            prod.add(new Produto("Coca Cola 2lt", 10));
            prod.add(new Produto("Kaizer 600ML", 6));
            prod.add(new Produto("Brahma 600ML", (float) 7.50));
            prod.add(new Produto("Porção de Batata", 15));
            prod.add(new Produto("Porção de Carne", 28));
        }
        return prod;
    }

    public static  String getByCod(int cod) {
        String desc="";
        for (int i = 0; i < prod.size(); i++) {
            if (cod == prod.get(i).getCodigo()) 
            desc= prod.get(i).getDescricao();
            
        }
        return desc;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if ("/novopedido.html".equals(request.getServletPath())) {
            getInstance();
            request.setAttribute("produtos", prod);
            RequestDispatcher dispachante = request.getRequestDispatcher("/WEB-INF/novopedido.jsp");
            dispachante.forward(request, response);
        }
        RequestDispatcher dispachante = request.getRequestDispatcher("/WEB-INF/mainjsp.jsp");
        dispachante.forward(request, response);

    }

}
