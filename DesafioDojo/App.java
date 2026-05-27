public class App {
    public static void main(String[] args) {
        Livro livro1 = new Livro("A Bela e a Fera", "Irmãos Green",
                1975, 12345, 2);
        Livro livro2 = new Livro("Pequeno Principe", "Antonio",
                1943, 56473, 5);
        Usuario lana = new Usuario();
        Biblioteca biblioteca = new Biblioteca();

        livro1.exibirInformacoes();
        livro1.emprestarLivro();
        livro1.emprestarLivro();
        livro1.emprestarLivro();
        livro1.exibirInformacoes();
        livro1.devolverLivro();
        livro1.exibirInformacoes();

        livro2.emprestarLivro();
        livro2.exibirInformacoes();
        Biblioteca.exibirTotalLivros();
    }
}
