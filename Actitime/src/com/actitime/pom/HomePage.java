package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utilities;

public class HomePage {

	
	
	@FindBy (id="container_tasks")
	private WebElement TaskButton;
	
	@FindBy (id="logoutLink")
	private String lgout;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
/*	public void setLogout()
	{
		Utilities.Click(By.id(lgout), "Logout Button");
	}*/
	public void setTaskButton() {
		TaskButton.click();
		
	}
	
	public void setLogout()
	{
		lgout.
		lgout.click();
	}

}
