package EC04;

public class Onibus extends Transporte{
    private int linha;

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Linha: " + this.linha);
    }
}
