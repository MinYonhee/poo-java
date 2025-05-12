public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        empresa.adicionarFuncionario(new Gerente("Ana", 5000, 1500));
        empresa.adicionarFuncionario(new Desenvolvedor("Bruno", 4000, 1.2));
        empresa.adicionarFuncionario(new Estagiario("Carlos", 1500));

        empresa.calcularFolhaDePagamento();
    }
}
