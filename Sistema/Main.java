/*package Sistema;


import Controle.*;
import Itens.*;
import Pessoas.*;
import Sistema.*;
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        InicializarEncerrar.iniciaSistema();
        var resposta = new Scanner(System.in);
        int opcao = 0;
        boolean caixaAberto = false;
        /*
        do{
            System.out.println("_______________________________________________");
            System.out.println("| Menu Principal:");
            System.out.println("| 1. Abrir caixa");
            System.out.println("| 2. Atender Cliente");
            System.out.println("| 3. Cadastrar Novo Produto");
            System.out.println("| 4. Editar Produto");
            System.out.println("| 5. Cadastrar Novo Cliente");
            System.out.println("| 6. Cadastrar Novo Funcionario");
            System.out.println("| 0. Sair do Sistema");
            System.out.println("________________________________________________");
            opcao = Integer.parseInt(resposta.nextLine());
            if(opcao == 1){
                if(!caixaAberto){
                    System.out.println("Digite o nome do operador");
                    String operador = resposta.nextLine();
                    if(BancoDeDados.checkVendendor(operador)){
                        Caixa caixa = new Caixa(BancoDeDados.achaVendedor(operador));
                        caixaAberto = true;
                    }else System.out.println("Vendedor nao encontrado, verifique a ortografia ou cadastre o vendedor\n");
                }else System.out.println("\nCaixa ja aberto! para abrir um novo, encerre o atual\n");
            }else if(opcao == 2){
                if(caixaAberto){
                    System.out.println("Informe o Cliente a ser atendido");
                    String nome = resposta.nextLine();
                    if(!BancoDeDados.checkCliente(nome)){
                        System.out.println("Cliente nao encontrado, por favor cadastre-o\n");
                        BancoDeDados.cadastraPessoa();
                        System.out.println("\n cliente cadastrado refaca a operacao!");
                    }else{
                        boolean compraAberta = true
                    }
                }
            }
        }while(opcao != 0);
        */
        resposta.close();
        InicializarEncerrar.encerraSistema();
        
    }
}
