public class Quadrado extends Figura{
    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4*lado;
    }
}
