package test;

import com.jtest.annotation.JTest;
import com.jtest.annotation.JTestCase;
import com.jtest.framework.Assert;

@JTestCase
public class SampleTest1
{
    @JTest
    public static void test1()
    {
        Assert.assertTrue(true);
    }

    @JTest
    public static void test2()
    {
        Assert.fail("should fail");
    }

    @JTest
    public static void test3()
    {
        Assert.assertEquals(1, 2);
    }

    public static void test4()
    {
        System.out.println("Shouldn't be here...");
    }
}
