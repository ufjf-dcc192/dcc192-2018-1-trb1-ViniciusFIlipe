/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigos;

import java.util.ArrayList;
import java.util.List;
import org.apache.jasper.tagplugins.jstl.ForEach;

/**
 *
 * @author Vinicius
 */
public class ProdLista {

    private static List<Produto> prodlist;

    public static List<Produto> getInstance() {
        if (prodlist == null) {
            prodlist = new ArrayList<>();
            prodlist.add(new Produto("Agua", 2));
            prodlist.add(new Produto("Macarrão", 4));
            prodlist.add(new Produto("Carne", 10));
            prodlist.add(new Produto("Cerveja", (float) 9.50));
        }
        setcodigo();
        return prodlist;
    }
    public static void setcodigo(){
        
        for (int i =0;i<prodlist.size();i++) {
            prodlist.get(i).setCodigo(i);
           // produto.setCodigo(i);
        }
    
    }
    public  String getByCod(int cod) {
        String desc = "";
        for (int i = 0; i < prodlist.size(); i++) {
            if (cod == prodlist.get(i).getCodigo()) {
                desc = prodlist.get(i).getDescricao();
            }

        }
        return desc;
    }
}
