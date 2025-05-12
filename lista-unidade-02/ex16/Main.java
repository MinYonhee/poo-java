public class Main {
    public static void main(String[] args) {
        Prato prato = new Prato("Prato Fitness");

        prato.adicionarIngrediente(new Proteina("Frango", 150));
        prato.adicionarIngrediente(new Carboidrato("Arroz Integral", 100));
        prato.adicionarIngrediente(new Tempero("Sal", 5));

        PratoSimples preparo = new PratoSimples();

        System.out.println(prato.listarIngredientes());
        System.out.println("Modo de preparo: " + preparo.preparar());
    }
}
