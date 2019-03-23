package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.FindLeadsPage;
import pages.LoginPage;

public class TC005_MergeLead extends BaseClass {
	
	@BeforeTest
	public void setData() {
		dataSheetName = "TC005_MergeLead";
	}
	
	@Test(dataProvider="fetchData")
	public void mergeLeadTest(String uName, String pwd, String mailId, String mailId2) throws InterruptedException {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFALink()
		.clickonLeads()
		.clickOnMergeLeads()
		.clickFrmLeadIcon()
		.switchToLastWindow()
		.clickOnEmailTab()
		.enterEmailID(mailId)
		.clickFindLeadsButton();
		String fromId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		new FindLeadsPage()
		.selectFirstLeadId()
		.switchToFirstWindow()
		.clickToLeadIcon()
		.switchToLastWindow()
		.clickOnEmailTab()
		.enterEmailID(mailId2)
		.clickFindLeadsButton()
		.selectFirstLeadId()
		.switchToFirstWindow()
		.clickOnMergeButton()
		.acceptAlert()
		.clickOnFindLeads()
		.enterLeadID(fromId)
		.clickFindLeadsButton()
		.verifyErrorMsg();
		
		
		
	}

}
