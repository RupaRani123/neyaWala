package com.crm.Vtiger.elementRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.Vtiger.GenericUtility.WebDriverUtility;

public class CreateOrganizationPage  extends WebDriverUtility{
  WebDriver driver;
//constructor
public CreateOrganizationPage(WebDriver driver) {
	
	PageFactory.initElements( driver,this);
	
}
//provide all webElements
@FindBy(name="accountname")
private WebElement orgNameEdt;
@FindBy(name="industry")
private WebElement industryDropdown;
@FindBy(name="accounttype")
private WebElement typeDropdown;
@ FindBy(xpath="//input[@title='save[Alt+S']")
private WebElement saveBtn;
//provide getters
public WebElement getOrgNameEdt() {
	return orgNameEdt;
	
}
public WebElement getIndustryDropdown() {
	return industryDropdown;
	
}
public WebElement getTypeDropdown() {
	return typeDropdown;
	
}

public WebElement getsaveBtn() {
return saveBtn;
}
//Business logic 
/**
 * this method will create orgaization with mandatory fields
 * org name
 * ind type
 * @re
 */
public  boolean createOrganizationWithIndustry(String orgName,String indType)
{
	orgNameEdt.sendKeys(orgName);
	industryDropdown.click();
	return industryDropdown.isEnabled();
}
public void createOrganizationWithType(String orgName,String Type)
{
	orgNameEdt.sendKeys(orgName);
	select(typeDropdown,Type);
	saveBtn.click();
}
	

	public boolean createOrganizationWihTypeDropdown(String orgName)
	{
	orgNameEdt.sendKeys(orgName);	
	typeDropdown.click();
	return typeDropdown.isEnabled();
	}
	
}
	
	


