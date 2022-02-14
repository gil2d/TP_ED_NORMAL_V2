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
public class Locais 
{
    private String nome;
    private String tipo;
    private int[] clientes;

    public Locais() {
    }

    public Locais(String nome, String tipo, int[] clientes) {
        this.nome = nome;
        this.tipo = tipo;
        this.clientes = clientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int[] getClientes() {
        return clientes;
    }

    public void setClientes(int[] clientes) {
        this.clientes = clientes;
    }
    
    
}
