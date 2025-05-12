public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    @Override
    public void informacoes() {
        super.informacoes();
        System.out.println("Número de portas: " + numeroDePortas);
    }
}
