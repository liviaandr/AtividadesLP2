package EC04;

public class Bicicleta extends Transporte {
    private boolean temMarchas = true;

    @Override
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Tem marchas? " + this.temMarchas);
    }
}
