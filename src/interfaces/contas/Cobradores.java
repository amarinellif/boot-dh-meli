package interfaces.contas;


import interfaces.ContaAbstrata;

import java.util.Scanner;

public class Cobradores extends ContaAbstrata {

    public Cobradores() {
    }

    public Cobradores(String nomeCliente, String contaCliente, Double saldo) {
        super(nomeCliente, contaCliente, saldo);
    }

    @Override
    public void sair() {
        System.out.println("Até mais, " + this.getNomeCliente());
    }

    public void saque() {
        System.out.println("Saque executado");
    }

    public void consultaSaldo() {
        System.out.println("O saldo é de: R$ " + getSaldo());
    }

    public void opcaoMenu(int indiceMenu) {
        switch (indiceMenu) {
            case 1:
                saque();
                break;
            case 2:
                consultaSaldo();
                break;
            case 3:
                sair();
                break;
        }
    }

    @Override
    public void exibirMenu() {
        int opcao = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("PERFIL COBRADORES:\n" +
                "Escolha a operação que deseja executar (1 a 3):\n" +
                "1- Saque;\n" +
                "2- Consultar saldo;\n" +
                "3- Sair;\n");
        try {
            opcao = scan.nextInt();
            opcaoMenu(opcao);
            if(opcao>3 || opcao<1){
                System.out.println("Opção inválida, o valor deve de 1 a 3");
            }
        } catch (Exception exception) {
            System.out.println("Opção inválida");
        }
    }


}
