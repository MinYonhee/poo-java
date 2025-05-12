public class EnvioWhatsApp implements EnvioMensagem {
    private String status;

    @Override
    public boolean enviar(String mensagem) {
        System.out.println("Enviando WhatsApp: " + mensagem);
        status = "Mensagem via WhatsApp enviada com sucesso!";
        return true;
    }

    @Override
    public String obterStatus() {
        return status;
    }
}
