package pages;

import base.BaseClass;

public class FindLeadsPage extends BaseClass {
	public FindLeadsPage() {

	}

	public FindLeadsPage clickOnEmailTab() {
		driver.findElementByXPath("//span[text()='Email']").click();
		return this;
	}

	public FindLeadsPage enterEmailID(String mailId) {
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys(mailId);
		return this;
	}

	public FindLeadsPage clickFindLeadsButton() {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		return this;
	}

	public ViewLeadsPage clickOnLeadId() {
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		return new ViewLeadsPage();
	}
}
