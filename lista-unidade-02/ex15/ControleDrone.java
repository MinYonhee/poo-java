public class ControleDrone implements ControleAutonomo {
    @Override
    public String iniciarRota(String destino) {
        return "Drone iniciando voo para " + destino + ".";
    }

    @Override
    public String ajustarVelocidade(double velocidade) {
        return "Velocidade do drone ajustada para " + velocidade + " m/s.";
    }
}
