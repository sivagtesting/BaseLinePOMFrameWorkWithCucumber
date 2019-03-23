package pages;

import base.BaseClass;

public class MyLeadsPage extends BaseClass {
	public MyLeadsPage() {

	}

	public CreateLead clickOnCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLead();
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
