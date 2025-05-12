public class ControleNavio implements ControleAutonomo {
    @Override
    public String iniciarRota(String destino) {
        return "Navio autônomo navegando para " + destino + ".";
    }

    @Override
    public String ajustarVelocidade(double velocidade) {
        return "Velocidade do navio ajustada para " + velocidade + " nós.";
    }
}
