import org.junit.Assert;
import org.junit.Test;

public class MyFactorialTest {
    @Test
    public void factorialTest()
    {
        int num=5;
        Factorial fct = new Factorial();
        int expResult = 125;
        int actual = fct.fact(5);
    }
}
