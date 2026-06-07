package hospital;

import java.time.LocalDate;

public class Medico extends Pessoa{
    private int crm;
    private double salario;
    private String dataContratacao;

    public Medico(String nome, int idade, String cpf,
                  String telefone, int crm) {
        super(nome, idade, cpf, telefone);
        this.crm = crm;
        this.dataContratacao = String.valueOf(LocalDate.now());
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("CRM: " + crm);
        System.out.println("Salário: " + salario);
        System.out.println("Data de Contratação: " + dataContratacao);
        System.out.println("");
    }
}
