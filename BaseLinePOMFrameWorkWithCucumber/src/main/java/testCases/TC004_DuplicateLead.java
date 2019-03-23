package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;
import pages.ViewLeadsPage;

public class TC004_DuplicateLead extends BaseClass {
	
	@BeforeTest
	public void setData() {
		dataSheetName = "TC004_DuplicateLead";
	}

	@Test(dataProvider="fetchData")
	public void duplicateLeadTest(String uName, String pwd, String mailId) throws InterruptedException {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFALink()
		.clickonLeads()
		.clickOnFindLeads()
		.clickOnEmailTab()
		.enterEmailID(mailId)
		.clickFindLeadsButton()
		.selectFirstLeadId();
		String leadId = driver.findElementById("viewLead_companyName_sp").getText();
		new ViewLeadsPage()
		.clickOnDuplicateButton()
		.verifyTitle()
		.clickCreateLeadButton()
		.verifyLeadName(leadId);
		
	}
	
	
}
