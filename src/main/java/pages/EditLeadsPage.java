package pages;

import wrappers.OpentapsWrappers;

public class EditLeadsPage extends OpentapsWrappers {
	public EditLeadsPage selectSource(String DataSource) {
		// enterById(prop.getProperty("Login.UserName.Id"), data);
		selectById(prop.getProperty("Editlead.selectsource.Id"), DataSource);
		return this;
	}

	public EditLeadsPage clickAddsource() {
		// enterById(prop.getProperty("Login.UserName.Id"), data);
		clickByXpath(prop.getProperty("Editlead.clickAddSource.xpath"));
		return this;
	}

	public EditLeadsPage selectMarketingcampaign(String MarketingCampaign) {
		// enterById(prop.getProperty("Login.UserName.Id"), data);
		selectById(prop.getProperty("Editlead.selectMarketingcampaign.Id"), MarketingCampaign);
		return this;
	}

	public EditLeadsPage clickAddmarketingCampaign(String data) {
		// enterById(prop.getProperty("Login.UserName.Id"), data);
		clickByXpath(prop.getProperty("Editlead.clickAddmarketingCampaign.xpath"));
		return this;
	}

	public ViewLead clickUpdate() {
		clickByName(prop.getProperty("Editlead.clickUpdate.class"));
		return new ViewLead();
	}

}
