package dev.pablo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class BMICalculatorTest {
    private static final double DELTA = 0.01;

    @Test
    void testCalculateBMI() {
        assertEquals(22.86, BMICalculator.calculateBMI(70, 1.75), DELTA);
        assertEquals(27.68, BMICalculator.calculateBMI(80, 1.70), DELTA);
    }

    @Test
    void testCalculateBMIWithInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> BMICalculator.calculateBMI(0, 1.75));
        assertThrows(IllegalArgumentException.class, () -> BMICalculator.calculateBMI(70, 0));
        assertThrows(IllegalArgumentException.class, () -> BMICalculator.calculateBMI(-70, 1.75));
    }

    @Test
    void testInterpretBMI() {
        assertEquals("Severe thinness", BMICalculator.interpretBMI(15.9));
        assertEquals("Moderate thinness", BMICalculator.interpretBMI(16.5));
        assertEquals("Mild thinness", BMICalculator.interpretBMI(18.0));
        assertEquals("Normal weight", BMICalculator.interpretBMI(22.0));
        assertEquals("Overweight", BMICalculator.interpretBMI(27.0));
        assertEquals("Mild obesity", BMICalculator.interpretBMI(32.0));
        assertEquals("Moderate obesity", BMICalculator.interpretBMI(37.0));
        assertEquals("Morbid obesity", BMICalculator.interpretBMI(42.0));
    }
}
