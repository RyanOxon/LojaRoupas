package Itens;


import Itens.Produto;

public class Camisa extends Produto{
    
    public Camisa(String cor, int qtd, String tamanho){
        super("Camisa", cor, qtd, 50.0, tamanho);
    }
}
