public class SistemaAutonomo {
    public String navegar(ControleAutonomo controle, String destino, double velocidade) {
        String rota = controle.iniciarRota(destino);
        String ajuste = controle.ajustarVelocidade(velocidade);
        return rota + "\n" + ajuste;
    }
}
