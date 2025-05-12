public class ExportadorPDF implements ExportadorRelatorio {
    @Override
    public String exportar(String titulo, String conteudo) {
        return "Relatório exportado em PDF:\nTítulo: " + titulo + "\nConteúdo: " + conteudo;
    }
}
