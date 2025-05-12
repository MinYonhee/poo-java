import java.util.ArrayList;

public class Empresa {
    private ArrayList<Funcionario> funcionarios;

    public Empresa() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public void calcularFolhaDePagamento() {
        double total = 0;
        for (Funcionario f : funcionarios) {
            double salario = f.calcularSalario();
            System.out.printf("%s - Salário: R$ %.2f\n", f.getNome(), salario);
            total += salario;
        }
        System.out.printf("\nTotal da folha de pagamento: R$ %.2f\n", total);
    }
}
