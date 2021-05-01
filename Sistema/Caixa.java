package Sistema;

import Itens.Produto;
import Pessoas.Cliente;
import Pessoas.Vendedor;


import java.util.*;

public class Caixa {
    private Vendedor usuario;
    private Cliente clienteAtual;
    
    Set<Produto> carrinho = new HashSet<>();

    public Caixa(Vendedor vendedor) {
        this.setUsuario(vendedor);
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
}
