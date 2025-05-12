public class Tablet extends Produto {

    public Tablet(String nome, double preco) {
        super(nome, preco);
    }

    // Não precisa sobrescrever, já usa a garantia padrão de 1 ano
}
