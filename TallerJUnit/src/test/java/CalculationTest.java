/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import ec.edu.espol.tallerjunit.Calculation;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author angelozurita
 */
public class CalculationTest {
    
    @Test
    public void testFindMax() {
        assertEquals(4, Calculation.findMax(new int[]{1, 3, 4, 2}));
        assertEquals(-1, Calculation.findMax(new int[]{-12, -1, -3, -4, -2}));  
        assertEquals(10, Calculation.findMax(new int[]{-5, -10, 5, 10, 0}));
        assertEquals(-10, Calculation.findMax(new int[]{-100, -10, -24, -123, -23}));
        assertEquals(124, Calculation.findMax(new int[]{10,23,34,56,12,124,56,78}));
    }
}
