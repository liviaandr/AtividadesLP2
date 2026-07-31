package Dados;

public class Estudante extends Pessoa{
    private String curso;
    private String semestre;

    public Estudante(String nome, String cpf, String matricula,
                     String curso, String semestre) {
        super(nome, cpf, matricula);
        this.curso = curso;
        this.semestre = semestre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "(Nome: " + nome + " | CPF: " + cpf + " | Matrícula: " + matricula + 
        " | Curso: " + curso + " | Semestre: " + semestre + ")";
    }
}
