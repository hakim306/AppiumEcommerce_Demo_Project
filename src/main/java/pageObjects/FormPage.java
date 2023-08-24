package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utility.androidActions;


public class FormPage extends androidActions {
	
	//define android driver.
	AndroidDriver driver;
	
	//define constructor.
	public FormPage(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//define elements.
	@FindBy(id ="com.androidsample.generalstore:id/nameField")
	 WebElement nameFeild;

	@FindBy(id = "com.androidsample.generalstore:id/radioFemale")
	 WebElement femaleOption;
	
	@FindBy(id ="com.androidsample.generalstore:id/radioMale")
	 WebElement maleOption;
	
	@FindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
	 WebElement countryFeild;
	
	@FindBy(xpath = "//android.widget.TextView[6]")
	 WebElement ArubaCountry;
	
	@FindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
	 WebElement submitBtn;
	
	@FindBy(xpath = "(//android.widget.Toast)[1]")
	WebElement toast;
	
	//define actions.
	public void setNameFeild(String name) {
		nameFeild.sendKeys("mohamedhakim");
	}
	
	public void setGender(String gender) {
		if (gender.contains("female")) {
			femaleOption.click();
		}else {
			maleOption.click();
		}
	}
	
	public void selectCountry(String countryName) {
		countryFeild.click();
		androidActions.scrollToText(countryName);
		driver.findElement(By.xpath("//android.widget.TextView[@text='"+countryName+"']")).click();
	}
	
	public void click_submitBtn() {
		submitBtn.click();
	}
	
	public String Get_toast_text() {
		String toastString=toast.getText();
		return toastString;
	}
	
	
	
}
