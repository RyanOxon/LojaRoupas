//package Pessoas;
 
//import Itens.Produto;

public class Cliente extends Pessoa{
    private int fidelidade;
    
    
    public Cliente(String nome, String cpf, String endereco, String telefone){
        super(nome, cpf, endereco, telefone);
        this.fidelidade = 0; 
    }
    public Cliente(String nome, String cpf, String endereco, String telefone, int fidelidade){
        super(nome, cpf, endereco, telefone);
        this.fidelidade = fidelidade;
    }
    public int getFidelidade(){
        return this.fidelidade;
    }   
    
    public void maisPontoDeFidelidade(){
        this.fidelidade++;
    }
}
