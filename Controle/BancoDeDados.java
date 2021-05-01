//package Controle;

import java.util.ArrayList;
import java.util.Scanner;

/*
import Itens.Produto;
import Pessoas.Cliente;
import Pessoas.Seguranca;
import Pessoas.Vendedor;
*/
public class BancoDeDados {
    private static ArrayList<Produto> produtos = new ArrayList<>();
    private static ArrayList<Vendedor> vendedores = new ArrayList<>();
    private static ArrayList<Seguranca> segurancas = new ArrayList<>();
    public static ArrayList<Cliente> Clientes = new ArrayList<>();

    public static ArrayList<Produto> getProduto(){
        return produtos;
    }

    public static ArrayList<Vendedor> getVendedor(){
        return vendedores;
    }

    public static ArrayList<Seguranca> getSeguranca(){
        return segurancas;
    }

    public static ArrayList<Cliente> getClientes(){
        return Clientes;
    }

    public static void cadastraProduto(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Pronto para cadastrar um novo produto!\n Digite a descricao do produto:");
        String nome = scan.nextLine();
        System.out.println("Digite o tipo do produto");
        String tipo = scan.nextLine();
        System.out.println("Digite a Cor do produto");
        String cor = scan.nextLine();
        System.out.println("Digite o tamanho do produto");
        String tamanho = scan.nextLine();
        System.out.println("Digite a quantidade do produto:");
        int qtd = Integer.parseInt(scan.nextLine());
        System.out.println("Digite o Valor do produto:");
        double valor = Double.parseDouble(scan.nextLine());
        produtos.add(new Produto(nome, produtos.size(), qtd, valor, cor, tamanho, tipo));
        scan.close();      
    }

    public static void cadastraPessoa(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Pronto para cadastrar uma nova pessoa!\n Digite o nome da pessoa:");
        String nome = scan.nextLine();
        System.out.println("Digite o Cpf:");
        String Cpf = scan.nextLine();
        System.out.println("Digite Endereco:");
        String endereco = scan.nextLine();
        System.out.println("Digite o Telefone");
        String telefone = scan.nextLine();
        System.out.println("Escolha o tipo de pessoa para o cadastro: \n | 1 - Cliente | 2 - Funcionario |");
        int resposta = Integer.parseInt(scan.nextLine());
        if (resposta == 1){
            Clientes.add(new Cliente(nome, Cpf, endereco, telefone));
        }else if(resposta == 2){
            System.out.println("Escolha a funcao do funcionario: \n | 1 - vendedor | 2 - seguranca |");
            int resp = Integer.parseInt(scan.nextLine());
            if(resp == 1){
                System.out.println("Digite o Salario:");
                int salario = Integer.parseInt(scan.nextLine());
                vendedores.add(new Vendedor(nome, Cpf, endereco, telefone, salario));
            }else if(resp == 2){
                System.out.println("Digite o Salario:");
                int salario = Integer.parseInt(scan.nextLine());
                segurancas.add(new Seguranca(nome, Cpf, endereco, telefone, salario));
            }
        }
        scan.close();  
    }

    public static void addProduto(Produto produto){
        produtos.add(produto);
        produto.setId((produtos.size()-1));
    }

    public static void addCliente(Cliente cliente){
        Clientes.add(cliente);
    }

    public static void addVendedor(Vendedor vendedor){
        vendedores.add(vendedor);
    }

    public static void addSeguranca(Seguranca seguranca){
        segurancas.add(seguranca);
    }

    public static boolean checkVendendor(String operador) {
        //verificar na ArrayList se o operador informado existe
        return false;
    }

	public static Vendedor achaVendedor(String operador) {
        //Encontrar na ArrayList o operador informado e retornar ele
		return null;
	}
}
