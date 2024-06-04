package test;

import com.jtest.annotation.JTest;
import com.jtest.annotation.JTestCase;
import com.jtest.framework.Assert;

@JTestCase
public class SampleTest3
{
    @JTest
    public static void testSuccess()
    {
        Assert.assertTrue(true);
    }
    
}
