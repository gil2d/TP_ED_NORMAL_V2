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
public class caminhos 
{
    private Locais de;
    private Locais para;
    private int distancia;

    public caminhos() {
    }

    public caminhos(Locais de, Locais para, int distancia) {
        this.de = de;
        this.para = para;
        this.distancia = distancia;
    }

    public Locais getDe() {
        return de;
    }

    public void setDe(Locais de) {
        this.de = de;
    }

    public Locais getPara() {
        return para;
    }

    public void setPara(Locais para) {
        this.para = para;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    
    
}
