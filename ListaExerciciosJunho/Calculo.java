public class Calculo {
    private double totalSalario;

    public void calculaSalario(double salarioBase, int horasTrabalhadas) {
        totalSalario = salarioBase * horasTrabalhadas;
    }

    public double getTotalSalario() {
        return totalSalario;
    }
}
