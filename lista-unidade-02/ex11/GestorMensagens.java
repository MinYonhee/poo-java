public class GestorMensagens {
    public boolean enviarMensagem(EnvioMensagem envio, String mensagem) {
        boolean sucesso = envio.enviar(mensagem);
        System.out.println(envio.obterStatus());
        return sucesso;
    }
}
