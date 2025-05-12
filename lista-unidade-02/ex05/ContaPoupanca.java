public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String titular, double saldoInicial, double taxaRendimento) {
        super(titular, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    public void adicionarRendimento() {
        saldo += saldo * taxaRendimento;
    }
}
