package Itens;

import java.io.Serializable;

public class Produto implements Serializable {
    
    private String descricao;
    private int Id;
    private int qtd;
    private double valor;
    
    public Produto(String descricao, int id, int qtd, double valor) {
        this.descricao = descricao;
        this.Id = id;
        this.qtd = qtd;
        this.valor = valor;
    }

    public String getDescricao(){
        return this.descricao;
    }
       
    public int getQtd(){
        return this.qtd;
    }
    
    public double getValor(){
        return this.valor;
    }
     
    public int getId(){
        return this.Id;
    }

    public boolean estaDisponivel(){
        if(qtd != 0) return true;
        else return false;
    }

    public void setId(int id) {
        this.Id = id;
    }

	public void decrementaQtd() {
        this.qtd--;
	}

    public void setQtd(int nQtd) {
        this.qtd = nQtd;
    }

	public void setValor(int i) {
        this.valor = i;
	}
}
