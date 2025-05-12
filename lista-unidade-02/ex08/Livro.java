public class Livro extends MaterialBiblioteca {
    public Livro(String titulo, int prazoDevolucao) {
        super(titulo, prazoDevolucao);
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 1.0;
    }
}

public class Revista extends MaterialBiblioteca {
    public Revista(String titulo, int prazoDevolucao) {
        super(titulo, prazoDevolucao);
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 2.0;
    }
}

public class DVD extends MaterialBiblioteca {
    public DVD(String titulo, int prazoDevolucao) {
        super(titulo, prazoDevolucao);
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso > 0 ? 5.0 : 0.0;
    }
}
