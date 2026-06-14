package banco;

public class App {
    static void main() {
        ContaCorrente co1 = new ContaCorrente();
        ContaCorrente co2 = new ContaCorrente();
        ContaCorrente co3 = new ContaCorrente();
        Banco banco = new Banco("Vladmir", co1, "Claudio", co2,
                "Sérgio", co3);

        banco.creditar("Claudio", 100);
        banco.transferir("Claudio", "Sérgio", 50);
        banco.transferir("Sérgio", "Vladmir", 45);
        System.out.println(banco.getCorrentista("Vladmir"));
        System.out.println(banco.getSaldo("Vladmir"));
        banco.creditar("Vladmir", 250);
        banco.debitar("Vladmir", 200);
        System.out.println(banco.getCorrentista("Vladmir"));
        System.out.println(banco.getSaldo("Vladmir"));
        System.out.println(banco.getCorrentista("Claudio"));
        System.out.println(banco.getSaldo("Claudio"));
        System.out.println(banco.getCorrentista("Sérgio"));
        System.out.println(banco.getSaldo("Sérgio"));
    }
}
