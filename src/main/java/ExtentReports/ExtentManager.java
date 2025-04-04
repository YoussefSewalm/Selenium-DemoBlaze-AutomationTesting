package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    private static final ExtentReports extentReports = new ExtentReports();

    public synchronized static ExtentReports getExtentReports() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
        reporter.config().setReportName("DemoBlaze Web Automation");
        extentReports.attachReporter(reporter);
        extentReports.setSystemInfo("Website Name", "Demo Blaze");
        extentReports.setSystemInfo("QA Engineer", "Youssef Sewalm");
        return extentReports;
    }
}