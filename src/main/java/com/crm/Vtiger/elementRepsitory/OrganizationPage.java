package com.crm.Vtiger.elementRepsitory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationPage {
public OrganizationPage(WebDriver driver) {
	PageFactory.initElements( driver,this);
	
}
//Locate all elements
@FindBy(xpath="//img[@alt='Create Organization...']")
private WebElement createOrgImg;
@FindBy(name="search_context")
private WebElement searchEdt;
@FindBy(name="submit")
private WebElement submitBtn;
//provide getters
public  WebElement getCreateOrgImg() {
	return createOrgImg;

}
public WebElement getSearchEdt() {
return searchEdt;

}
//provide business method
public void clickOncreateOrgImg() {
	
}
}
