public class Main {
    public static void main(String[] args) {
        SistemaAutonomo sistema = new SistemaAutonomo();

        ControleAutonomo carro = new ControleCarro();
        ControleAutonomo drone = new ControleDrone();
        ControleAutonomo navio = new ControleNavio();

        System.out.println("=== Carro ===");
        System.out.println(sistema.navegar(carro, "Recife", 80));

        System.out.println("\n=== Drone ===");
        System.out.println(sistema.navegar(drone, "Ponto de entrega", 12));

        System.out.println("\n=== Navio ===");
        System.out.println(sistema.navegar(navio, "Porto de Santos", 25));
    }
}
