public class Motocicleta extends Veiculo {
    private String tipoDeGuidao;

    public Motocicleta(String marca, String modelo, int ano, String tipoDeGuidao) {
        super(marca, modelo, ano);
        this.tipoDeGuidao = tipoDeGuidao;
    }

    public String getTipoDeGuidao() {
        return tipoDeGuidao;
    }

    @Override
    public void informacoes() {
        super.informacoes();
        System.out.println("Tipo de guidão: " + tipoDeGuidao);
    }
}
