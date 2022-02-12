import org.junit.Test;

public class MyReverseTest {
    @Test
    public void testReverse(){
        int number = 123;
        ReverseNumber rev = new ReverseNumber();
        int expResult = 321;
        int actual = rev.reverseNumber(number);
    }
}
