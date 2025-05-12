import java.util.ArrayList;

public class Usuario {
    private String nome;
    private ArrayList<Material> materiaisEmprestados;

    public Usuario(String nome) {
        this.nome = nome;
        this.materiaisEmprestados = new ArrayList<>();
    }

    public void adicionarMaterial(Material material) {
        materiaisEmprestados.add(material);
    }

    public boolean removerMaterial(Material material) {
        return materiaisEmprestados.remove(material);
    }

    public String listarMateriaisEmprestados() {
        StringBuilder sb = new StringBuilder();
        sb.append("Materiais emprestados por ").append(nome).append(":\n");
        for (Material m : materiaisEmprestados) {
            sb.append("- ").append(m.informarMaterial()).append("\n");
        }
        return sb.toString();
    }

    public String getNome() {
        return nome;
    }
}
