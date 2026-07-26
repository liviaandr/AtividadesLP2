package empresa;

public class Professor extends Funcionario{

    public Professor(int matricula, String nome, float salario) {
        super(matricula, nome, salario);
    }

    @Override
    public void calcularSalario() {
        System.out.println("Quantas horas-aula o professor " + super.getNome()
                + " trabalhou?");
        int horasAula = sc.nextInt();
        float adicional = 50 * horasAula;

        super.salario += adicional;

        System.out.println("O salário dele(a) é: " + super.salario);
    }
}
