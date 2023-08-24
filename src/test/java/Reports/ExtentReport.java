package Reports;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	
	@BeforeTest
	public void extentReport() {
		String path="\\Users\\mohamed\\eclipse-workspace\\appuimFrameworkDesign\\resources\\index.html";
		ExtentSparkReporter report=new ExtentSparkReporter(path);
		report.config().setReportName("Appium");
		report.config().setDocumentTitle("appiumTest");
		
		ExtentReports report2=new ExtentReports();
		report2.attachReporter(report);
		
	}

}
