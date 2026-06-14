package EC02;

public class Dvd extends ItemBiblioteca {
    private int duracaoEmSegundos;

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Duração: " + this.duracaoEmSegundos + "segundos");
    }
}
