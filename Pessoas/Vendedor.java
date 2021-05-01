import java.io.Serializable;

package Pessoas;

public class Vendedor extends Funcionario implements Serializable{
    
    Vendedor(String nome, String cpf, String endereco, String telefone, int salario){
        super(nome, cpf, endereco, telefone, salario);
        this.funcao = "Vendedor";
    }  
}
