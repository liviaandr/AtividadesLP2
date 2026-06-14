package EC05;

public class Aluno extends Pessoa {
    private int matricula;

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matricula: " + this.matricula);
    }
}
