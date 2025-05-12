public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja();

        Produto pc = new Computador("PC Gamer", 5000);
        Produto celular = new Smartphone("iPhone", 7000);
        Produto tablet = new Tablet("Samsung Tab", 2000);

        loja.adicionarProduto(pc);
        loja.adicionarProduto(celular);
        loja.adicionarProduto(tablet);

        loja.listarGarantias();
    }
}
