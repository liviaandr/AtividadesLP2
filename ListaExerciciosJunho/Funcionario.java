import java.time.LocalDate;

public class Funcionario {
    public String nome;
    public String cpf;
    public String rg;
    private int matricula;
    private double salario;
    public String dataContratacao;
    private double salarioBase;
    private int horasTrabalhadas;
    private static int geraMatricula = 0;

    Calculo calculo = new Calculo();

    public Funcionario(String nome, double salarioBase, int horasTrabalhadas){
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;
        this.dataContratacao = String.valueOf(LocalDate.now());

        this.matricula = geraMatricula;
        this.geraMatricula++;
    }

    public void calculaSalarioFuncionario() {
        calculo.calculaSalario(this.salarioBase, this.horasTrabalhadas);
    }

    public void imprimeDados() {
        System.out.println(
                        "Nome: " + this.nome +
                        "\nCPF: " + this.cpf +
                        "\nRG: " + this.rg +
                        "\nMatrícula: " + this.matricula +
                        "\nSalário: " + this.salario +
                        "\nData de Contratação: " + this.dataContratacao +
                        "\nSalário Base: " + this.salarioBase +
                        "\nHoras Trabalhadas: " + this.horasTrabalhadas
        );
    }
}