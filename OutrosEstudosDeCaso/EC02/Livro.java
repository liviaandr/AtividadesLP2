package EC02;

public class Livro extends ItemBiblioteca {
    private String autor;
    private int numeroPaginas;

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numeroPaginas);
    }
}
