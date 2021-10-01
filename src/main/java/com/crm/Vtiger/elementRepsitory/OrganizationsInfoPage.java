package com.crm.Vtiger.elementRepsitory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class OrganizationsInfoPage {
//constructor
	public OrganizationsInfoPage(WebDriver driver) {
		PageFactory.initElements(  driver, this);
		
		
	}
	//provide all WebElement
	@FindBy(xpath="/span[@class=dvHeaderText']")
	private WebElement organizationInfo;
	@FindBy(id="dtlview_IndustryInfo")
	private WebElement industryInfo;
	@FindBy(id="dtlview_type")
	private WebElement typeInfo;
	
	//provide Getters
	public WebElement getOrganizationInfo() {
		return organizationInfo;
		
			
			
				}
	public WebElement getIndustryInfo() {
	return industryInfo;
	
	}
	public WebElement getTypeInfo() {
		return typeInfo;
		
		
	}
	//provide business logic
	/**
	 * get organization information
	 * @return
	 */
	public String getOrganizatiosInfo() {
	String value=organizationInfo.getText()	;
	return value;
	

}
	/**
	 * get industry information
	 */ 
public String getIndustriesInfo() {
String value=industryInfo.getText();
return value;


}

/**
 * get type information
*/
public String getTypesInfo() {
	String value=typeInfo.getText();
	return value;
	
}
}

