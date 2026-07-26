package sistema.escola;

public class Principal {
    static void main() {
        Aluno a1 = new Aluno("Maria", 20);
        Professor p1 = new Professor("Joaquina", 1010);
        Coordenador c1 = new Coordenador("Juana", 801);

        a1.autenticar();
        a1.realizarMatricula();
        a1.exibirDados();

        p1.autenticar();
        p1.ministraDisciplina();
        p1.exibirDados();

        c1.autenticar();
        c1.aprovarPlanoEnsino();
        c1.exibirDados();
    }
}
