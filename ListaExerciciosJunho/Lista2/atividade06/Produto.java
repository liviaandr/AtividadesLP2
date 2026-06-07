package atividade06;

public class Produto {
    private String nome;
    private int preco;
    private double peso;

    public Produto() {
        this("Produto sem nome", 0, 0.0);
    }

    public Produto(int preco, double peso) {
        this("Produto sem nome", preco, peso);
    }

    public Produto(String nome, double peso) {
        this(nome, 0, peso);
    }

    public Produto(String nome, int preco) {
        this(nome, preco, 0.0);
    }

    public Produto(String nome, int preco, double peso) {
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Peso: " + this.peso);
    }
}
