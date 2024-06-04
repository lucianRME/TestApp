import com.jtest.CoreEngine;
import org.xml.sax.SAXException;

import java.io.IOException;

/**
 * test application for testing single thread testcase execution
 */
public class TestApplication
{
    public static void main(String args[])
    {
        try
        {
            long startTime = System.currentTimeMillis();
            
            CoreEngine.runTestSuite("test/test.xml");

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
