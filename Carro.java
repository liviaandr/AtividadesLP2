public class Carro {
    private String modelo;
    private double velocidade;
    private double aceleracao;
    private int marcha;

    public String ligar() {
        return "O carro está ligado";
    }

    public String desligar() {
        return "O carro está desligado";
    }

    public String acelerar() {
        return "O carro está acelerando 10km/h";
    }

    public String desacelerar() {
        return "O carro está freiando 10km/h";
    }

    public String virarDireita() {
        return "O carro virou para a direita";
    }

    public String virarEsquerda() {
        return "O carro virou para a esquerda";
    }

    public String marchaCima() {
        return "A marcha subiu";
    }

    public String marchaBaixo() {
        return "A marcha desceu";
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
}
