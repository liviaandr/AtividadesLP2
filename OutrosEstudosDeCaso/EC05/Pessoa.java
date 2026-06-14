package EC05;

public class Pessoa {
    protected String nome;
    protected String cpf;

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }
}
