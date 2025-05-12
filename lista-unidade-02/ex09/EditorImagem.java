public class EditorImagem {

    public String exibirInformacoes(Imagem imagem) {
        return "Largura: " + imagem.getLargura() + " px, Altura: " + imagem.getAltura() + " px\n" +
               "Processamento: " + imagem.processar();
    }

    public Imagem ajustarImagem(Imagem imagem, int novaLargura, int novaAltura) {
        if (imagem instanceof ImagemColorida) {
            return new ImagemColorida(novaLargura, novaAltura);
        } else if (imagem instanceof ImagemPretoBranco) {
            return new ImagemPretoBranco(novaLargura, novaAltura);
        } else if (imagem instanceof ImagemTransparente) {
            return new ImagemTransparente(novaLargura, novaAltura);
        }
        return null;
    }
}
