public class Main {
    public static void main(String[] args) {
        GestorProjeto gestor = new GestorProjeto();

        MembroEquipe dev = new Desenvolvedor("Beatriz", "App Saúde Animal");
        MembroEquipe designer = new Designer("Lucas", "App Saúde Animal");
        MembroEquipe gerente = new GerenteDeProjetos("Ana", "Portal Administrativo");

        gestor.adicionarMembro(dev);
        gestor.adicionarMembro(designer);
        gestor.adicionarMembro(gerente);

        System.out.println(gestor.exibirRelatorio(dev));
        System.out.println(gestor.exibirRelatorio(designer));
        System.out.println(gestor.exibirRelatorio(gerente));

        System.out.println("\nEquipe do projeto 'App Saúde Animal':");
        for (MembroEquipe membro : gestor.listarEquipePorProjeto("App Saúde Animal")) {
            System.out.println(membro.obterDetalhes());
        }
    }
}
