package com.nopcommerce.AutomationFrameworkAssignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.nopcommerce.AutomationFrameworkAssignment.base.Testbase;

public class ShoppingCart extends Testbase {
	public ShoppingCart() {
		PageFactory.initElements(wd, this);
	}

	@BeforeMethod
	public void setUp() {
		intialisation();
	}

	@FindBy(css = "div.terms-of-service input")
	private WebElement termsOfServiceCheckBox;

	@FindBy(css = "div.checkout-buttons button")
	private WebElement checkOutBtn;

	public void clickTermsOfServiceCheckBox() {
		termsOfServiceCheckBox.click();

	}

	public Login clickCheckOutBtn() {
		checkOutBtn.click();
		return new Login();

	}

	public CheckOut clickCheckOutBtnForFinalCheckout() {
		checkOutBtn.click();
		return new CheckOut();

	}

	@AfterMethod
	public void quit() {
		tearDown();
	}

}
