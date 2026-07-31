package Dados;

import java.util.ArrayList;

public class EstudanteIPL implements IManipularDados{
    private ArrayList<Estudante> listaDeEstudantes = new ArrayList<>();

    @Override
    public void cadastrar(Pessoa p) {
        listaDeEstudantes.add((Estudante) p);
    }

    @Override
    public Pessoa alterar(String matriculaCadastrada) {
        for (Estudante estudante : listaDeEstudantes) {
                            if (estudante.getMatricula().equals(matriculaCadastrada)) {
                                System.out.println("Dados alterados com sucesso!");
                                return estudante;
                            }
                        }
        return null;
    }

    @Override
    public void excluir(String matriculaCadastrada) {
        for (Estudante estudante : listaDeEstudantes) {
                            if (estudante.getMatricula().equals(matriculaCadastrada)) {
                                System.out.println("Matricula encontrada!");
                                listaDeEstudantes.remove(estudante);
                                System.out.println("Dados escluídos com sucesso!");
                                break;
                            } else {
                                System.out.println("Matrícula não encontrada.");
                            }
                        }
    }

    @Override
    public void pesquisar(String matriculaCadastrada) {
        for (Estudante estudante : listaDeEstudantes) {
                        if (estudante.getMatricula().equals(matriculaCadastrada)) {
                            System.out.println("Matricula encontrada!");
                            System.out.println(estudante);
                            break;
                        } else {
                            System.out.println("Matricula não encontrada.");
                        }
                    }
    }

    @Override
    public void exibirLista() {
        if (listaDeEstudantes.isEmpty()) {
            System.out.println("Não há nenhum aluno cadastrado.");
        } else {
            for (Estudante estudante : listaDeEstudantes) {
                System.out.println(estudante);
            }
        }
    }
}
