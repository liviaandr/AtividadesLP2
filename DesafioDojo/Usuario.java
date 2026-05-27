public class Usuario {

    private String nome;
    private String matricula;
    private String curso;

    public String getNome(){
        return this.nome;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void exibirUsuario(){
        System.out.println(" Nome: " + nome + " Matricula: " + matricula + " Curso: " + curso );
    }
}
