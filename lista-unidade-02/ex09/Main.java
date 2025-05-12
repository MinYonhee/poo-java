public class Main {
    public static void main(String[] args) {
        Imagem img1 = new ImagemColorida(1920, 1080);
        Imagem img2 = new ImagemPretoBranco(800, 600);
        Imagem img3 = new ImagemTransparente(1024, 768);

        EditorImagem editor = new EditorImagem();

        System.out.println(editor.exibirInformacoes(img1));
        System.out.println(editor.exibirInformacoes(img2));
        System.out.println(editor.exibirInformacoes(img3));

        System.out.println("\nAjustando imagem 1 para 1280x720...");
        Imagem novaImg = editor.ajustarImagem(img1, 1280, 720);
        System.out.println(editor.exibirInformacoes(novaImg));
    }
}
