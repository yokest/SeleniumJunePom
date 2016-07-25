package testcases;

import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.OpentapsWrappers;

import org.testng.annotations.BeforeClass;

public class TC003_DeleteLead extends OpentapsWrappers{
	@Test(dataProvider="fetchData")
	public void login(String userName, String passWord, 
			String phonenumber, String message) {

		new LoginPage()
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmsfa()
		.clickLeads()
		.clickFindLeads()
		.clickPhoneTab()
		.enterPhoneNumber(phonenumber)
		.clickFindLeadsButton()
		.getFirstResultingLead()
		.clickFirstResultingLead()
		.clickDelete()
		.clickFindLeads()
		.enterleadid()
		.clickFindLeadsButton()
		.verifyTextContainsByXpath("//div[@class='x-paging-info']", message);
		
		
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="TC003_DeleteLead";
		browserName="chrome";
		testCaseName="TC003_Delete Lead";
		testDescription="Delete Lead test case";
	}

	
	
	
	
	
	
}
