import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> produtos;

    public Loja() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    public void listarGarantias() {
        for (Produto p : produtos) {
            System.out.println("Produto: " + p.getNome() +
                               " | Garantia: " + p.calcularGarantia() + " ano(s)");
        }
    }
}
