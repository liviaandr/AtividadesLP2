package banco;

public class Credito extends Operacao {

    public Credito(double valorDaOperacao) {
        super.valor = valorDaOperacao;
    }

    @Override
    public double operar() {
        return valor;
    }
}
