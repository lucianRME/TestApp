package test;

import calc.Calculator;
import com.jtest.annotation.JTest;
import com.jtest.annotation.JTestCase;
import com.jtest.annotation.Setup;
import com.jtest.annotation.TearDown;
import com.jtest.framework.Assert;

@JTestCase
public class TestCaseWithoutJTest
{
    static int a, b;
    
    @Setup
    public static void setup()
    {
        a = 2;
        b = 1;
    }

    @TearDown
    public static void teardown()
    {
        System.out.println("tear down");
    }

 
    public static void testAduna()
    {
        Calculator calc = new Calculator();
        Assert.assertEquals(3, calc.aduna(a, b));
    }

    public static void testImpartireCuZero()
    {
        Calculator calc = new Calculator();
        try
        {
            calc.imparte(a, 0);
            Assert.fail("should have ArithmeticException!!!");
        }
        catch(ArithmeticException ex)
        {
            //it is ok to be here
        }
    }

  
    public static void testImparte()
    {
        Calculator calc = new Calculator();
        Assert.assertEquals(1, calc.imparte(a, b));
    }
}
