package pages;

import base.BaseClass;

public class OpentapsPage extends BaseClass {

	public OpentapsPage() {

	}

	public OpentapsPage enterUpdatedCName(String cName) {
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys(cName);
		return this;
	}

	public ViewLeadsPage clickUpdate() {
		driver.findElementByXPath("//input[@value='Update']").click();
		return new ViewLeadsPage();
	}
}
