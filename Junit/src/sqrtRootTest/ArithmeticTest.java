package sqrtRootTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticTest {
    public ArithmeticTest()
    {

    }

    @Test
    public void testFindSquareRoot(){
        Arithmetic instance = new Arithmetic();
        double expResult = 2.5;
        double result = instance.findSquareRoot(6.25);
        assertEquals("findSquareRoot",expResult, result, 0.0);

    }
}
