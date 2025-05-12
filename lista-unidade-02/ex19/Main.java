public class Main {
    public static void main(String[] args) {
        MembroEquipe alice = new MembroEquipe("Alice", new Desenvolvedor());
        alice.adicionarTarefa(new Desenvolvimento("Implementar login"));
        alice.adicionarTarefa(new Teste("Testar autenticação"));

        MembroEquipe bob = new MembroEquipe("Bob", new Designer());
        bob.adicionarTarefa(new Design("Criar protótipo da interface"));

        System.out.println(alice.executarPapel());
        System.out.println(alice.listarTarefas());

        System.out.println(bob.executarPapel());
        System.out.println(bob.listarTarefas());
    }
}
