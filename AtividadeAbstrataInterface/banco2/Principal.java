package banco2;

public class Principal {
    static void main() {
        ContaCorrente c1 = new ContaCorrente(01, "Mateus", 1000);
        ContaPoupanca c2 = new ContaPoupanca(02, "Mateus", 3000);
        ContaInvestimento c3 = new ContaInvestimento(03, "Mateus", 2000);

        c1.sacar();
        c1.depositar();
        c1.consultarSaldo();

        c2.sacar();
        c2.depositar();
        c2.consultarSaldo();

        c3.sacar();
        c3.depositar();
        c3.renderJuros();
        c3.consultarSaldo();
    }
}
