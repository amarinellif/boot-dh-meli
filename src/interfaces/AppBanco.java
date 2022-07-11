package interfaces;

import interfaces.contas.*;

public class AppBanco {

    public static void main(String[] args) {
        ContaAbstrata executivo = new Executivo();
        ContaAbstrata basico = new Basico("Luiz", "10101-1", 100.0);
        ContaAbstrata cobrador = new Cobradores("Maria", "20202-2", 200.0);


        //inicializando o executivo;
        executivo.setNomeCliente("Amanda");
        executivo.setContaCliente("00000-0");
        executivo.setSaldo(303030.0);

        //executar menu basico em cada perfil
        executivo.exibirMenu();
        cobrador.exibirMenu();
        basico.exibirMenu();
    }
}
