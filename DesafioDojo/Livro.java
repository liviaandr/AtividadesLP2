public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicacao;
    private int isbn;
    private int quantidadeDisponivel;

    public Livro (String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livro(String titulo, String autor, int anoDePublicacao,
                     int isbn, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.isbn = isbn;
        this.quantidadeDisponivel = quantidadeDisponivel;
        Biblioteca.contabilizarLivros += quantidadeDisponivel;
    }

    public int emprestarLivro(){
        if(this.quantidadeDisponivel <=0){
            System.out.println("Livro não disponível.");
            return 0;
        }
        System.out.println("Um livro foi emprestado.");
        return this.quantidadeDisponivel--;

    }

    public int devolverLivro(){
        System.out.println("Um livro foi devolvido.");
        return this.quantidadeDisponivel++;
    }

    public void exibirInformacoes(){
        System.out.println("Titulo: " + titulo + " Ano de publicacao: " + anoDePublicacao +
                " Autor: " + autor + " ISBN: " + isbn + " Quantidade disponivel de livros: "
                 + quantidadeDisponivel);
    }


}
