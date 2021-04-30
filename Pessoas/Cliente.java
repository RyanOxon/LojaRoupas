package Pessoas;

import Carrinho.Carrinho; 
import Itens.Produto;

public class Cliente extends Pessoa{
    
    private Carrinho carrinho;
    private String metodoDePagamento;
    
    Cliente(String nome, String cpf, String endereco, int telefone, String metodoDePagamento){
        super(nome, cpf, endereco, telefone);
        this.metodoDePagamento = metodoDePagamento;
    }
    
    public void colocarNoCarrinho(Produto prod){
        carrinho.addItem(prod);
    }
    
    public void retirarDoCarrinho(Produto prod){
        carrinho.removeItem(prod);
    }
    
    public String getMetodoDePagamento(){
        return this.metodoDePagamento;
    }
}
