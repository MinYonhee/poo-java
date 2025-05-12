public class Main {
    public static void main(String[] args) {
        SistemaRelatorios sistema = new SistemaRelatorios();

        ExportadorRelatorio pdf = new ExportadorPDF();
        ExportadorRelatorio csv = new ExportadorCSV();
        ExportadorRelatorio xml = new ExportadorXML();

        String titulo = "Relatório de Vendas";
        String conteudo = "Total: R$ 10.000";

        System.out.println("=== PDF ===");
        System.out.println(sistema.exportarRelatorio(pdf, titulo, conteudo));

        System.out.println("\n=== CSV ===");
        System.out.println(sistema.exportarRelatorio(csv, titulo, conteudo));

        System.out.println("\n=== XML ===");
        System.out.println(sistema.exportarRelatorio(xml, titulo, conteudo));
    }
}
