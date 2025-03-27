package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import java.util.HashMap;
import java.util.Map;

/**
 * extentTestMap holds the information of thread ids and ExtentTest instances.
 * ExtentReports instance created by calling getExtentReports() method from ExtentManager.
 * At startTest() method, an instance of ExtentTest is created and put into extentTestMap with the current thread id.
 * At getTest() method, return the ExtentTest instance in extentTestMap by using the current thread id.
 */
public class ExtentTestManager {
    private static final Map<Long, ExtentTest> extentTestMap = new HashMap<>();  
    private static final ExtentReports extent = ExtentManager.getExtentReports();

    public static synchronized ExtentTest getTest() {
        return extentTestMap.get(Thread.currentThread().threadId()); 
    }

    public static synchronized ExtentTest startTest(String testName, String desc) {
        ExtentTest test = extent.createTest(testName, desc);
        extentTestMap.put(Thread.currentThread().threadId(), test); 
        return test;
    }
}
