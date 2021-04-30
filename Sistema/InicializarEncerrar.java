package Sistema;

import Controle.Arquivo;

public abstract class InicializarEncerrar {
    static boolean sistemaFuncionando = true;
    protected static void iniciaSistema(){
        Arquivo.lerProdutos();
        Arquivo.lerClientes();
        Arquivo.lerSeguranca();
        Arquivo.lerVendedor();
    }
    protected static void encerraSistema(){
        if()
    }
}
