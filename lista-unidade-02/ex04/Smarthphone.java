public class Smartphone extends Produto {

    public Smartphone(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public int calcularGarantia() {
        return 2;
    }
}
