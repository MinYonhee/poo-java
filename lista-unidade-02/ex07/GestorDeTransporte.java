public class GestorDeTransporte {
    public String calcularViagem(Veiculo veiculo, double distancia) {
        double tempo = veiculo.calcularTempo(distancia);
        String combustivel = veiculo.tipoDeCombustivel();
        return "Tempo de viagem: " + tempo + " horas | Combustível: " + combustivel;
    }
}
