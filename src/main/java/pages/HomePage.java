package pages;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class HomePage extends OpentapsWrappers{

	public HomePage() {
		if(!verifyTitle("Opentaps Open Source ERP + CRM"))
			Reporter.reportStep("This is not Home Page", "FAIL");
	}	

	public HomePage verifyUserName(String data) {
		verifyTextContainsByXpath(prop.getProperty("Home.UserName.Xpath"), data);
		return this;
	}

	  public CRMHomePage clickCrmsfa(){
		   clickByLink(prop.getProperty("Home.CRMSFA.Link"));
		return new CRMHomePage();
	   }















}
