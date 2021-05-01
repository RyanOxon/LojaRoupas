package Controle;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import Itens.Produto;


public class BancoDeDados {
    private static ArrayList<Produto> produtos = new ArrayList<>();
    private static ArrayList<Vendedor> vendedores = new ArrayList<>();
    private static ArrayList<Seguranca> segurancas = new ArrayList<>();
    private static ArrayList<Cliente> Clientes = new ArrayList<>();

    public void addProduto(Produto produto){
        produtos.add(produto);
        produto.setId((produtos.size()-1));
    }

    public void cadastraProduto(){
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

}
