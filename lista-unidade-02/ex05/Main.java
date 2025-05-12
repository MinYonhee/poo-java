public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Conta cc = new ContaCorrente("Ana", 1000, 5);
        Conta cp = new ContaPoupanca("Bruno", 1500, 0.02);
        Conta cs = new ContaSalario("Carlos", 800, 2);

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);
        banco.adicionarConta(cs);

        cc.sacar(100); 
        cp.depositar(200);
        ((ContaPoupanca) cp).adicionarRendimento();
        cs.sacar(300);
        cs.sacar(300);
        cs.sacar(100);

        banco.gerarRelatorio();
    }
}
