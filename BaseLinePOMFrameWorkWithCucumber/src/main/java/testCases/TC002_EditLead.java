package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC002_EditLead extends BaseClass {
	
	@BeforeTest
	public void setData() {
		dataSheetName = "TC002_EditLead";
	}
	
	
	@Test(dataProvider="fetchData")
	public void editLeadTest(String uName, String pwd, String mailId, String cName) throws InterruptedException {
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
//		Thread.sleep(3000);
		.clickOnLeadId()
		.verifyTitle()
		.clickOnEditButton()
		.enterUpdatedCName(cName)
		.clickUpdate()
		.verifyEditLead();
	}
}
