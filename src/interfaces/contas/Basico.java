package interfaces.contas;

import interfaces.ContaAbstrata;

import java.util.Scanner;

public class Basico extends ContaAbstrata {

    public Basico() {
    }

    public Basico(String nomeCliente, String contaCliente, Double saldo) {
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

    public void pagamentos() {
        // Aqui considera que foi feito uma verificação na transação
        boolean sucessoOperacao = true;

        if (sucessoOperacao) {
            this.transacaoOk();
        } else {
            this.transacaoNaoOk();
        }
    }


    public void opcaoMenu(int indiceMenu) {
        switch (indiceMenu) {
            case 1:
                consultaSaldo();
                break;
            case 2:
                saque();
                break;
            case 3:
                pagamentos();
                break;
            case 4:
                sair();
                break;
        }
    }

    @Override
    public void exibirMenu() {
        int opcao = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("PERFIL BÁSICO:\n" +
                "Escolha a operação que deseja executar (1 a 4):\n" +
                "1- Consultar saldo;\n" +
                "2- Saque;\n" +
                "3- Pagametos de serviços;\n" +
                "4- Sair;");
        try {
            opcao = scan.nextInt();
            opcaoMenu(opcao);

            if(opcao>4 || opcao<1){
                System.out.println("Opção inválida, o valor deve de 1 a 4");
            }
        } catch (Exception exception) {
            System.out.println("Opção inválida");
        }
    }
}