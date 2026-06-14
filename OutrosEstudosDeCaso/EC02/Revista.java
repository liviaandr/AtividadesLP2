package EC02;

public class Revista extends ItemBiblioteca {
    private int edicao;

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Edição: " + this.edicao);
    }
}
