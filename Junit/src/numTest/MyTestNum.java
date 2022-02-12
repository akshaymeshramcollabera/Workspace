package numTest;

import org.junit.Assert;
import org.junit.Test;

public class MyTestNum {
    @Test
    public void GreatestNumTesting()
    {
        int a = 10;
        int b = 20;
        int c = 30;

        int result = 10;

        //GreatestNumber gt = new GreatestNumber();
        int finalResult = GreatestNumber.greatest(a,b,c);
        Assert.assertEquals(result, finalResult);
    }
}
