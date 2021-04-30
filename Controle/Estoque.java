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
    
    public static String Read(String prod){
        String conteudo = "";
        String descricao;
        String qtd;
        try {
            FileReader arq = new FileReader(arquivo);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha="";
            try {
                while((linha = lerArq.readLine()) != null){

                    descricao = linha.split(";")[0];
                    qtd = linha.split(";")[1];

                    System.out.println(descricao + " " + qtd);
                }
                
                //linha = lerArq.readLine();
                
                arq.close();
                return conteudo;
            } catch (IOException ex) {
                System.out.println("Erro: Não foi possível ler o arquivo!");
                return "";
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: Arquivo não encontrado!");
            return "";
        }
    }
    
    public static boolean Write(String Caminho,String Texto){
        try {
            FileWriter arq = new FileWriter(Caminho);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(Texto);
            gravarArq.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
}
