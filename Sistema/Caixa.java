package Sistema;

import Itens.Produto;
import Pessoas.Cliente;
import Pessoas.Vendedor;


import java.util.*;

public class Caixa {
    private Vendedor usuario;
    private Cliente clienteAtual;
    private boolean ocupado;
    
    Set<Produto> carrinho = new HashSet<>();

    public Caixa(){
        this.ocupado = false;
    }
    
    public Caixa(Vendedor vendedor) {
        this.setUsuario(vendedor);
        this.ocupado = true;
    }

    public Cliente getClienteAtual() {
        return clienteAtual;
    }

    public void setClienteAtual(Cliente clienteAtual) {
        this.clienteAtual = clienteAtual;
    }

    public Vendedor getUsuario() {
        return usuario;
    }

    public void setUsuario(Vendedor usuario) {
        this.usuario = usuario;
    }

    public void addItem(Produto prod){
        carrinho.add(prod);
    }
    
    public void removeItem(Produto prod){
        carrinho.remove(prod);
    }
    
    public double getTotal(){
        double total = 0;
        
        for(Produto prod: carrinho){
            total += prod.getQtd()*prod.getValor();
        }
        
        return total;
    }
    
    public boolean getOcupado(){
        return this.ocupado;
    }
    
    public void ocupaCaixaVazio(Vendedor usuario){
        this.usuario = usuario;
    }
    
    public void finalizarCompra(){
        new Thread(){
            public void run() {
                try{
                    System.out.println("Realiazndo o pagamento...");
                    
                    Thread.sleep(1300);
                    
                    System.out.println("Pagamanto aceito!");
                }catch(InterruptedException ex){
                    ex.getMessage();
                    System.out.println("Erro ao realizar o pagamento.");
                }
            
            }
            
       }.start();
    }
    
    public void cancelarCompra(){
        for(Produto prod: carrinho){
            removeItem(prod);
        }
    }
    
    public Produto criaProduto(){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite a descricao do produto:");
        String nome = scan.nextLine();
        System.out.println("Digite o tipo do produto");
        String tipo = scan.nextLine();
        System.out.println("Digite a Cor do produto");
        String cor = scan.nextLine();
        System.out.println("Digite o tamanho do produto");
        String tamanho = scan.nextLine();
        System.out.println("Digite a quantidade do produto:");
        int qtd = Integer.parseInt(scan.nextLine());
        System.out.println("Digite a id do produto:");
        int id = Integer.parseInt(scan.nextLine());
        System.out.println("Digite o Valor do produto:");
        double valor = Double.parseDouble(scan.nextLine());
        Produto prod = new Produto(nome, id, qtd, valor, cor, tamanho, tipo);
        scan.close();
        
        
        
        return prod;
    }
}
