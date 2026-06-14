package EC05;

public class Professor extends Pessoa {
    private String disciplina;

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Disciplina: " + this.disciplina);
    }
}
