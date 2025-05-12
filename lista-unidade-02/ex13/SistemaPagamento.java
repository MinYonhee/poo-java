public class SistemaPagamento {
    public boolean realizarPagamento(ProcessadorPagamento processador, double valor) {
        if (processador.autorizarPagamento(valor)) {
            return processador.processarPagamento(valor);
        } else {
            System.out.println("Pagamento não autorizado.");
            return false;
        }
    }
}
