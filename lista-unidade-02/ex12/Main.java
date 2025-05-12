public class Main {
    public static void main(String[] args) {
        GestorDeDescontos gestor = new GestorDeDescontos();

        double precoOriginal = 200.0;

        EstrategiaDesconto fidelidade = new DescontoFidelidade();
        EstrategiaDesconto sazonal = new DescontoSazonal();
        EstrategiaDesconto promocional = new DescontoPromocional();

        System.out.println("=== Desconto Fidelidade ===");
        gestor.aplicarDesconto(fidelidade, precoOriginal);

        System.out.println("\n=== Desconto Sazonal ===");
        gestor.aplicarDesconto(sazonal, precoOriginal);

        System.out.println("\n=== Desconto Promocional ===");
        gestor.aplicarDesconto(promocional, precoOriginal);
    }
}
