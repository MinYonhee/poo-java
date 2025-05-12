public class Main {
    public static void main(String[] args) {
        GestorMensagens gestor = new GestorMensagens();

        EnvioMensagem email = new EnvioEmail();
        EnvioMensagem sms = new EnvioSMS();
        EnvioMensagem whatsapp = new EnvioWhatsApp();

        gestor.enviarMensagem(email, "Olá! Esta é uma mensagem por e-mail.");
        gestor.enviarMensagem(sms, "Seu código de verificação é 123456.");
        gestor.enviarMensagem(whatsapp, "Bom dia! Podemos conversar?");
    }
}
