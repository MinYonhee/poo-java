public class ExportadorCSV implements ExportadorRelatorio {
    @Override
    public String exportar(String titulo, String conteudo) {
        return "Relatório exportado em CSV:\n" + titulo + "," + conteudo;
    }
}
