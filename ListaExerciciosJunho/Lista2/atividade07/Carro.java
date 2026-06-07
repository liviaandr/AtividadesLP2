package atividade07;

public class Carro extends Veiculo{
    private double velocidade;

    public Carro(String marca, int ano, double velocidade) {
        super(marca, ano);
        this.velocidade = velocidade;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Velocidade: " + velocidade);
    }
}
