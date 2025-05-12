import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GestorProjeto {
    private List<MembroEquipe> equipe = new ArrayList<>();

    public void adicionarMembro(MembroEquipe membro) {
        equipe.add(membro);
    }

    public String exibirRelatorio(MembroEquipe membro) {
        return membro.obterDetalhes() + " | Tarefa: " + membro.trabalhar();
    }

    public List<MembroEquipe> listarEquipePorProjeto(String projeto) {
        return equipe.stream()
                     .filter(m -> m.getProjeto().equals(projeto))
                     .collect(Collectors.toList());
    }
}
