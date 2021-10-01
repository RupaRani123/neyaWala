package com.crm.Vtiger.Organization;

import org.testng.annotations.Test;

public class TC_01_CreateOrganizationTest {
@Test(groups="SmokeSuite")
public void createOrganizationTest()throws Throwable{
	//get organization name from external resources
	String ORGANIZATIONNAME=eLib.getExcelData("sheet1",25,2);
	
}

}
