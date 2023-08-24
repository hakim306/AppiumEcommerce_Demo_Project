package appuimFrameworkDesign;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.FormPage;

public class eCommerce_Tc2 extends Base {
	
	@Test
	public void fillForm_ErrorValidation() throws InterruptedException {
		Thread.sleep(5000);
		FormPage formPage=new FormPage(driver);
		formPage.selectCountry("Aruba");
		formPage.setGender("female");
		formPage.click_submitBtn();
		String toastText=formPage.Get_toast_text();
		System.out.println(toastText);
		Assert.assertEquals(toastText, "Please enter your name");
		Thread.sleep(3000);
	}
	
	@Test
	public void fillForm_PositiveFlow() throws InterruptedException {
		Thread.sleep(5000);
		FormPage formPage=new FormPage(driver);
		formPage.selectCountry("Aruba");
		formPage.setGender("female");
		formPage.click_submitBtn();
		String toastText=formPage.Get_toast_text();
		System.out.println(toastText);
		Assert.assertEquals(toastText, "Please enter your name");
		Thread.sleep(3000);
	}

}
