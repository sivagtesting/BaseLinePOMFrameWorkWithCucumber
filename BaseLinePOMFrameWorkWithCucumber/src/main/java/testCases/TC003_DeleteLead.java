package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.FindLeadsPage;
import pages.LoginPage;

public class TC003_DeleteLead extends BaseClass {
	
	@BeforeTest
	public void setData() {
		dataSheetName = "TC003_DeleteLead";
	}
	
	@Test(dataProvider="fetchData")
	public void deleteLeadTest(String uName, String pwd, String mailId) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFALink()
		.clickonLeads()
		.clickOnFindLeads()
		.clickOnEmailTab()
		.enterEmailID(mailId)
		.clickFindLeadsButton();
		//.copyLeadID()
		String deletedLeadId = driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
		new FindLeadsPage()
		.selectFirstLeadId()
		.clickOnDeleteButton()
		.clickOnFindLeads()
		.enterLeadID(deletedLeadId)
		.clickFindLeadsButton()
		.verifyErrorMsg();
		
	}

}
