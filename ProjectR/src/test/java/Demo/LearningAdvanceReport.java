package Demo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LearningAdvanceReport {

	public static void main(String[] args) {

		//Create the SparkReport
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReports/report.html");
		
		
		//Configure the SparkReport Information
		spark.config().setDocumentTitle("Regresstion Testing For the SwagLabs");
		spark.config().setReportName("RegresstionSuite");
		spark.config().setTheme(Theme.STANDARD);
		
		
		//Create Extent Report
		ExtentReports report = new ExtentReports();
		
		
		//Attach the Spark Report and ExtentReport
		report.attachReporter(spark);
		
		
		//Configure the System Information in Extent Report
		report.setSystemInfo("DeviceName:", "Ramya");
		report.setSystemInfo("OperatingSystem:", "WINDOWS 11");
		report.setSystemInfo("Browser:", "Chrome");
		report.setSystemInfo("BrowserVersion:", "chrome-138.0.7204.169");
		
		
		//Create the Test Information
		ExtentTest test = report.createTest("Regresstiontest");
		
		
		//Steps Information
		test.log(Status.INFO, "Step1: Launching The Browser Successful");
		
		test.log(Status.INFO, "Step2: Navigating To the Application via URL Successful");
		
		test.log(Status.PASS, "Step3: Verified the WebPage Successful");
		
		
		if (true == true) {
			test.log(Status.PASS, "Step4: Verified the WebElement Displayed");
			
		} else {
			test.log(Status.FAIL, "Step4: Verified the WebElement is Not Displayed");

		}
		
		test.log(Status.SKIP, "Step5: Element is Hidden");
		
		//Flush the Report Information
		report.flush();
		
		System.out.println("execution Done");
		
		
	}

}
