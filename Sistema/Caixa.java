/*
package Sistema;

import Itens.Produto;
import Pessoas.Cliente;
import Pessoas.Vendedor;
*/

import java.util.*;

public class Caixa {
    private Vendedor usuario;
    private Seguranca seguranca;
    private Cliente clienteAtual;
    private boolean ocupado;
    
    Set<Produto> carrinho = new HashSet<>();

    public Caixa(){
        this.ocupado = false;
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

    public void addItem(Produto prod){
        carrinho.add(prod);
    }
    
    public void removeItem(Produto prod){
        carrinho.remove(prod);
    }
    
    public double getTotal(){
        double total = 0;
        
        for(Produto prod: carrinho){
            total += prod.getValor();
        }
        
        return total;
    }
    
    public boolean getOcupado(){
        return this.ocupado;
    }
    
    public void ocupaCaixaVazio(Vendedor usuario){
        this.usuario = usuario;
    }

    public void setSeguranca(Seguranca seguranca){
        this.seguranca = seguranca;
    }
    
    public void finalizarCompra(){
        new Thread(){
            public void run() {
                try{
                    System.out.println("Realizando o pagamento...");
                    
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

    public void getCarrinho(){
        for(Produto p : carrinho){
            System.out.print(" | "+ p.getDescricao());
            System.out.print(" | \n");
        }
    }

    public boolean estaNoCarrinho(String n) {
        for(Produto p : carrinho){
            if(p.getDescricao().equals(n)) 
                return true;
        }
        return false;
    }
}