package banco;

public class Correntista {
    private String nome;
    private ContaCorrente conta;

    public Correntista(String nome, ContaCorrente conta) {
        this.nome = nome;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public ContaCorrente getConta() {
        return conta;
    }

    @Override
    public String toString() {
        return nome;    }
}
