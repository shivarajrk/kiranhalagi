package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
	
	

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewButton;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomerBtn;

	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement enterCustomerName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement descriptionBtn;
	
	
	@FindBy(xpath="//div[@class='comboboxButton']/div")
	private WebElement selectCustomerBtn;
	
	@FindBy(xpath="//div[@class='itemRow cpItemRow selected']")
	private WebElement ourCompanyOptionBtn;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath="//div[@title='HDFC_001']")
	private WebElement actualText;
	
	public WebElement getActualText() {
		return actualText;
	}

	public TaskPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewButton() {
		return addNewButton;
	}

	public WebElement getNewCustomerBtn() {
		return newCustomerBtn;
	}

	public WebElement getEnterCustomerName() {
		return enterCustomerName;
	}

	public WebElement getDescriptionBtn() {
		return descriptionBtn;
	}

	public WebElement getSelectCustomerBtn() {
		return selectCustomerBtn;
	}

	public WebElement getOurCompanyOptionBtn() {
		return ourCompanyOptionBtn;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}
	
	
	
	
	
	
	
	

}
