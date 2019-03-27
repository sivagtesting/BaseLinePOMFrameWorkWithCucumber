package pages;

import base.BaseClass;

public class MyLeadsPage extends BaseClass {
	public MyLeadsPage() {

	}

	public CreateLeadPage clickOnCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}

	public FindLeadsPage clickOnFindLeads(){
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadsPage();
	}
	
	public MergeLeadsPage clickOnMergeLeads() {
		driver.findElementByLinkText("Merge Leads").click();
		return new MergeLeadsPage();
		
	}

}
