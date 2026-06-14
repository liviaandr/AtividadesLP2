package banco;

public class Debito extends Operacao {

    public Debito(double valorDaOperacao) {
        super.valor = valorDaOperacao;
    }

    @Override
    public double operar() {
        return -valor;
    }
}
