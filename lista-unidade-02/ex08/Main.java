public class Main {
    public static void main(String[] args) {
        MaterialBiblioteca livro = new Livro("Dom Casmurro", 14);
        MaterialBiblioteca revista = new Revista("National Geographic", 7);
        MaterialBiblioteca dvd = new DVD("Matrix", 3);

        SistemaBiblioteca sistema = new SistemaBiblioteca();

        System.out.println(sistema.registrarEmprestimo(livro));
        System.out.println("Multa: R$" + sistema.calcularMulta(livro, 5));

        System.out.println(sistema.registrarEmprestimo(revista));
        System.out.println("Multa: R$" + sistema.calcularMulta(revista, 3));

        System.out.println(sistema.registrarEmprestimo(dvd));
        System.out.println("Multa: R$" + sistema.calcularMulta(dvd, 1));
    }
}
