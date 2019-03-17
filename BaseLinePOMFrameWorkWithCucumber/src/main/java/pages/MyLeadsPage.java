package pages;

import base.BaseClass;

public class MyLeadsPage extends BaseClass {
	public MyLeadsPage() {

	}

	public CreateLead clickOnCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLead();
	}

	public FindLeadsPage clickOnFindLeads() throws InterruptedException {
		driver.findElementByLinkText("Find Leads").click();
		Thread.sleep(3000);
		return new FindLeadsPage();
	}

}
