/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigos;

import java.util.List;

/**
 *
 * @author Vinicius
 */
public class Pedido {

    private Integer id;
    private Integer idmesa;
    private List<ProdutoPedido> produtos;
    private String cliente;
    private String abertura;
    private String fechamento;
    private Float vlrtotal;

    public Pedido(Integer id, Integer idmesa, String cliente, String abertura) {
        this.id = id;
        this.idmesa = idmesa;
        this.produtos = null;
        this.cliente = cliente;
        this.abertura = abertura;
    }

    public Pedido(Integer idmesa, String cliente, String abertura, ProdutoPedido p) {

        this.id = PedidosLista.getInstancePedidos().size() + 1;
        this.idmesa = idmesa;

        this.cliente = cliente;
        this.abertura = abertura;
        produtos.add(p);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdmesa() {
        return idmesa;
    }

    public void setIdmesa(Integer idmesa) {
        this.idmesa = idmesa;
    }

    public List<ProdutoPedido> getProduto() {
        return produtos;
    }

    public void setProduto(List<ProdutoPedido> produto) {
        this.produtos = produto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getAbertura() {
        return abertura;
    }

    public void setAbertura(String abertura) {
        this.abertura = abertura;
    }

    public String getFechamento() {
        return fechamento;
    }

    public void setFechamento(String fechamento) {
        this.fechamento = fechamento;
    }

}
