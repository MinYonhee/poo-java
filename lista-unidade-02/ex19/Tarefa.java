public abstract class Tarefa {
    protected String descricao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public abstract String realizarTarefa();

    public String getDescricao() {
        return descricao;
    }
}
