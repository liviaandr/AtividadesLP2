package hospital;

import java.time.LocalDate;

public class Enfermeiro extends Pessoa{
    private String coren;
    private double salario;
    private String dataContratacao;

    public Enfermeiro(String nome, int idade, String cpf,
                      String telefone, String coren) {
        super(nome, idade, cpf, telefone);
        this.coren = coren;
        this.dataContratacao = String.valueOf(LocalDate.now());
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("COREN: " + coren);
        System.out.println("Salário: " + salario);
        System.out.println("Data de Contratação: " + dataContratacao);
        System.out.println("");
    }
}
