public class DescontoPromocional implements EstrategiaDesconto {
    @Override
    public double calcularDesconto(double preco) {
        return 20.0; 
    }
}
