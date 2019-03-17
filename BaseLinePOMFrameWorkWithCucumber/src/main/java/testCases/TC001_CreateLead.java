package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC001_CreateLead extends BaseClass {
	
	@BeforeTest
	public void setData() {
		dataSheetName = "TC001_CreateLead";
	}
	
	@Test(dataProvider="fetchData")
	public void createLeadTest(String uName, String pwd, String cName, String fName, String lName, String mail) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clickCRMSFALink()
		.clickonLeads()
		.clickOnCreateLead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.selectIndustry()
		.enterEmail(mail)
		.clickCreateLeadButton()
		.verifyLeadName();
	}

}
