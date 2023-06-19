package com.nopcommerce.AutomationFrameworkAssignment.Test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.nopcommerce.AutomationFrameworkAssignment.Pages.BuildYourOwnComputer;
import com.nopcommerce.AutomationFrameworkAssignment.Pages.CheckOut;
import com.nopcommerce.AutomationFrameworkAssignment.Pages.DemoStore;
import com.nopcommerce.AutomationFrameworkAssignment.Pages.Desktops;
import com.nopcommerce.AutomationFrameworkAssignment.Pages.Login;
import com.nopcommerce.AutomationFrameworkAssignment.Pages.Register;
import com.nopcommerce.AutomationFrameworkAssignment.Pages.ShoppingCart;
import com.nopcommerce.AutomationFrameworkAssignment.base.Testbase;

public class CheckOutTest extends Testbase {

	DemoStore demoStore;
	Register register;
	Login login;
	CheckOut checkout;
	Desktops desktops;
	ShoppingCart shoppingCart;
	BuildYourOwnComputer buildYourOwnComputer;

	@BeforeMethod
	public void setUp() {
		intialisation();
		demoStore = new DemoStore();
	}

	@Test(priority = 1)
	public void validateUserRegister() {
		register = demoStore.clickRegisterBtn();
		register.selectGender();
		register.enterFirstName();
		register.enterLastName();
		register.enterEmail();
		register.enterCompanyName();
		register.selectNewsletterCheckBox();
		register.enterPassword();
		register.enterConfirmPasswordField();
		register = register.clickRegisterBtn();
//System.out.println(register.getRegisterBtnText());

		Assert.assertEquals(register.getRegisterTitle(), "nopCommerce demo store. Register", "Registeration Failed");

//demoStore=register.clickContinueBtn();

	}

//	@Test(priority = 2)
//	public void validateLoginWithPositivrCredential() {
//		login = demoStore.clickLoginBtn();
//		login.enterEmail();
//		login.enterPassword();
//		//demoStore = login.clickLoginBtn();
//
//		Assert.assertEquals(wd.getTitle(), "nopCommerce demo store", "You are on wrong page");
//	}
	@Test(priority = 3)
	public void validateCheckoutProcess() {
		demoStore.selectComputerOption();
		desktops = demoStore.clickDesktopsBtn();
		buildYourOwnComputer = desktops.clickAddToCartBtn();
		buildYourOwnComputer.selectProcessorValue();
		buildYourOwnComputer.selectRamValue();
		buildYourOwnComputer.selectHddRadioBtn();
		buildYourOwnComputer.selectOsRadioBtn();
		buildYourOwnComputer.selectsoftwareCheckBox();
		buildYourOwnComputer = buildYourOwnComputer.clickAddTocartBtn();
		shoppingCart = buildYourOwnComputer.clickShopingcartLink();
		shoppingCart.clickTermsOfServiceCheckBox();
		login = shoppingCart.clickCheckOutBtn();

		login.enterEmail();
		login.enterPassword();
		shoppingCart = login.clickLoginBtn();

		shoppingCart.clickTermsOfServiceCheckBox();
		checkout = shoppingCart.clickCheckOutBtnForFinalCheckout();
//		checkout.enterFirstName();
//		checkout.enterLastName();
//		checkout.enterEmail();
//		checkout.enterCompanyName();
		checkout.selectCountry();
		checkout.entercityField();
		checkout.enterAddress1Fiels();
		checkout.enterAddress2Fiels();
		checkout.enterPostalCodeField();
		checkout.enterPhoneNumber();
		checkout.enterFaxNumberField();
		checkout = checkout.selectContinueBtn();
		checkout.selectShippingMethodRadioBtn();
		checkout = checkout.selectContinueBtnAfterShippingMethod();
		checkout.selectPaymentMethodRadioBtn();
		checkout = checkout.selectContinueBtnAfterpaymentMethod();
		checkout = checkout.selectContinueBtnAfterpaymentInformation();
		checkout = checkout.selectConfirmBtn();
		Assert.assertEquals(wd.getTitle(), "nopCommerce demo store. Checkout", "Checkout failed");

//	String texts=	checkout.showThankyouTextMessage();
//	System.out.println(texts);
//	Assert.assertEquals(texts, "Thank you","Checkout failed");

	}
}
