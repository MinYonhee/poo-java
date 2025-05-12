public class ProcessadorPix implements ProcessadorPagamento {
    @Override
    public boolean autorizarPagamento(double valor) {
        System.out.println("Autorização instantânea via Pix.");
        return true;
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento via Pix concluído.");
        return true;
    }
}
