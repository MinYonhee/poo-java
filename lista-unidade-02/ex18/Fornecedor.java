import java.util.ArrayList;

public class Fornecedor implements Fornecimento {
    private String nome;
    private ArrayList<Produto> produtosFornecidos;

    public Fornecedor(String nome) {
        this.nome = nome;
        this.produtosFornecidos = new ArrayList<>();
    }

    @Override
    public boolean fornecerProduto(Produto produto) {
        return produtosFornecidos.add(produto);
    }

    public void adicionarProduto(Produto produto) {
        produtosFornecidos.add(produto);
    }

    public String listarProdutosFornecidos() {
        StringBuilder sb = new StringBuilder();
        sb.append("Produtos fornecidos por ").append(nome).append(":\n");
        for (Produto p : produtosFornecidos) {
            sb.append("- ").append(p.getNome())
              .append(" (Preço: R$").append(p.getPreco())
              .append(", Desconto: R$").append(p.calcularDesconto()).append(")\n");
        }
        return sb.toString();
    }
}
