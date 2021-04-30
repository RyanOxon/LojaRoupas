package Pessoas;


public class Seguranca extends Funcionario{
    Seguranca(String nome, String cpf, String endereco, int telefone){
        super(nome, cpf, endereco, telefone);
        this.funcao = "Segurança";
        this.salario = 2200;
    }  
}
