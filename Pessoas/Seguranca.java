package Pessoas;


public class Seguranca extends Funcionario{
    public Seguranca(String nome, String cpf, String endereco, int telefone){
        super(nome, cpf, endereco, telefone);
        this.funcao = "Segurança";
        this.salario = 2200;
    }  

    public void checarCompras(Cliente cliente){
        new Thread(){

            public void run() {
                try{
                    System.out.println("Conferindo as compras realizadas...");
                    
                    Thread.sleep(1800);
                    
                    System.out.println("Checagem finalizada, " + cliente.getNome() + " está liberado(a)");
                }catch(InterruptedException ex){
                    ex.getMessage();
                }
            
            }
            
       }.start();
    }

}
