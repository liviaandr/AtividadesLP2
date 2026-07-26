package empresa;

public class Coordenador extends Funcionario{


    public Coordenador(int matricula, String nome, float salario) {
        super(matricula, nome, salario);
    }

    @Override
    public void calcularSalario() {
        System.out.println("Qual a gratificação fixa do coordenador "
                + super.getNome() + "?");
        float adicional = sc.nextFloat();

        super.salario += adicional;

        System.out.println("O salário dele(a) é: " + super.salario);
    }
}
