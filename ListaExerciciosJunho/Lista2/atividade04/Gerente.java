package atividade04;

public class Gerente extends Funcionario{

    @Override
    public void gerarRelatorio() {
        System.out.println("O gerente fez um relatório.");
    }
}
