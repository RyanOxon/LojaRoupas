/*
package Sistema;
import Controle.*;
import Itens.*;
import Pessoas.*;
import Sistema.*;
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
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
                        System.out.println("Digite o nome do seguranca vigente");
                        String seg = resposta.nextLine();
                        if(BancoDeDados.checkSeguranca(seg)){
                            caixa.ocupaCaixaVazio(BancoDeDados.achaVendedor(operador));
                            caixa.setSeguranca(BancoDeDados.achaSeguranca(seg));
                            caixaAberto = true;
                            System.out.println("Caixa sendo operado por " + BancoDeDados.achaVendedor(operador).nome + "\nE sendo monitorado por" + BancoDeDados.achaSeguranca(seg).nome);
                        }
                        }else System.out.println("Vendedor nao encontrado, verifique a ortografia ou cadastre o vendedor\n");
                }else System.out.println("\nCaixa ja aberto! para abrir um novo, encerre o atual\n");
            }else if(opcao == 2){
                if(caixaAberto){
                    System.out.println("Informe o Cliente a ser atendido");
                    String nome = resposta.nextLine();
                    if(!BancoDeDados.checkCliente(nome)){
                        System.out.println("Cliente nao encontrado, por favor cadastre-o\n");
                        BancoDeDados.cadastraCliente();
                        System.out.println("\n Cliente cadastrado! Refaça a operação!");
                    }else{
                        boolean compraAberta = true;
                        do{
                            System.out.println("_______________________________________________");
                            System.out.println("_______________Carrinho atual__________________");
                            caixa.getCarrinho(); // Metodo pra retornar um print com o nome do produto no carrinho
                            System.out.println("Total = " + caixa.getTotal());
                            System.out.println("_______________________________________________");
                            System.out.println("| Menu De Venda:");
                            System.out.println("| 1. Adicionar Produto");
                            System.out.println("| 2. Remover produto");
                            System.out.println("| 3. Finalizar compra");
                            System.out.println("| 4. Cancelar compra");
                            System.out.println("________________________________________________");
                            
                            int resp = Integer.parseInt(resposta.nextLine());
                            
                            if(resp == 1){// adiciona no carrinho
                                System.out.println("Digite o nome do produto");
                                String n = resposta.nextLine();
                                if(BancoDeDados.checkProduto(n))
                                    caixa.addItem(BancoDeDados.achaProduto(n));
                                else System.out.println("Produto nao encontrado");

                            }else if(resp == 2){//remove do carrinho
                                System.out.println("Digite o nome do produto");
                                String n = resposta.nextLine();
                                if(caixa.estaNoCarrinho(n))
                                    caixa.removeItem(BancoDeDados.achaProduto(n));
                                else System.out.println("Produto nao esta no carrinho, verifique a ortografia");

                            }else if(resp == 3){
                                caixa.finalizarCompra();
                                caixa.getClienteAtual().maisPontoDeFidelidade();
                                compraAberta = false;
                            }else if(resp == 4){
                                caixa.cancelarCompra();
                                compraAberta = false;
                            }
                            
                        }while(compraAberta);
                    }
                }else System.out.println("\n Caixa ainda não aberto! Abra o caixa e refaça a operação");
            }else if(opcao == 3){
                BancoDeDados.cadastraProduto();
                System.out.println("\n Produto cadastrado!");
            }else if(opcao == 4){
                
            }else if(opcao == 5){
                BancoDeDados.cadastraCliente();
                System.out.println("\n Cliente cadastrado!!");
            }else if(opcao == 6){
                BancoDeDados.cadastraFuncionario();
                System.out.println("\n Funcionário cadastrado!!");
            }
        }while(opcao != 0); 
        
        resposta.close();
        InicializarEncerrar.encerraSistema();
        
    }
}
