public class EnvioEmail implements EnvioMensagem {
    private String status;

    @Override
    public boolean enviar(String mensagem) {
        System.out.println("Enviando e-mail: " + mensagem);
        status = "E-mail enviado com sucesso!";
        return true;
    }

    @Override
    public String obterStatus() {
        return status;
    }
}
