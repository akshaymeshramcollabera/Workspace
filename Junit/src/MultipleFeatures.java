import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultipleFeatures {
    @Test(timeout=10)

    public void testGetPrime() {

        int number = 13;

        Prime instance = new Prime();

        boolean result = instance.prime(5);

        boolean expResult = true;
        assertEquals(expResult, result);

    }



    @Ignore("Not ready yet")

    @Test

    public void testFactorial() {

        Factorial instance = new Factorial();

        instance.fact(5);
    }



    @Ignore("To be completed later")

    @Test

    public void testReverseNumber() {
        ReverseNumber instance = new ReverseNumber();

        instance.reverseNumber(1232);
    }
}
