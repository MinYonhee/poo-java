public class Main {
    public static void main(String[] args) {
        SistemaPagamento sistema = new SistemaPagamento();

        ProcessadorPagamento cartao = new ProcessadorCartao();
        ProcessadorPagamento pix = new ProcessadorPix();
        ProcessadorPagamento boleto = new ProcessadorBoleto();

        System.out.println("=== Pagamento com Cartão ===");
        sistema.realizarPagamento(cartao, 500);

        System.out.println("\n=== Pagamento com Pix ===");
        sistema.realizarPagamento(pix, 2000);

        System.out.println("\n=== Pagamento com Boleto (R$8) ===");
        sistema.realizarPagamento(boleto, 8);

        System.out.println("\n=== Pagamento com Boleto (R$20) ===");
        sistema.realizarPagamento(boleto, 20);
    }
}
