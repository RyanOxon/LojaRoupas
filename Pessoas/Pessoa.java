package Pessoas;

public abstract class Pessoa {
    
    protected String nome;
    protected String cpf;
    protected String  endereco;
    protected int telefone;

    Pessoa(String nome, String cpf, String endereco, int telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    public String getNome(){
        return this.nome;
    }


    public String getCpf(){
        return this.cpf;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public int getTelefone(){
        return this.telefone;
    }
}
