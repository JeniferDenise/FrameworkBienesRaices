package pages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reportes2 {
    private static ExtentReports extentReports;
    private static ExtentHtmlReporter htmlReporter;
    private static ExtentTest extentTest;

    public static void startReport() {
        extentReports = new ExtentReports();
        htmlReporter = new ExtentHtmlReporter("report.html");
        extentReports.attachReporter(htmlReporter);
    }

    public static void endReport() {
        extentReports.flush();
    }

    public static void createTest(String testName) {
        extentTest = extentReports.createTest(testName);
    }

    public static void log(String message) {
        extentTest.info(message);
    }
}
