package empresa;

import java.util.Scanner;

abstract class Funcionario {
    protected Scanner sc = new Scanner(System.in);

    protected int matricula;
    protected String nome;
    protected float salario;

    public Funcionario(int matricula, String nome, float salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public abstract void calcularSalario();

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }
}
