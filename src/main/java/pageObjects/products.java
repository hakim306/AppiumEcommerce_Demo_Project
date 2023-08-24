package pageObjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import utility.androidActions;

public class products extends androidActions{
	
	public AndroidDriver driver;
	
	public products(AndroidDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//android.widget.TextView[@text='ADD TO CART']")
	 List<WebElement> addToCart;
	
	@FindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
	WebElement shoppingCart;
	
	public void click_addToCart(int index) {
		addToCart.get(index).click();
	}
	
	public void click_shoppingCart() {
		shoppingCart.click();
	}
}
