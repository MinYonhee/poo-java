public class Boleto extends MetodoPagamento {

    public Boleto() {
        super(0); 
    }

    @Override
    public boolean processarPagamento(double valor) {
        double taxaFixa = 5.0;
        double total = valor + taxaFixa;
        System.out.println("Pagamento com Boleto aprovado. Total com taxa fixa: R$ " + total);
        return true;
    }
}
