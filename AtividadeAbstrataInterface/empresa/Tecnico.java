package empresa;

public class Tecnico extends Funcionario {


    public Tecnico(int matricula, String nome, float salario) {
        super(matricula, nome, salario);
    }

    @Override
    public void calcularSalario() {
        System.out.println("Qual o adicional de insalubridade para o técnico "
                + super.getNome() + "?");
        float adicional = sc.nextFloat();

        super.salario += adicional;

        System.out.println("O salário dele(a) é: " + super.salario);
    }
}
