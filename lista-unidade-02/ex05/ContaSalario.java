public class ContaSalario extends Conta {
    private int saquesRealizados = 0;
    private int limiteSaques;

    public ContaSalario(String titular, double saldoInicial, int limiteSaques) {
        super(titular, saldoInicial);
        this.limiteSaques = limiteSaques;
    }

    @Override
    public boolean sacar(double valor) {
        if (saquesRealizados < limiteSaques && valor <= saldo) {
            saldo -= valor;
            saquesRealizados++;
            return true;
        } else {
            System.out.println("Limite de saques atingido ou saldo insuficiente em Conta Salário.");
            return false;
        }
    }
}
