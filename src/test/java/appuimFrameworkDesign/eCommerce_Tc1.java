package appuimFrameworkDesign;

import org.testng.annotations.Test;

import Reports.ExtentReport;
import pageObjects.FormPage;
import pageObjects.cartPage;
import pageObjects.products;

public class eCommerce_Tc1 extends Base{
	@Test
	public void fillFom() throws InterruptedException {
		
		Thread.sleep(5000);
		FormPage formPage=new FormPage(driver);
		formPage.selectCountry("Aruba");
		formPage.setNameFeild("hakim");
		formPage.setGender("female");
		formPage.click_submitBtn();
		Thread.sleep(3000);
		products products=new products(driver);
		products.click_addToCart(0);
		products.click_addToCart(0);
		products.click_shoppingCart();
		Thread.sleep(3000);
		cartPage cartPage= new cartPage(driver);
		cartPage.click_checkBox();
		cartPage.click_proceed();	
	}
}
