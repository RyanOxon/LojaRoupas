package Carrinho;

import Itens.Produto;
import java.util.*;

public class Carrinho {
    
    Set<Produto> carrinho = new HashSet<>();
    
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
}
