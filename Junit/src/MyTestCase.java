import org.junit.Assert;
import org.junit.Test;

public class MyTestCase {
    @Test
    public void additionTest()
    {
        int x=30;
        int y=20;
        int result=50;

        Calculator calculator = new Calculator();
        int finalResult = calculator.addition(x,y);
        Assert.assertEquals(result, finalResult);

    }

    @Test
    public void subtractionTest()
    {
        int x=30;
        int y=20;
        int result=15;

        Calculator calculator = new Calculator();
        int finalResult = calculator.subtraction(x,y);
        Assert.assertEquals(result, finalResult);

    }
}