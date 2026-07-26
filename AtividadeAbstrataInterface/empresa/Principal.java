package empresa;

public class Principal {
    static void main() {
        Professor p1 = new Professor(0001, "Jorge", 2000);
        Tecnico t1 = new Tecnico(0002, "Mateus", 1000);
        Coordenador c1 = new Coordenador(0003, "Lucas", 3000);

        System.out.println("Calculando o salário de todos os funcionarios");
        System.out.println(" ");
        p1.calcularSalario();
        t1.calcularSalario();
        c1.calcularSalario();
    }
}
