package Pessoas;

public class Seguranca extends Funcionario{
    public Seguranca(String nome, String cpf, String endereco, String telefone, int salario){
        super(nome, cpf, endereco, telefone, salario);
        this.funcao = "Segurança";
    }  
    

    public void checarCompras(Cliente cliente){
        new Thread(){

            @Override
            public void run() {
                try{
                    System.out.println("Seguranca conferindo as compras realizadas...");
                    
                    Thread.sleep(1300);
                    
                    System.out.println("Checagem finalizada, " + cliente.getNome() + " está liberado(a)");
                }catch(InterruptedException ex){
                    ex.getMessage();
                }
            
            }
            
       }.start();
    }

}
