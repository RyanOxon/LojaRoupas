
package Sistema;

import Controle.Arquivo;
import Controle.BancoDeDados;

public abstract class InicializarEncerrar {
    static boolean sistemaFuncionando = true;
    protected static void iniciaSistema(){
        Arquivo.lerProdutos();
        //System.out.println(".");
        Arquivo.lerClientes();
        Arquivo.lerSeguranca();
        Arquivo.lerVendedor();
        System.out.println("Sistema Iniciado");
    }
    protected static void encerraSistema(){
        if(!BancoDeDados.getProduto().isEmpty()){
            Arquivo.escreveProduto();}
        if(!BancoDeDados.getVendedor().isEmpty()){
            Arquivo.escreveVendedor();}
        if(!BancoDeDados.getSeguranca().isEmpty()){
            Arquivo.escreveSeguranca();}
        if(!BancoDeDados.getClientes().isEmpty()){
            Arquivo.escreveCliente();}
        System.out.println("Sistema desligado");
    }
}
