public class SistemaPagamento {

    public static boolean efetuarPagamento(MetodoPagamento metodo, double valor) {
        boolean sucesso = metodo.processarPagamento(valor);

        if (metodo instanceof Pix) {
            System.out.println("Taxa aplicada: R$ 0 (PIX)");
        } else if (metodo instanceof Boleto) {
            System.out.println("Taxa aplicada: R$ 5 (fixa do Boleto)");
        } else {
            System.out.println("Taxa aplicada: R$ " + metodo.calcularTaxa(valor));
        }

        return sucesso;
    }
}
