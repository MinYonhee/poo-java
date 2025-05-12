public class ImagemColorida extends Imagem {
    public ImagemColorida(int largura, int altura) {
        super(largura, altura);
    }

    @Override
    public String processar() {
        return "Filtro de saturação aplicado à imagem colorida.";
    }
}

public class ImagemPretoBranco extends Imagem {
    public ImagemPretoBranco(int largura, int altura) {
        super(largura, altura);
    }

    @Override
    public String processar() {
        return "Imagem convertida para preto e branco.";
    }
}

public class ImagemTransparente extends Imagem {
    public ImagemTransparente(int largura, int altura) {
        super(largura, altura);
    }

    @Override
    public String processar() {
        return "Máscara de transparência aplicada à imagem.";
    }
}
