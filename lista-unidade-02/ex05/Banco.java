import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void gerarRelatorio() {
        System.out.println("=== Relatório de Contas ===");
        for (Conta c : contas) {
            System.out.println("Titular: " + c.getTitular() +
                               " | Tipo: " + c.getClass().getSimpleName() +
                               " | Saldo: R$ " + c.getSaldo());
        }
    }
}
