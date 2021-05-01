//package Pessoas;

public abstract class Funcionario extends Pessoa{
    protected String funcao;
    protected int salario;
    
    Funcionario(String nome, String cpf, String endereco, String telefone, int salario){
        super(nome, cpf, endereco, telefone);
        this.salario = salario;
    }  
    
    public String getFuncao(){
        return this.funcao;
    }
    
    public int getSalario(){
        return this.salario;
    }
}
