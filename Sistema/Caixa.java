
package Sistema;

import Controle.BancoDeDados;
import Itens.Produto;
import Pessoas.Cliente;
import Pessoas.Seguranca;
import Pessoas.Vendedor;

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
    
    public void setOcupado(boolean b){
        this.ocupado = b;
    }

    public void ocupaCaixaVazio(Vendedor usuario){
        this.usuario = usuario;
    }

    public void setSeguranca(Seguranca seguranca){
        this.seguranca = seguranca;
    }
    
    public Seguranca getSeguranca(){
        return this.seguranca;
    }
    
    public void finalizarCompra(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor recebido");
        Double recebido = Double.parseDouble(scan.nextLine());
        if(recebido.equals(this.getTotal())){
            System.out.println("Pagamento recebido \n Sem troco");
            this.setOcupado(false);
            System.out.println("Compra encerrada!");
            
        }else if(recebido> this.getTotal()){
            Double troco = recebido - this.getTotal();
            System.out.println("Pagamento recebido \n Troco de " + troco);
            this.setOcupado(false);
            System.out.println("Compra encerrada!");
            
        }else System.out.println("Valor invalido!");
        
        if(!this.ocupado){
            for(Produto p : carrinho){
                BancoDeDados.achaProduto(p.getDescricao()).decrementaQtd();
            } carrinho.clear();
        }

    }
    
    public void cancelarCompra(){
        carrinho.clear();
        this.setOcupado(false);
    }

    public void getCarrinho(){
        for(Produto p : carrinho){
            System.out.print(" | "+ p.getDescricao());
        } System.out.print(" | \n");
    }

    public boolean estaNoCarrinho(String n) {
        for(Produto p : carrinho){
            if(p.getDescricao().equals(n)) 
                return true;
        }
        return false;
    }
}
