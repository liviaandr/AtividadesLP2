package banco2;

public class ContaCorrente extends Conta {
    public ContaCorrente(int numero, String titular, float saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public void sacar() {
        System.out.println("Qual valor deseja sacar? ");
        float valor = sc.nextFloat();

        if(valor > super.saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            System.out.println("Saque realizado com sucesso.");
            super.saldo -= valor;
            System.out.println("Novo saldo: " + super.saldo);
        }
    }

    @Override
    public void depositar() {
        System.out.println("Qual valor deseja depositar? ");
        float valor = sc.nextFloat();

        super.saldo += valor;
        System.out.println("Depósito realizado com sucesso.");
        System.out.println("Novo saldo: " + super.saldo);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo: " + super.saldo);
    }
}
