package sistema.escola;

public class Aluno extends Pessoa implements Autenticavel{
    public Aluno(String nome, int matricula) {
        super(nome, matricula);
    }

    public void realizarMatricula() {
        System.out.println("Matricula realizada!");
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
    }

    @Override
    public void autenticar() {
        System.out.println("Professor autenticado com sucesso!");
    }
}
