package Controle;

import Arquivos.Arquivo;
import Itens.Produto;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Estoque {
    private static String arquivo = "Estoque.txt";
    
    /*
    public void ler(){
        for(int i = 0; i<3; i++){
            String conteudo = Arquivo.Read(arq);
            String descricao = conteudo.split(";")[0];
            String qtd = conteudo.split(";")[1];

            System.out.println(descricao + " " + qtd);
        }
        
    }*/
    
    public static int ConferirEstoque(String prod, int quantidade_necessaria){
        String conteudo = "";
        String descricao;
        String qtd_estoque;
        int quantidade_estoque;
        
        try {
            FileReader arq = new FileReader(arquivo);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha="";
            try {
                while((linha = lerArq.readLine()) != null){

                    descricao = linha.split(";")[0];
                    qtd_estoque = linha.split(";")[1];
                    quantidade_estoque = Integer.parseInt(qtd_estoque);

                    if(prod.equals(descricao)){
                        System.out.println(descricao + " " + qtd_estoque);
                        if(quantidade_estoque >= quantidade_necessaria)
                            return 1;
                        else
                            return 0;
                    } 
                }
                arq.close();
                
            } catch (IOException ex) {
                System.out.println("Erro: Não foi possível ler o arquivo!");
                return -1;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: Arquivo não encontrado!");
            return -1;
        }
        
        return -1;
    }
}
