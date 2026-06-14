package EC02;

public class ItemBiblioteca {
    protected String titulo;
    protected int codigo;

    public void exibirInformacoes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Código: " + this.codigo);
    }
}
