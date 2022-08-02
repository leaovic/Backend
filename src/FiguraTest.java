
import org.testng.annotations.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class FiguraTest {

    @Test
    void testCirculo(){
        Circulo c1 = new Circulo(10);
        assertEquals(2*Math.PI*10, c1.calcularPerimetro());

    }

    @Test
    void testQuadrado(){
        Quadrado q1 = new Quadrado(10);
        assertEquals(4*10, q1.calcularPerimetro());
    }

}
