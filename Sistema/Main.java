package Sistema;

import java.util.Scanner;

import Controle.BancoDeDados;
import Controle.Estoque;
import Itens.Camisa;
import Pessoas.Vendedor;
import Sistema.InicializarEncerrar;

public class Main {
    public static void main(String[] args){
        InicializarEncerrar.iniciaSistema();
        Vendedor rafael = new Vendedor("Rafael", "1", "Rua estrela 123", "2345-1234", 1200);
        BancoDeDados.addVendedor(rafael);
        //Caixa caixa = new Caixa(rafael);
        /*Scanner resposta = new Scanner(System.in);
        int opcao = 0;
        do{
            System.out.println("_______________________________________________");
            System.out.println("| Sistema Iniciado:");
            System.out.println("| 1. Abrir caixa");
            System.out.println("| 2. Cadastrar Novo Produto");
            System.out.println("| 3. Editar Produto");
            System.out.println("| 4. Cadastrar Novo Cliente");
            System.out.println("| 5. Cadastrar Novo Funcionario");
            System.out.println("| 0. Sair do Sistema");
            System.out.println("________________________________________________");
            opcao = Integer.parseInt(resposta.nextLine());
            if(opcao == 1){
            }*/

        InicializarEncerrar.encerraSistema();
        
    }
}
