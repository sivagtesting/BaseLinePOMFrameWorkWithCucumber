package pages;

import base.BaseClass;

public class MyHomePage extends BaseClass {
	public MyHomePage() {

	}

	public MyLeadsPage clickonLeads() {
		driver.findElementByLinkText("Leads").click();
		return new MyLeadsPage();
	}

}
