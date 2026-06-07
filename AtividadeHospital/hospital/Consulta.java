package hospital;

public class Consulta {
    private Medico medico;
    private Paciente paciente;
    private String data;
    private String motivo;

    public void exibirConsulta() {
        System.out.println("Consulta marcada com o médico " + medico.getNome() +
                " para o paciente " + paciente.getNome() + " para o dia " +
                data + " por conta de " + motivo + ".");
        System.out.println("");
    }

    public void agendar(Medico medico, Paciente paciente, String data,
                        String motivo) {
        this.medico = medico;
        this.paciente = paciente;
        this.data = data;
        this.motivo = motivo;
        exibirConsulta();
    }

    public void cancelar() {
        this.medico = null;
        this.paciente = null;
        this.data = null;
        this.motivo = null;
        System.out.println("Consulta cancelada.");
    }
}
