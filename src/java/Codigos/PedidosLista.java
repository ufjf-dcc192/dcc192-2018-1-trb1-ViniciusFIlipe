/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Vinicius
 */
public class PedidosLista {

    private static ArrayList<Pedido> pedidos;
    private static ArrayList<Produto> produtos;
    private static Integer i;

    public static ArrayList<Pedido> getInstancePedidos() {
        if (pedidos == null) {
            i = 1;
            pedidos = new ArrayList<>();
            pedidos.add(new Pedido(i++, 1, "Mesa "+i, new Date().toString()));
            pedidos.add(new Pedido(i++, 2, "Mesa "+i, new Date().toString()));
            pedidos.add(new Pedido(i++, 3, "Mesa "+i, new Date().toString()));
        }
        return pedidos;
    }

    public static void setcodigo() {

        for (int i = 0; i < pedidos.size(); i++) {
            pedidos.get(i).setId(i);
            // produto.setCodigo(i);
        }

    }

    public static void addNoPedido(Pedido p) {
    
    pedidos.add(p);
    setcodigo();
    
    }
    
}
