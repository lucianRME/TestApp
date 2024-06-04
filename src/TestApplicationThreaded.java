import com.jtest.CoreEngine;

/**
 * test application for testing multi thread execution of testcases
 */
public class TestApplicationThreaded
{
    public static void main(String args[])
    {
        try
        {
            long startTime = System.currentTimeMillis();
            CoreEngine.runTestSuiteThreaded("test/test.xml");

            long stopTime = System.currentTimeMillis();
            long runTime = stopTime - startTime;
            System.out.println("Run time: " + runTime);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }    
}
