package com.nopcommerce.AutomationFrameworkAssignment.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.nopcommerce.AutomationFrameworkAssignment.Pages.DemoStore;
import com.nopcommerce.AutomationFrameworkAssignment.Pages.Login;
import com.nopcommerce.AutomationFrameworkAssignment.Pages.Register;
import com.nopcommerce.AutomationFrameworkAssignment.base.Testbase;

public class DemoStoreTest extends Testbase {

	DemoStore demoStore;
	Register register;
	Login login;

	@BeforeMethod
	public void setUp() {
		intialisation();
		demoStore = new DemoStore();
	}

//	@Test(priority = 1)
//	public void validateUserRegister() {
//		register = demoStore.clickRegisterBtn();
//		register.selectGender();
//		register.enterFirstName();
//		register.enterLastName();
//		register.enterEmail();
//		register.enterCompanyName();
//		register.selectNewsletterCheckBox();
//		register.enterPassword();
//		register.enterConfirmPasswordField();
//		register = register.clickRegisterBtn();
//  System.out.println(register.getRegisterBtnText());
//
//		Assert.assertEquals(register.getRegisterTitle(), "nopCommerce demo store. Register", "Registeration Failed");
//
////demoStore=register.clickContinueBtn();
//
//	}
//	@Test(priority = 2)
//public void validateLoginWithPositivrCredential() {
//		login=demoStore.clickLoginBtn();
//		login.enterEmail();
//		login.enterPassword();
//		demoStore=login.clickLoginBtn();
//		
//		Assert.assertEquals(wd.getTitle(), "nopCommerce demo store","You are on wrong page");
//	}

	@AfterMethod
	public void quit() {
		// tearDown();
	}

}
