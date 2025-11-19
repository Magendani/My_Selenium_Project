package ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import java.io.File;

public class XolaniExtentReportsManager {

    private static final String reportDir = System.getProperty("user.dir") + "/Reports"+"/NdosiAutomation.html";

    public static ExtentReports extentReports;

    public static ExtentSparkReporter extentSparkReporter;

    public static ExtentReports extentReportSetUp() {
        extentReports = new ExtentReports();
        extentSparkReporter = new ExtentSparkReporter(new File(reportDir));
        extentReports.attachReporter(extentSparkReporter);

        extentSparkReporter.config().setDocumentTitle("Extent Report");
//        extentSparkReporter.config().setTheme(Theme.DARK);
        extentSparkReporter.config().setReportName("Nkosi Automation");
        extentReports.setSystemInfo("OS", System.getProperty("os.name"));
        extentReports.setSystemInfo("Execution Machine", System.getProperty("user.name"));
        extentReports.setSystemInfo("testa","Xolani");

        return extentReports;
    }

    public void test() {
        System.out.println(reportDir);
    }
}
