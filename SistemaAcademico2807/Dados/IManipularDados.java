package Dados;

public interface IManipularDados {
    void cadastrar(Pessoa p);
    Pessoa alterar(String matriculaCadastrada);
    void excluir(String matriculaCadastrada);
    void pesquisar(String matriculaCadastrada);
    void exibirLista();
}
