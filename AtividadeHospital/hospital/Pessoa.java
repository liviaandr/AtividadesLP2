package hospital;

public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    private String cpf;
    private String telefone;
    private String endereco;

    public Pessoa(String nome, int idade, String cpf, String telefone){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Endereço: " + this.endereco);
    }

    public String getNome() {
        return this.nome;
    }
}
