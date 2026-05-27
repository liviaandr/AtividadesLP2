public class Televisao {
    private double tamanhoTela;
    private int volume;
    private String marca;
    private int voltagem;
    private int canal;

    public Televisao(String marca, int voltagem, double tamanhoTela) {
        this.marca = marca;
        this.volume = 5;
        this.tamanhoTela = tamanhoTela;
        if (voltagem != 110 && voltagem != 220) {
            throw new IllegalArgumentException(
                    "A voltagem precisa ser 110 ou 220."
                    );
        }
        this.voltagem = voltagem;
    }

    public void ligar() {
        System.out.println("A televisão está ligada. Seu consumo total é: " + tamanhoTela * voltagem);
    }

    public void desligar() {
        System.out.println("Televisão desligada.");
    }

    public void mudarVolume(int mudarVolume) {
        if (mudarVolume >= 0) {
            this.volume++;
            System.out.println("Volume aumentado, agora em: " + volume);
        } else {
            this.volume--;
            System.out.println("Volume diminuido, agora em: " + volume);
        }
    }

    public void mudarCanal(int mudarCanal) {
        if (mudarCanal >= 0) {
            this.canal++;
            System.out.println("Canal aumentado, agora em: " + canal);
        } else {
            this.canal--;
            System.out.println("Volume diminuido, agora em: " + canal);
        }
    }
}
