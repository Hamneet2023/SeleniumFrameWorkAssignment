package com.nopcommerce.AutomationFrameworkAssignment.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.nopcommerce.AutomationFrameworkAssignment.base.Testbase;

public class RegisterTest extends Testbase {
	@BeforeMethod
	public void setUp() {
		intialisation();
	}

	@AfterMethod
	public void quit() {
		tearDown();
	}

}
