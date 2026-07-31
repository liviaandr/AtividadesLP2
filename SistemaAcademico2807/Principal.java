import java.util.Scanner;

import Dados.Estudante;
import Dados.EstudanteIPL;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        EstudanteIPL e1 = new EstudanteIPL();
        boolean executando = true;

        while (executando) {
            System.out.println(" ");
            System.out.println("==================================");
            System.out.println("Sistema Acadêmico");
            System.out.println("Digite a ação que deseja realizar:");
            System.out.println("""
                    1 - Cadastrar
                    2 - Alterar
                    3 - Excluir
                    4 - Pesquisar
                    5 - Exibir Lista
                    ou
                    6 - Sair
                    """);
            String opcaoPrincipal = leitura.nextLine();

            switch (opcaoPrincipal.toLowerCase()) {
                case "1":
                case "cadastrar":
                    System.out.println("Digite o nome do estudante: ");
                    String nomeCadastro = leitura.nextLine();
                    System.out.println("Digite o CPF do estudante: ");
                    String cpfCadastro = leitura.nextLine();
                    System.out.println("Digite a matricula do estudante: ");
                    String matriculaCadastro = leitura.nextLine();
                    System.out.println("Digite o curso do estudante: ");
                    String cursoCadastro = leitura.nextLine();
                    System.out.println("Digite o semestre do estudante: ");
                    String semestreCadastro = leitura.nextLine();
                    Estudante e = new Estudante(nomeCadastro, cpfCadastro, 
                        matriculaCadastro, cursoCadastro, semestreCadastro);
                    e1.cadastrar(e);

                    System.out.println(" ");
                    System.out.println("Estudante cadastrado com sucesso!");
                    break;

                case "2":
                case "alterar":
                    System.out.println(" ");
                    System.out.println("Digite a matricula cadastrada: ");
                    String matriculaAlteracao = leitura.nextLine();

                    System.out.println(" ");
                    System.out.println("""
                            Digite o dado que deseja alterar: 
                            1 - Nome
                            2 - CPF
                            3 - Matrícula
                            4 - Curso
                            5 - Semestre
                            ou
                            6 - Voltar
                            """);
                    String opcaoAlteracao = leitura.nextLine();

                    switch (opcaoAlteracao.toLowerCase()) {
                        case "1":
                        case "nome":
                            System.out.println("Digite o novo nome: ");
                            String nomeAlteracao = leitura.nextLine();
                            e1.alterar(matriculaAlteracao).setNome(nomeAlteracao);
                            break;

                        case "2":
                        case "cpf":
                            System.out.println("Digite o novo CPF: ");
                            String cpfAlteracao = leitura.nextLine();
                            e1.alterar(matriculaAlteracao).setCpf(cpfAlteracao);
                            break;

                        case "3":
                        case "matricula":
                            System.out.println("Digite a nova matricula: ");
                            String outraMatriculaAlteracao = leitura.nextLine();
                            e1.alterar(matriculaAlteracao).setMatricula(outraMatriculaAlteracao);
                            break;

                        case "4":
                        case "curso":
                            System.out.println("Digite o novo curso: ");
                            String cursoAlteracao = leitura.nextLine();
                            ((Estudante) e1.alterar(matriculaAlteracao)).setCurso(cursoAlteracao);
                            break;

                        case "5":
                        case "semestre":
                            System.out.println("Digite o novo semestre: ");
                            String semestreAlteracao = leitura.nextLine();
                            ((Estudante) e1.alterar(matriculaAlteracao)).setCurso(semestreAlteracao);
                            break;

                        case "6":
                        case "voltar":
                            break;

                        default:
                            System.out.println("Função selecionada inválida, tente novamente: ");
                    }
                break;

                case "3":
                case "excluir":
                    System.out.println(" ");
                    System.out.println("Digite a matricula cadastrada: ");
                    String matriculaExclusao = leitura.nextLine();

                    e1.excluir(matriculaExclusao);
                    break;

                case "4":
                case "pesquisar":
                    System.out.println(" ");
                    System.out.println("Digite a matricula cadastrada: ");
                    String matriculaPesquisa = leitura.nextLine();
                    e1.pesquisar(matriculaPesquisa);
                    break;

                case "5":
                case "exibir lista":
                    e1.exibirLista();
                    break;

                case "6":
                case "sair":
                    executando = false;
                    break;
                    
                default:
                    System.out.println("Função selecionada inválida, tente novamente: ");
            }
        }

        leitura.close();
    }
}
