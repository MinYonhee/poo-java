public class ContaCorrente extends Conta {
    private double taxa;

    public ContaCorrente(String titular, double saldoInicial, double taxa) {
        super(titular, saldoInicial);
        this.taxa = taxa;
    }

    @Override
    public boolean sacar(double valor) {
        double total = valor + taxa;
        if (total <= saldo) {
            saldo -= total;
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque com taxa em Conta Corrente.");
            return false;
        }
    }
}
