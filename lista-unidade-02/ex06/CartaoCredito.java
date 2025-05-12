public class CartaoCredito extends MetodoPagamento {

    public CartaoCredito(double taxa) {
        super(taxa);
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (taxa < 0.02) {
            double totalComTaxa = valor + calcularTaxa(valor);
            System.out.println("Pagamento com Cartão de Crédito aprovado. Total: R$ " + totalComTaxa);
            return true;
        } else {
            System.out.println("Pagamento com Cartão recusado: taxa muito alta.");
            return false;
        }
    }
}
