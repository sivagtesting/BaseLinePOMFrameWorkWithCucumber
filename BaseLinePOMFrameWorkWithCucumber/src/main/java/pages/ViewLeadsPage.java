package pages;

import base.BaseClass;

public class ViewLeadsPage extends BaseClass {

	public ViewLeadsPage() {

	}

	public ViewLeadsPage verifyLeadName() {
		System.out.println("Created Lead Name is: " + driver.findElementById("viewLead_companyName_sp").getText());
		return this;
	}

	public ViewLeadsPage verifyTitle() {
		if (driver.getTitle().contains("View Lead")) {
			System.out.println("The Title of the Page contains the string: 'View Lead'");
		} else
			System.err.println("Title of Page does not contain 'View Lead'");
		return this;
	}

	public OpentapsPage clickOnEditButton() {
		driver.findElementByLinkText("Edit").click();
		return new OpentapsPage();
	}

	public ViewLeadsPage verifyEditLead() {
		System.out.println("Lead is successfully edited..! Lead Name after editing: '"
				+ driver.findElementById("viewLead_companyName_sp").getText() + "'");
		return this;
	}

}
