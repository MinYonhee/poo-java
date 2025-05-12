public class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    // Não precisa sobrescrever, mas faremos para reforçar o conceito
    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }
}
