public class Moto extends Veiculo implements Reservavel {

    public Moto(String modelo, int capacidade) {
        super(modelo, capacidade);
    }

    @Override
    public double calcularTempo(double distancia) {
        double velocidade = 100.0; // km/h
        return distancia / velocidade;
    }

    @Override
    public boolean reservar(String data, Rota rota) {
        System.out.println("Moto reservada para " + data + " na rota " + rota.getOrigem() + " -> " + rota.getDestino());
        return true;
    }
}
