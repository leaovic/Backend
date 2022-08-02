public class Circulo extends Figura{
    private final double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*raio;
    }
}
