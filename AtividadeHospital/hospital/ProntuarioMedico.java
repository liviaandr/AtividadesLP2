package hospital;

import java.time.LocalDate;

public class ProntuarioMedico{
    private int idProntuario;
    private String dataDeEntrada;
    private String diagnostico;
    private String exames;
    private String observacoes;
    private static int geraId;

    public ProntuarioMedico() {
        this.geraId++;
        this.idProntuario = geraId;
        this.dataDeEntrada = String.valueOf(LocalDate.now());
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setExames(String exames) {
        this.exames = exames;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public int getIdProntuario() {
        return idProntuario;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public String getExames() {
        return exames;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getDataDeEntrada() {
        return dataDeEntrada;
    }
}
