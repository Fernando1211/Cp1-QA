//Fernando Aguiar rm557525
import org.example.Apdex;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApdexTest {
    private Apdex apdex;

    @BeforeEach
    public void arrange() {
        this.apdex = new Apdex();
    }

    @Test
    public void testValidarApdexExcelente() {
        double result = apdex.validarApdex(557525, 0, 557525);
        assertEquals(1.0, result, 0.01);
    }

    @Test
    public void testValidarApdexBom() {
        double result = apdex.validarApdex(475000, 50000, 557525);         assertEquals(0.90, result, 0.01);
    }

    @Test
    public void testValidarApdexRazoavel() {
        double result = apdex.validarApdex(390000, 75000, 557525);
        assertEquals(0.77, result, 0.01);
    }

    @Test
    public void testValidarApdexRuim() {
        double result = apdex.validarApdex(260000, 100000, 557525);
        assertEquals(0.55, result, 0.01);
    }

    @Test
    public void testValidarApdexInaceitavel() {
        double result = apdex.validarApdex(100000, 100000, 557525);
        assertEquals(0.26, result, 0.01);
    }
}
