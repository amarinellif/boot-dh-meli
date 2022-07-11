package interfaces;

public interface Transacao {
    //Considerei apenas que depósitos, pagamentos e transferências tenham essa verificação
    public void transacaoOk();

    public void transacaoNaoOk();
}