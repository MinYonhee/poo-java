public class Zoologico {
    private Animal[] animais;

    public Zoologico() {
        animais = new Animal[2];
        animais[0] = new Cachorro("Rex");
        animais[1] = new Gato("Mimi");
    }

    public void emitirSons() {
        for (Animal a : animais) {
            System.out.print(a.getNome() + ": ");
            a.som();
        }
    }
}
