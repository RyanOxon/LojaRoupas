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
    private static ArrayList<Cliente> Clientes = new ArrayList<>();

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
    }

    public static void cadastraCliente(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Pronto para cadastrar um novo cliente!\n Digite o nome do cliente:");
        String nome = scan.nextLine();
        System.out.println("Digite o Cpf:");
        String Cpf = scan.nextLine();
        System.out.println("Digite Endereco:");
        String endereco = scan.nextLine();
        System.out.println("Digite o Telefone");
        String telefone = scan.nextLine();
        Clientes.add(new Cliente(nome, Cpf, endereco, telefone));
    }
    
    public static void cadastraFuncionario(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Pronto para cadastrar um novo funcionário!\n Digite o nome do funcionário:");
        String nome = scan.nextLine();
        System.out.println("Digite o Cpf:");
        String Cpf = scan.nextLine();
        System.out.println("Digite Endereco:");
        String endereco = scan.nextLine();
        System.out.println("Digite o Telefone");
        String telefone = scan.nextLine();
        
        System.out.println("Escolha a funcao do funcionario: \n | 1 - Vendedor | 2 - Segurança |");
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
        for(Vendedor vendedor: vendedores){
            if(vendedor.getNome().equals(operador))
                return true;
        }
        return false;
    }

    public static Vendedor achaVendedor(String operador) {
        //Encontrar na ArrayList o operador informado e retornar ele
        for(Vendedor vendedor: vendedores){
            if(vendedor.getNome().equals(operador))
                return vendedor;
        }

            return null;
    }

    public static boolean checkCliente(String nome) {
        //verifica na arrayList se o nome existe
        for(Cliente cliente: Clientes){
            if(cliente.getNome().equals(nome)){
                return true;
            }
        }
        return false;
    }
    
	public static Cliente achaClientes(String nome) {
        for(Cliente cliente: Clientes){
            if(cliente.getNome().equals(nome))
                return cliente;
        }
		return null;
	}

    public static boolean checkSeguranca(String operador) {
        //verificar na ArrayList se o operador informado existe
        for(Seguranca seguranca: segurancas){
            if(seguranca.getNome().equals(operador))
                return true;
        }
        return false;
    }

    public static Seguranca achaSeguranca(String operador) {
        //Encontrar na ArrayList o operador informado e retornar ele
        for(Seguranca seguranca: segurancas){
            if(seguranca.getNome().equals(operador))
                return seguranca;
        }

            return null;
    }

    public static boolean checkProduto(String n) {
        for(Produto produto: produtos){
            if(produto.getDescricao().equals(n)) 
            return true;
        }
        return false;
    }

	public static Produto achaProduto(String n) {
        for(Produto produto: produtos){
            if(produto.getDescricao().equals(n)) 
                return produto;
	    }
        return null;
    }

	public static void printProdutos(){
        System.out.println("-------------ITENS NO ESTOQUE----------------");
        for(Produto p : produtos){
            System.out.println(p.getQtd()+"x | " + p.getDescricao() + " | R$" + p.getValor());
        }
        System.out.println("----------------------------------------------");
	}

	public static void printClientes() {
        System.out.println("-------------Clientes Cadastrados------------");
        for(Cliente c : Clientes){
            System.out.println("|Nome: "+ c.getNome()+ "-> Cpf: " + c.getCpf() 
            + " -> Pontos : " + c.getFidelidade() );
        }
        System.out.println("----------------------------------------------");
	}

    public static void printFuncionarios() {
        System.out.println("-------------Funcionarios Cadastrados------------");
        System.out.println("_________Vendedores:");
        for(Vendedor v : vendedores){
            System.out.println("|Nome: "+ v.getNome()+ "-> Cpf: " + v.getCpf() 
            + "-> Salario: "+ v.getSalario());
        }
        System.out.println("_________Segurancas:");
        for(Seguranca s : segurancas){
            System.out.println("|Nome: "+ s.getNome()+ "-> Cpf: " + s.getCpf() 
            + "-> Salario: "+ s.getSalario());
        }
        System.out.println("----------------------------------------------");
	}
}

