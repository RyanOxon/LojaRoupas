package Sistema;

import Controle.Estoque;
import Itens.Camisa;

public class Main {
    public static void main(String[] args){
        Estoque estoque = new Estoque();
        Camisa camisa = new Camisa("Azul", 1, "G");
        
        estoque.Read(camisa.getDescricao());
        
    }
}
