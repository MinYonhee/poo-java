public class Computador extends Produto {

    public Computador(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public int calcularGarantia() {
        return 3;
    }
}
