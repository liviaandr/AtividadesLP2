package hospital;

public class Principal {
    static void main() {
        Medico medico = new Medico("Jorge", 22, "782.454.325-43",
                "(92) 90987-5453", 4565);
        Enfermeiro enfermeiro = new Enfermeiro("Joana", 27,
                "876.090.382-43", "(87) 90098-6523", "SP-98754");
        Paciente paciente = new Paciente("Amilton", 54,
                "765.986.034-54", "(65) 97634-8743");

        medico.exibirDados();

        enfermeiro.exibirDados();

        paciente.exibirDados();

        paciente.acessarProntuario().setDiagnostico("Doente");
        paciente.acessarProntuario().setExames("Fez raio-x");
        paciente.acessarProntuario().setObservacoes("Não tão urgente");
        paciente.exibirProntuario();

        Consulta consulta = new Consulta();
        consulta.agendar(medico, paciente, "12/07/2027", "dor de cabeça");
        consulta.cancelar();

        // Ainda é possível realizar os setters para médico, enfermeiro e paciente, de acordo com a necessidade.
    }
}

