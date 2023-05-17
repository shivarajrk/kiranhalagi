package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com.actitime.generic.BaseClass;

public class Utilities {
	
	/***********************************
	 * Method Name : Click
	 * Written By  : Shivaraj
	 * Reviewed By : Dhanraj
	 * Approved By : Kiran
	 * *********************************
	 */
	
	BaseClass cls=new BaseClass();
	
	public static WebDriver driver;
	
	public static void Click(By locator,String validationText)
	{
		driver.findElement(locator).click();
		Reporter.log("Clicked On : "+validationText+true);
	}

}
