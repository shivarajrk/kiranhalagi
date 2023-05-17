package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

import utilities.Utilities;

public class BaseClass extends Utilities{
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public WebDriver driver;
	@BeforeTest
	public void opebBrowser() {
		Reporter.log("openBrowser",true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void closeBrowser() {
		Reporter.log("closeBrowser",true);
		driver.close();
		
	}
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("login",true);
		FileLib f=new FileLib();
		String URL = f.getProperty("url");
		String UN = f.getProperty("username");
		String PW = f.getProperty("password");
		driver.get(URL);
		LoginPage l=new LoginPage(driver);
		l.setLoginPage(UN, PW);
		
		
			
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout",true);

		HomePage h= new HomePage(driver);
		h.setLogout()
	}

}
