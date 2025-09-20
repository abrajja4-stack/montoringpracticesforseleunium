package test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class C53ExtendReportSimpleTest  {




    private static ExtentReports extent;

    private  static ExtentSparkReporter sparkReporter;

    private static ExtentTest test;

    @BeforeEach
    public void reportStup() {
        // Step 1: Specify where the report file will be created
sparkReporter =new ExtentSparkReporter("test-output/ExtentReport.html");
        // Step 2: Set report title and document name
sparkReporter.config().setReportName("My First Extent Report");
sparkReporter.config().setDocumentTitle("My title");
sparkReporter.config().setTimeStampFormat("yyyy-MM-dd HH:mm:ss");
        // Step 3: Create ExtentReports object and attach the reporter
extent = new ExtentReports();
extent.attachReporter(sparkReporter);
        // Step 4: Add system information (optional)
        extent.setSystemInfo("Tester",System.getProperty("user.name"));
        extent.setSystemInfo("windows",System.getProperty("os.name"));
        extent.setSystemInfo("Browser", "Chrome");

    }

    @AfterEach
   public void tearDown() {
        extent.flush();
    }


    @Test
    void passingtestsampl() {
     test =extent.createTest("My First Tril Report","I will Have Better insigth......  " );
     test.info("Test started");
//bisic test logic
        int expacted = 20;
        int actual =10+10;
        if(expacted==actual) {
            test.pass("The operation is corcet:" + expacted + "=" + actual);
        }else {
            test.fail("The operation is wrong:" + expacted + "not equl" + actual);
        }
        test.info("Test is complited");

    }


    @Test
    void filingtestsampl() {
        test =extent.createTest("My fiul Tril Report","I will Have Better insigth......  " );
        test.info("Test started");
//bisic test logic
        int expacted = 20;
        int actual =10+5;
        if(expacted==actual) {
            test.pass("The operation is corcet:" + expacted + "=" + actual);
        }else {
            test.fail("The operation is wrong:" + expacted + "not equl" + actual);
        }

        test.info("Test is complited");
    }
}
