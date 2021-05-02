package Controle;

import java.io.*;
import java.util.ArrayList;

import Controle.BancoDeDados;
import Itens.Produto;
import Pessoas.Cliente;
import Pessoas.Seguranca;
import Pessoas.Vendedor;


public class Arquivo {

    public static void lerProdutos() {
		try{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Controle\\Produtos.dat"));
			try{
			ArrayList<Produto> p = (ArrayList<Produto>)in.readObject();
			in.close();
			for(Produto produto : p) BancoDeDados.addProduto(produto);
			} catch (ClassNotFoundException e) {
				System.out.println("Erro ao ler a classe");
			}
		}catch(IOException e){
			System.out.println("Erro ao ler");
		}	
    }
	public static void lerVendedor() {
		try{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Controle\\Vendedores.dat"));
			try{
			ArrayList<Vendedor> p = (ArrayList<Vendedor>)in.readObject();
			in.close();
			for(Vendedor vendedor : p) BancoDeDados.addVendedor(vendedor);
			} catch (ClassNotFoundException e) {
				System.out.println();
			}
		}catch(IOException e){
			System.out.println();
		}	
    }
	public static void lerSeguranca() {
		try{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Controle\\Segurancas.dat"));
			try{
			ArrayList<Seguranca> p = (ArrayList<Seguranca>)in.readObject();
			in.close();
			for(Seguranca seguranca : p) BancoDeDados.addSeguranca(seguranca);
			} catch (ClassNotFoundException e) {
				System.out.println();
			}
		}catch(IOException e){
			System.out.println();
		}	
	}
	public static void lerClientes() {
		try{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Controle\\Clientes.dat"));
			try{
			ArrayList<Cliente> p = (ArrayList<Cliente>)in.readObject();
			in.close();
			for(Cliente cliente : p) BancoDeDados.addCliente(cliente);
			} catch (ClassNotFoundException e) {
				System.out.println();
			}
		}catch(IOException e){
			System.out.println();
		}	
	}

	public static void escreveProduto() {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Controle\\Produtos.dat"));
			out.writeObject(BancoDeDados.getProduto());
			out.flush();
			out.close();
		} catch (IOException e) {
			System.out.println("Erro ao salvar os produtos");
			e.printStackTrace();
		}
	}

	public static void escreveVendedor() {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Controle\\Vendedores.dat"));
			out.writeObject(BancoDeDados.getVendedor());
			out.flush();
			out.close();
		} catch (IOException e) {
			System.out.println("Erro ao salvar os vendedores");
		}
	}

	public static void escreveSeguranca() {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Controle\\Segurancas.dat"));
			out.writeObject(BancoDeDados.getSeguranca());
			out.flush();
			out.close();
		} catch (IOException e) {
			System.out.println("Erro ao salvar os segurancas");
		}
	}

	public static void escreveCliente() {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Controle\\Clientes.dat"));
			out.writeObject(BancoDeDados.getClientes());
			out.flush();
			out.close();
		} catch (IOException e) {
			System.out.println("Erro ao salvar os produtos");
		}
	}
    
}
