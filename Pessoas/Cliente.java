import java.io.Serializable;

//package Pessoas;
 
//import Itens.Produto;

public class Cliente extends Pessoa{
    private String fidelidade;
    
    
    Cliente(String nome, String cpf, String endereco, String telefone){
        super(nome, cpf, endereco, telefone);
        this.fidelidade = "0"; 
    }
    Cliente(String nome, String cpf, String endereco, String telefone, String fidelidade){
        super(nome, cpf, endereco, telefone);
        this.fidelidade = fidelidade;
    }
    public String getFidelidade(){
        return this.fidelidade;
    }   
}