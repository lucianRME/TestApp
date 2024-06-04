package test;

import com.jtest.annotation.JTest;
import com.jtest.annotation.JTestCase;
import com.jtest.framework.Assert;

@JTestCase
public class SampleTest2
{
    @JTest
    public static void testSuccess()
    {
        Assert.assertTrue(true);
    }

    @JTest
    public static void testFailed()
    {
        Assert.fail("should fail");
    }

    @JTest
    public static void testTestError()
    {
        throw new RuntimeException("should have error");
    }
    
}
