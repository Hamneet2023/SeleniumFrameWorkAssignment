package com.nopcommerce.AutomationFrameworkAssignment.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	public static WebDriver wd;
	FileInputStream fileInputStream;
	Properties prop;

	public Testbase() {
		prop=new Properties();
		try {
			fileInputStream = new FileInputStream(
					"C:\\Users\\hamne\\OneDrive\\Desktop\\Java\\AutomationFrameworkAssignment\\src\\main\\java\\com\\nopcommerce\\AutomationFrameworkAssignment\\Config\\Config.Properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fileInputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void intialisation() {
		String browserName = prop.getProperty("browser");
		switch (browserName) {
		case "chrome":
			wd = WebDriverManager.chromedriver().create();

			break;
		case "Edge":
			wd = WebDriverManager.edgedriver().create();
			break;
		case "Firefox":
			wd = WebDriverManager.firefoxdriver().create();
			break;

		default:
			System.out.println("Not a valid browser name");
			break;
		}

		wd.get(prop.getProperty("URL"));
		wd.manage().timeouts().implicitlyWait(Long.parseLong(prop.getProperty("IMPLICT_WAIT")), TimeUnit.SECONDS);
		wd.manage().window().maximize();
	}

	public void tearDown() {
		wd.quit();
	}
}
