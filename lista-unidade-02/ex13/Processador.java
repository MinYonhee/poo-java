public interface ProcessadorPagamento {
    boolean autorizarPagamento(double valor);
    boolean processarPagamento(double valor);
}
