public class Onibus extends Veiculo implements Reservavel {

    public Onibus(String modelo, int capacidade) {
        super(modelo, capacidade);
    }

    @Override
    public double calcularTempo(double distancia) {
        double velocidade = 60.0; // km/h
        return distancia / velocidade;
    }

    @Override
    public boolean reservar(String data, Rota rota) {
        System.out.println("Ônibus reservado para " + data + " na rota " + rota.getOrigem() + " -> " + rota.getDestino());
        return true;
    }
}
