public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2020, 4);
        Motocicleta moto = new Motocicleta("Yamaha", "MT-03", 2022, "Esportivo");

        System.out.println("Informações do carro:");
        carro.informacoes();

        System.out.println("\nInformações da motocicleta:");
        moto.informacoes();
    }
}
