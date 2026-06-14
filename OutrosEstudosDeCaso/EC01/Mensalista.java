package EC01;

public class Mensalista extends Funcionario{
    private double salarioFixo;

    @Override
    public double calcularPagamento() {
        return salarioFixo;
    }
}
