package EC01;

public class Horista extends Funcionario {
    private int horasTrabalhadas;
    private double valorHora;

    @Override
    public double calcularPagamento() {
        return valorHora * horasTrabalhadas;
    }
}
