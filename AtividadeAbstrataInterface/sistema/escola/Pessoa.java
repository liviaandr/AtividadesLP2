package sistema.escola;

import java.util.Scanner;

abstract class Pessoa {
    protected Scanner sc = new Scanner(System.in);
    protected String nome;
    protected int matricula;

    public Pessoa(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
    }
}
