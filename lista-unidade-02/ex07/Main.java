public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro(5, 120);
        Veiculo aviao = new Aviao(180, 850);
        Veiculo navio = new Navio(1000, 40);

        GestorDeTransporte gestor = new GestorDeTransporte();

        System.out.println(gestor.calcularViagem(carro, 240));
        System.out.println(gestor.calcularViagem(aviao, 1700));
        System.out.println(gestor.calcularViagem(navio, 800));
    }
}
