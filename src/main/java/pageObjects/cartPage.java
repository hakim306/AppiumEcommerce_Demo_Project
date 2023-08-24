package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import utility.androidActions;

public class cartPage extends androidActions{
	
	public AndroidDriver driver;
		public cartPage(AndroidDriver driver) {
			super(driver);
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath = "//android.widget.LinearLayout/android.widget.CheckBox")
	WebElement checkBox;
	
	@FindBy(id = "com.androidsample.generalstore:id/btnProceed")
	WebElement proceesBtn;
	
	public void click_checkBox() {
		checkBox.click();
	}
	
	public void click_proceed() throws InterruptedException {
		proceesBtn.click();
		Thread.sleep(3000);
	}

}
