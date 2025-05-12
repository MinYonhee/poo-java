public class GestorDeDescontos {
    public double aplicarDesconto(EstrategiaDesconto estrategia, double preco) {
        double desconto = estrategia.calcularDesconto(preco);
        double novoPreco = preco - desconto;
        System.out.printf("Desconto aplicado: R$%.2f%n", desconto);
        System.out.printf("Preço final: R$%.2f%n", novoPreco);
        return novoPreco;
    }
}
