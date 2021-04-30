package Itens;

import Controle.Estoque;


public abstract class Produto {
    
    private String descricao;
    private String cor;
    private int qtd;
    private double valor;
    private String tamanho;
    private boolean disponivel;
    
    Produto(String descricao, String cor, int qtd, double valor, String tamanho){
        this.descricao = descricao;
        this.cor = cor;
        this.qtd = qtd;
        this.valor = valor;
        this.tamanho = tamanho;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public int getQtd(){
        return this.qtd;
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public void estaDisponivel(){
        Estoque.Read(this.descricao);
    }
}
