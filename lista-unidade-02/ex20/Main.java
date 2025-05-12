public class Main {
    public static void main(String[] args) {
        Rota rota1 = new Rota("Recife", "Olinda");

        Onibus onibus = new Onibus("Volare V8", 30);
        Carro carro = new Carro("Fiat Argo", 5);
        Moto moto = new Moto("Honda CB500", 2);

        rota1.adicionarVeiculo(onibus);
        rota1.adicionarVeiculo(carro);
        rota1.adicionarVeiculo(moto);

        System.out.println(rota1.listarVeiculos());

        double distancia = 20.0;

        System.out.println("Tempo estimado com ônibus: " + onibus.calcularTempo(distancia) + " horas");
        System.out.println("Tempo estimado com carro: " + carro.calcularTempo(distancia) + " horas");
        System.out.println("Tempo estimado com moto: " + moto.calcularTempo(distancia) + " horas");

        onibus.reservar("12/05/2025", rota1);
        carro.reservar("12/05/2025", rota1);
        moto.reservar("12/05/2025", rota1);
    }
}
