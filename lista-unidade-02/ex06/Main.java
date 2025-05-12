public class Main {
    public static void main(String[] args) {
        MetodoPagamento cartao = new CartaoCredito(0.015); // 1.5%
        MetodoPagamento pix = new Pix();
        MetodoPagamento boleto = new Boleto();

        System.out.println("\n--- Tentativa com Cartão de Crédito ---");
        SistemaPagamento.efetuarPagamento(cartao, 200.0);

        System.out.println("\n--- Pagamento com PIX ---");
        SistemaPagamento.efetuarPagamento(pix, 200.0);

        System.out.println("\n--- Pagamento com Boleto ---");
        SistemaPagamento.efetuarPagamento(boleto, 200.0);

        System.out.println("\n--- Tentativa com Cartão (taxa alta) ---");
        MetodoPagamento cartaoRejeitado = new CartaoCredito(0.03); // 3%
        SistemaPagamento.efetuarPagamento(cartaoRejeitado, 200.0);
    }
}
