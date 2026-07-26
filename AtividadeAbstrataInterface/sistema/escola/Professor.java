package sistema.escola;

public class Professor extends Pessoa implements Autenticavel{

    @Override
    public void autenticar() {
        System.out.println("Professor autenticado com sucesso!");
    }

    private String disciplinaQueMinistra;

    public Professor(String nome, int matricula) {
        super(nome, matricula);
    }

    public void ministraDisciplina() {
        System.out.println("Qual disciplina esse professor ministra? ");
        this.disciplinaQueMinistra = sc.nextLine();
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        if (disciplinaQueMinistra == null) {
            System.out.println("Esse professor não ministra nenhuma disciplina ainda");
        } else {
            System.out.println("Esse professor ministra: " + disciplinaQueMinistra);
        }
    }
}
