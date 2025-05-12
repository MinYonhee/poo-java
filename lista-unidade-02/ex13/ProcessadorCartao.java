public class ProcessadorCartao implements ProcessadorPagamento {
    @Override
    public boolean autorizarPagamento(double valor) {
        System.out.println("Autorizando pagamento com cartão...");
        return valor <= 1000; // simulação: cartões só autorizam até R$1000
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Processando pagamento com cartão...");
        return true;
    }
}
