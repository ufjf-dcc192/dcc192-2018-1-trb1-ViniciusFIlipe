/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigos;

/**
 *
 * @author Vinicius
 */
public class Produto {

    private  int codigo;
    private String descricao;
    private float vlrUnit;

    

    @Override
    public String toString() {
        return codigo + " - " + descricao + " - " + vlrUnit;
    }

    public Produto(String descricao, float vlrUnit) {
        this.descricao = descricao;
        this.vlrUnit = vlrUnit;
    }

    public Produto() {
    }

    public  int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
       this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getVlrUnit() {
        return vlrUnit;
    }

    public void setVlrUnit(float vlrUnit) {
        this.vlrUnit = vlrUnit;
    }
}
