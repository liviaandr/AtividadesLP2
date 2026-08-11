import java.util.Scanner;

public class CalculadoraSeguro {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int idade = 0;

        System.out.println("----------------------");
        System.out.println("Calculadora de Seguro:");
        System.out.println(" ");

        try {
            System.out.println("Informe a idade do condutor: ");
            idade = sc.nextInt();

            if (idade < 18) {
                throw new IdadeInvalidaException("Idade inválida.");
            }

            System.out.println("Informe o valor do veículo do condutor: ");
            double valor = sc.nextDouble();

            double seguro = valor * idade / 100;

            System.out.println(" ");
            System.out.println("---------------------");
            System.out.println("O valor do seguro ficaria em torno de: " + seguro);

        } catch (IdadeInvalidaException e) {
            System.out.println("Idade do condutor inválida!");

        } finally {
            System.out.println("Processo encerrado.");
        }
    }
}