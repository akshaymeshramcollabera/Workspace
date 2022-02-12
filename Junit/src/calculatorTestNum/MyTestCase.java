package calculatorTestNum;

import org.junit.*;

public class MyTestCase {
    int x=0;
    int y=0;
    int result=0;

    Calculator calculator = null;

    @BeforeClass
    public static void setupClassLevel(){
        System.out.println("Invoke before the loading class in JVM");
    }

    @Before
    public void setup(){
        x=30;
        y=20;
        calculator = new Calculator();
    }

    @Test
    public void additionTest(){
        result=50;
        int finalREsult = calculator.addition(x,y);
        Assert.assertEquals(result, finalREsult);
    }

    @Test
    public void subtractionTest(){
        result=10;
        int finalResult = calculator.subtraction(x,y);
        Assert.assertEquals(result, finalResult);
    }

    @After
    public void cleaning(){
        x=0;
        y=0;
        calculator=null;
    }

    @AfterClass
    public static void setupAfterClassLevel() {
        System.out.println("Invoke After class loading class in JVM");
    }

}
