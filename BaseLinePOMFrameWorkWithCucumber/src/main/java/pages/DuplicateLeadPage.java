package pages;

import base.BaseClass;

public class DuplicateLeadPage extends BaseClass {
	public DuplicateLeadPage() {

	}
	
	public DuplicateLeadPage verifyTitle() {
		if (driver.getTitle().contains("Duplicate Lead")) {
			System.out.println("The Title contains 'Duplicate Lead'");
			return this;
		}else {
			System.out.println("Page title does not Contain 'Duplicate Lead'");
			return this;
		}
	}
	
	public ViewLeadsPage clickCreateLeadButton() {
		driver.findElementByName("submitButton").click();
		return new ViewLeadsPage();
	}

	
}
