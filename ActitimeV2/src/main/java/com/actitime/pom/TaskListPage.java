package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustOption;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement enterCustTbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustDesp;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustDD;
	
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourCompanyTx;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement actualCustCreateTx;
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getNewCustOption() {
		return newCustOption;
	}

	public WebElement getEnterCustTbx() {
		return enterCustTbx;
	}

	public WebElement getEnterCustDesp() {
		return enterCustDesp;
	}

	public WebElement getSelectCustDD() {
		return selectCustDD;
	}

	public WebElement getOurCompanyTx() {
		return ourCompanyTx;
	}

	public WebElement getCreateCustBtn() {
		return createCustBtn;
	}

	public WebElement getActualCustCreateTx() {
		return actualCustCreateTx;
	}
	
	
	
}

























