package realCalculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test(timeout=10)
    public void testAdd() {

        Calculator instance = new Calculator();

        assertEquals(7, instance.add(3,4));

    }



    @Test(timeout=7)

    public void testSubtract() {

        Calculator instance = new Calculator();

        assertEquals(5, instance.subtract(10,5));

    }

}
