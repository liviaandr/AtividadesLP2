package sistema.escola;

public class Coordenador extends Pessoa implements Autenticavel{
    @Override
    public void autenticar() {
        System.out.println("Professor autenticado com sucesso!");
    }

    private static int numeroPlanosEnsino;

    public Coordenador(String nome, int matricula) {
        super(nome, matricula);
    }

    public void aprovarPlanoEnsino() {
        System.out.println("Qual o plano de ensino que deseja aprovar?");
        sc.nextLine();
        numeroPlanosEnsino++;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Planos de ensino aprovados: " + numeroPlanosEnsino);
    }
}
