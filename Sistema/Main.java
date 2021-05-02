/*
package Sistema;
import Controle.*;
import Itens.*;
import Pessoas.*;
import Sistema.*;
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        InicializarEncerrar.iniciaSistema();
        Caixa caixa = new Caixa();
        Scanner resposta = new Scanner(System.in);
        int opcao = 0;
        boolean caixaAberto = false;
        do{
            System.out.println("_______________________________________________");
            System.out.println("| Menu Principal:");
            System.out.println("| 1. Abrir caixa");
            System.out.println("| 2. Atender Cliente");
            System.out.println("| 3. Cadastrar Novo Produto");
            System.out.println("| 4. Editar Quantidade de um produto");
            System.out.println("| 5. Ver estoque de Produtos");
            System.out.println("| 6. Cadastrar Novo Cliente");
            System.out.println("| 7. Ver Clientes");
            System.out.println("| 8. Cadastrar Novo Funcionario");
            System.out.println("| 9. Ver Funcionarios");
            System.out.println("| 10. Encerrar caixa");
            System.out.println("| 0. Sair do Sistema");
            System.out.println("________________________________________________");
            opcao = Integer.parseInt(resposta.nextLine());
            System.out.println("\n\n\n\n\n\n\n");
            if(opcao == 1){
                if(!caixaAberto){
                    System.out.println("Digite o nome do operador");
                    String operador = resposta.nextLine();
                    if(BancoDeDados.checkVendendor(operador)){
                        System.out.println("Digite o nome do seguranca vigente");
                        String seg = resposta.nextLine();
                        if(BancoDeDados.checkSeguranca(seg)){
                            caixa.ocupaCaixaVazio(BancoDeDados.achaVendedor(operador));
                            caixa.setSeguranca(BancoDeDados.achaSeguranca(seg));
                            caixaAberto = true;
                            System.out.println("\nCaixa sendo operado por " + BancoDeDados.achaVendedor(operador).nome + "\nE sendo monitorado por " + BancoDeDados.achaSeguranca(seg).nome);
                        }
                        }else System.out.println("\nVendedor nao encontrado, verifique a ortografia ou cadastre o vendedor\n");
                }else System.out.println("\nCaixa ja aberto! para abrir um novo, encerre o atual\n");
            }else if(opcao == 2){
                if(caixaAberto){
                    System.out.println("Informe o Cliente a ser atendido");
                    String nome = resposta.nextLine();
                    if(!BancoDeDados.checkCliente(nome)){
                        System.out.println("\nCliente nao encontrado, por favor cadastre-o\n");
                    }else{
                        caixa.setOcupado(true);
                        caixa.setClienteAtual(BancoDeDados.achaClientes(nome));
                        do{
                            System.out.println("_______________________________________________");
                            System.out.println("===============Atendendo: "+ caixa.getClienteAtual().nome);
                            System.out.println("_______________Carrinho atual__________________");
                            caixa.getCarrinho(); // Metodo pra retornar um print com o nome do produto no carrinho
                            System.out.printf("Total = %.2f \n", caixa.getTotal());
                            System.out.println("_______________________________________________");
                            System.out.println("| Menu De Venda:");
                            System.out.println("| 1. Adicionar Produto");
                            System.out.println("| 2. Remover produto");
                            System.out.println("| 3. Ver lista de produtos");
                            System.out.println("| 4. Finalizar compra");
                            System.out.println("| 5. Cancelar compra");
                            System.out.println("________________________________________________");
                            
                            int resp = Integer.parseInt(resposta.nextLine());
                            
                            if(resp == 1){// adiciona no carrinho
                                System.out.println("Digite o nome do produto");
                                String n = resposta.nextLine();
                                if(BancoDeDados.checkProduto(n))
                                    caixa.addItem(BancoDeDados.achaProduto(n));
                                else System.out.println("\nProduto nao encontrado");

                            }else if(resp == 2){//remove do carrinho
                                System.out.println("Digite o nome do produto");
                                String n = resposta.nextLine();
                                if(caixa.estaNoCarrinho(n))
                                    caixa.removeItem(BancoDeDados.achaProduto(n));
                                else System.out.println("\nProduto nao esta no carrinho, verifique a ortografia");
                            }else if(resp == 3){
                                BancoDeDados.printProdutos();
                            }else if(resp == 4){
                                caixa.finalizarCompra();
                            }else if(resp == 5){
                                caixa.cancelarCompra();
                            }
                            
                        }while(caixa.getOcupado());
                    }
                }else System.out.println("\n Caixa ainda não aberto! Abra o caixa e refaça a operação");
            }else if(opcao == 3){
                BancoDeDados.cadastraProduto();
                System.out.println("\n Produto cadastrado!");
            }else if(opcao == 4){
                System.out.println("Digite o nome do produto para ser editado:");
                String edit = resposta.nextLine();
                if(BancoDeDados.checkProduto(edit)){
                    System.out.println("Digite a nova quantidade do produto");
                    int nQtd = Integer.parseInt(resposta.nextLine());
                    BancoDeDados.achaProduto(edit).setQtd(nQtd);
                }
            }else if(opcao == 5){
                BancoDeDados.printProdutos();
            }else if(opcao == 6){
                BancoDeDados.cadastraCliente();
                System.out.println("\n Cliente cadastrado!!");
            }else if(opcao == 7){
                BancoDeDados.printClientes();
            }else if(opcao == 8){
                BancoDeDados.cadastraFuncionario();
                System.out.println("\n Funcionário cadastrado!!");
            }else if(opcao == 9){
                BancoDeDados.printFuncionarios();
            }else if(opcao == 10){
                if(caixaAberto){
                    caixa.ocupaCaixaVazio(null);
                    caixa.setSeguranca(null);
                    caixaAberto = false;
                    System.out.println("Caixa Encerrado!");
                }
            }
        Thread.sleep(1500);
        System.out.println("\n\n\n\n");
        }while(opcao != 0); 
        
        resposta.close();
        InicializarEncerrar.encerraSistema();
        
    }
}
