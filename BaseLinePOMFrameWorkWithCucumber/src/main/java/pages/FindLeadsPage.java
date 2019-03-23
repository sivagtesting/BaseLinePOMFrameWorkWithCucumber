package pages;

import base.BaseClass;

public class FindLeadsPage extends BaseClass {
	String firstLeadId;
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

	public FindLeadsPage clickFindLeadsButton() throws InterruptedException {
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		return this;
	}
	
	public FindLeadsPage copyLeadID() {
		firstLeadId = driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
		return this;
	}

	public ViewLeadsPage selectFirstLeadId() {
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		return new ViewLeadsPage();
	}
	
	public FindLeadsPage enterLeadID(String firstLeadId) {
		driver.findElementByXPath("//input[@name='id']").sendKeys(firstLeadId);
		return this;
	}
	
	public FindLeadsPage verifyErrorMsg() {
		if (driver.findElementByClassName("x-paging-info").getText().equals("No records to display")) {
			System.out.println("No records to display - Error Message is thrown properly");
		} else {
			System.out.println("No records to display - Not Displayed");
		}
		return this;
	}
}
