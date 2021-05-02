package Controle;

import java.io.*;
import java.util.ArrayList;

import Itens.Produto;
import Pessoas.Cliente;
import Pessoas.Seguranca;
import Pessoas.Vendedor;


public class Arquivo {

    public static void lerProdutos() {
		try{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Produtos.dat"));
			try{
			ArrayList<Produto> p = (ArrayList<Produto>)in.readObject();
			in.close();
			for(Produto produto : p) BancoDeDados.addProduto(produto);
			} catch (ClassNotFoundException e) {
                                //e.printStackTrace();
                                System.out.println("Arquvio de produtos vazio!");
			}
		}catch(IOException e){
                        e.printStackTrace();
		}	
    }
	public static void lerVendedor() {
		try{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Vendedores.dat"));
			try{
			ArrayList<Vendedor> p = (ArrayList<Vendedor>)in.readObject();
			in.close();
			for(Vendedor vendedor : p) BancoDeDados.addVendedor(vendedor);
			} catch (ClassNotFoundException e) {
				//e.printStackTrace();
                                System.out.println("Arquvio de vandedores vazio!");
			}
		}catch(IOException e){
			e.printStackTrace();
		}	
    }
	public static void lerSeguranca() {
		try{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Segurancas.dat"));
			try{
			ArrayList<Seguranca> p = (ArrayList<Seguranca>)in.readObject();
			in.close();
			for(Seguranca seguranca : p) BancoDeDados.addSeguranca(seguranca);
			} catch (ClassNotFoundException e) {
				//e.printStackTrace();
                                System.out.println("Arquvio de seguranças vazio!");
			}
		}catch(IOException e){
			e.printStackTrace();
		}	
	}
	public static void lerClientes() {
		try{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Clientes.dat"));
			try{
			ArrayList<Cliente> p = (ArrayList<Cliente>)in.readObject();
			in.close();
			for(Cliente cliente : p) BancoDeDados.addCliente(cliente);
			} catch (ClassNotFoundException e) {
				//e.printStackTrace();
                                System.out.println("Arquvio de clientes vazio!");
			}
		}catch(IOException e){
			e.printStackTrace();
		}	
	}

	public static void escreveProduto() {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Produtos.dat"));
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
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Vendedores.dat"));
			out.writeObject(BancoDeDados.getVendedor());
			out.flush();
			out.close();
		} catch (IOException e) {
			System.out.println("Erro ao salvar os vendedores");
		}
	}

	public static void escreveSeguranca() {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Segurancas.dat"));
			out.writeObject(BancoDeDados.getSeguranca());
			out.flush();
			out.close();
		} catch (IOException e) {
			System.out.println("Erro ao salvar os segurancas");
		}
	}

	public static void escreveCliente() {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Clientes.dat"));
			out.writeObject(BancoDeDados.getClientes());
			out.flush();
			out.close();
		} catch (IOException e) {
			System.out.println("Erro ao salvar os produtos");
		}
	}
    
}
