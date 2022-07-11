package interfaces;

public abstract class ContaAbstrata implements Transacao{
    private String nomeCliente;
    private String contaCliente;
    private Double saldo;

    public ContaAbstrata() {
    }

    public ContaAbstrata(String nomeCliente, String contaCliente, Double saldo) {
        this.nomeCliente = nomeCliente;
        this.contaCliente = contaCliente;
        this.saldo = saldo;
    }

    public abstract void exibirMenu();

    public abstract void sair();

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getContaCliente() {
        return contaCliente;
    }

    public void setContaCliente(String contaCliente) {
        this.contaCliente = contaCliente;
    }

    public void transacaoOk() {
        System.out.println("A transação está okay");
    }

    public void transacaoNaoOk() {
        System.out.println("A transação não está okay");
    }

}
