package banco;

public class ContaCorrente {
    private double valor = 0;

    public double executarOperacao(Operacao opr) {
        valor += opr.operar();
        return valor;
    }

    public double getValor() {
        return valor;
    }
}
