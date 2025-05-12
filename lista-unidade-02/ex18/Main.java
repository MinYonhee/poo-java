public class Main {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor("Distribuidora ABC");

        Produto tv = new Eletronico("Smart TV", 3000.00);
        Produto arroz = new Alimento("Arroz Integral", 20.00);
        Produto camisa = new Vestuario("Camisa Polo", 80.00);

        fornecedor.fornecerProduto(tv);
        fornecedor.fornecerProduto(arroz);
        fornecedor.fornecerProduto(camisa);

        System.out.println(fornecedor.listarProdutosFornecidos());
    }
}
