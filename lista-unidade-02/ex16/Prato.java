import java.util.ArrayList;

public class Prato {
    private String nome;
    private ArrayList<Ingrediente> ingredientes;

    public Prato(String nome) {
        this.nome = nome;
        this.ingredientes = new ArrayList<>();
    }

    public void adicionarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public String listarIngredientes() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ingredientes do prato ").append(nome).append(":\n");
        for (Ingrediente ing : ingredientes) {
            sb.append("- ").append(ing.informar()).append("\n");
        }
        return sb.toString();
    }
}
