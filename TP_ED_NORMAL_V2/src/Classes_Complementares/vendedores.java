/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes_Complementares;

/**
 *
 * @author GIL2D
 */
public class vendedores 
{
    private int id;
    private String nome;
    private int capacidade;
    private String[] mercados_a_visitar;

    public vendedores(int id, String nome, int capacidade, String[] mercados_a_visitar) {
        this.id = id;
        this.nome = nome;
        this.capacidade = capacidade;
        this.mercados_a_visitar = mercados_a_visitar;
    }

    public vendedores() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public String[] getMercados_a_visitar() {
        return mercados_a_visitar;
    }

    public void setMercados_a_visitar(String[] mercados_a_visitar) {
        this.mercados_a_visitar = mercados_a_visitar;
    }
    
    
}
