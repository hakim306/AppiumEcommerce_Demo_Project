package appuimFrameworkDesign;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	
	public static UiAutomator2Options options;
	public static AndroidDriver driver;
	public static ExtentReports report2;
	
	@BeforeClass
	public void Config() throws MalformedURLException {
		 ExtentTest test=report2.createTest("demo");
		 options =new UiAutomator2Options();
	   	 options.setCapability(MobileCapabilityType.DEVICE_NAME, "hakim");
		 options.setCapability("connectHardwareKeyboard", false);
		 options.setCapability(MobileCapabilityType.APP, "//Users//mohamed//eclipse-workspace//appuimFrameworkDesign//resources//General-Store.apk");
		 driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),options);
		 report2.flush();
	}
	
	@BeforeTest
	public void extentReport() {
		String path="/Users/mohamed/eclipse-workspace/appuimFrameworkDesign/report/index.html";
		ExtentSparkReporter report=new ExtentSparkReporter(path);
		report.config().setReportName("Appium");
		report.config().setDocumentTitle("appiumTest");
		
		 report2=new ExtentReports();
		 report2.attachReporter(report);
		
	}

}
