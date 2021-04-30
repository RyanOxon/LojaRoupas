package Pessoas;

public class Vendedor extends Funcionario{
   
    
    Vendedor(String nome, String cpf, String endereco, int telefone){
        super(nome, cpf, endereco, telefone);
        this.funcao = "Vendedor";
        this.salario = 2500;
    }  
}
