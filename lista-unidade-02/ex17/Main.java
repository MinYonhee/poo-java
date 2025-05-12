public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Beatriz");

        LivroEmprestavel livro = new LivroEmprestavel("Java para Iniciantes");

        if (livro.emprestar(usuario)) {
            System.out.println("Livro emprestado com sucesso!");
        } else {
            System.out.println("Livro já está emprestado.");
        }

        System.out.println(usuario.listarMateriaisEmprestados());

        if (livro.devolver(usuario)) {
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Erro ao devolver o livro.");
        }

        System.out.println(usuario.listarMateriaisEmprestados());
    }
}
