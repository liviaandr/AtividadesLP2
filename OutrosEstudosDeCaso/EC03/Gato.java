package EC03;

public class Gato extends Animal {
    private String pelagem;

    @Override
    public void emitirSom() {
        System.out.println("Miau.");
    }
}
