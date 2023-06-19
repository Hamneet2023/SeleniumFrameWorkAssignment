package com.nopcommerce.AutomationFrameworkAssignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.nopcommerce.AutomationFrameworkAssignment.base.Testbase;

public class Login extends Testbase {

	public Login() {
		PageFactory.initElements(wd, this);
	}

	@BeforeMethod
	public void setUp() {
		intialisation();
	}

	@FindBy(css = "#Email")
	private WebElement emailField;

	@FindBy(css = "#Password")
	private WebElement passwordField;

	@FindBy(css = "button.login-button")
	private WebElement loginBtn;

	public void enterEmail() {
		emailField.sendKeys("dj11000@gmail.com");
	}

	public void enterPassword() {
		passwordField.sendKeys("Password1");
	}

	public ShoppingCart clickLoginBtn() {
		loginBtn.submit();
		return new ShoppingCart();
	}

//	public String getLoginTitle() {
//		return wd.getTitle();
//	}

	@AfterMethod
	public void quit() {
		tearDown();
	}
}
