import java.util.ArrayList;

public class Rota {
    private String origem;
    private String destino;
    private ArrayList<Veiculo> veiculosDisponiveis;

    public Rota(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
        this.veiculosDisponiveis = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculosDisponiveis.add(veiculo);
    }

    public String listarVeiculos() {
        StringBuilder sb = new StringBuilder("Veículos disponíveis:\n");
        for (Veiculo v : veiculosDisponiveis) {
            sb.append("- ").append(v.getModelo())
              .append(" (Capacidade: ").append(v.getCapacidade()).append(")\n");
        }
        return sb.toString();
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }
}
