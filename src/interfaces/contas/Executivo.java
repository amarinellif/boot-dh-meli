package interfaces.contas;


import interfaces.ContaAbstrata;

import java.util.Scanner;

public class Executivo extends ContaAbstrata {
    public Executivo() {
    }

    public Executivo(String nomeCliente, String contaCliente, Double saldo) {
        super(nomeCliente, contaCliente, saldo);
    }

    @Override
    public void sair() {
        System.out.println("Até mais, " + this.getNomeCliente());
    }

    public void deposito() {
        System.out.println("Depósito executado.");
    }

    public void transferencia() {
        // Aqui considera que foi feito uma verificação na transação
        boolean sucessoOperacao = false;

        if (sucessoOperacao) {
            this.transacaoOk();
        } else {
            this.transacaoNaoOk();
        }
    }


    public void opcaoMenu(int indiceMenu) {
        switch (indiceMenu) {
            case 1:
                deposito();
                break;
            case 2:
                transferencia();
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
        System.out.println("PERFIL EXECUTIVO:\n" +
                "Escolha a operação que deseja executar (1 a 3):\n" +
                "1- Depósito;\n" +
                "2- Transferência;\n" +
                "3- Sair;");
        if (opcao > 3 || opcao < 1) {
            System.out.println("Opção inválida, o valor deve de 1 a 4");
        }
        try {
            opcao = scan.nextInt();
            opcaoMenu(opcao);

        } catch (Exception exception) {
            System.out.println("Opção inválida");
        }
    }

}