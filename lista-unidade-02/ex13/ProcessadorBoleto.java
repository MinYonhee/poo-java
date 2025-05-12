public class ProcessadorBoleto implements ProcessadorPagamento {
    @Override
    public boolean autorizarPagamento(double valor) {
        System.out.println("Autorizando pagamento via boleto...");
        return valor > 10; // só autoriza valores acima de R$10
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Processando pagamento via boleto...");
        return true;
    }
}
