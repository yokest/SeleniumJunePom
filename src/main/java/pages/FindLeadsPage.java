package pages;

import wrappers.OpentapsWrappers;

public class FindLeadsPage extends OpentapsWrappers{
	
	public static String leadid;
	
	public FindLeadsPage enterFirstName(String firstName) {
		// enterById(prop.getProperty("Login.UserName.Id"), data);
		enterByXpath(prop.getProperty("FindLeads.FirstName.Xpath"), firstName);
		return this;
	}

	public FindLeadsPage clickPhoneTab() {

		clickByXpath(prop.getProperty("FindLeads.PhoneTab.Xpath"));
		return this;
	}

	public FindLeadsPage enterPhoneNumber(String phoneNumber) {
		// enterById(prop.getProperty("Login.UserName.Id"), data);
		enterByName(prop.getProperty("FindLeads.PhoneNumber.Name"), phoneNumber);
		//FindLeads.PhoneNumber.Name
		return this;
	}

	public FindLeadsPage clickFindLeadsButton() {
		// enterById(prop.getProperty("Login.UserName.Id"), data);
		clickByXpath(prop.getProperty("FindLeads.FindLeadsbutton.Xpath"));
		try {
			
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//FindLeads.FindLeadsbutton.Xpath
		return this;
	}

	public FindLeadsPage getFirstResultingLead() {

		leadid = getTextbyXpath(prop.getProperty("FindLeads.clickFirstResultingLead.Xpath"));
		System.out.println(leadid);
		return this;
		
		
	}
	
	public FindLeadsPage enterleadid(){
		enterByXpath(prop.getProperty("FindLeads.LeadId.Xpath"), leadid );
		return this;
	}


	public ViewLead clickFirstResultingLead() {

		clickByXpath(prop.getProperty("FindLeads.clickFirstResultingLead.Xpath"));
		
		return new ViewLead();
	}
	
	public FindLeadsPage noRecordsCheck() {
		
		verifyTextContainsByXpath(prop.getProperty("FindLeads.verifyText.Xpath"), "No records to display");
		return this;
		
	}
	

}
