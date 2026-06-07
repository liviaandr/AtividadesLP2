package hospital;

public class Paciente extends Pessoa{
    private String historicoMedico;
    private String alergias;
    private ProntuarioMedico prontuarioMedico;

    public Paciente(String nome, int idade, String cpf, String telefone) {
        super(nome, idade, cpf, telefone);
        this.prontuarioMedico = new ProntuarioMedico();
    }

    public ProntuarioMedico acessarProntuario(){
        return prontuarioMedico;
    }

    public void exibirProntuario(){
        System.out.println("ID do Prontuário: " + prontuarioMedico.getIdProntuario());
        System.out.println("Data de Entrada: " + prontuarioMedico.getDataDeEntrada());
        System.out.println("Diagnóstico: " + prontuarioMedico.getDiagnostico());
        System.out.println("Exames: " + prontuarioMedico.getExames());
        System.out.println("Observações: " + prontuarioMedico.getObservacoes());
        System.out.println("");
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Histórico Médico: " + historicoMedico);
        System.out.println("Alergias: " + alergias);
        System.out.println("");
    }

}
