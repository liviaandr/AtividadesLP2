package EC04;

public class Carro extends Transporte {
    private int combustivel;

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Combustível: " + this.combustivel + "litros");
    }
}
