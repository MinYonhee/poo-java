public class LivroEmprestavel extends Livro implements Emprestavel {
    private boolean emprestado;

    public LivroEmprestavel(String titulo) {
        super(titulo);
        this.emprestado = false;
    }

    @Override
    public boolean emprestar(Usuario usuario) {
        if (!emprestado) {
            emprestado = true;
            usuario.adicionarMaterial(this);
            return true;
        }
        return false;
    }

    @Override
    public boolean devolver(Usuario usuario) {
        if (emprestado) {
            emprestado = false;
            return usuario.removerMaterial(this);
        }
        return false;
    }
}
