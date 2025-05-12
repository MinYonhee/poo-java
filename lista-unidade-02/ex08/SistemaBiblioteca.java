public class SistemaBiblioteca {

    public String registrarEmprestimo(MaterialBiblioteca material) {
        return "Material emprestado: " + material.getTitulo() + 
               " | Prazo de devolução: " + material.getPrazoDevolucao() + " dias";
    }

    public double calcularMulta(MaterialBiblioteca material, int diasAtraso) {
        return material.calcularMulta(diasAtraso);
    }
}
