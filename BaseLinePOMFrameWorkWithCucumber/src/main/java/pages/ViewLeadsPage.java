package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import base.BaseClass;

public class ViewLeadsPage extends BaseClass {

	public ViewLeadsPage() {

	}

	public ViewLeadsPage getLeadName() {
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
	
	public MyLeadsPage clickOnDeleteButton() {
		driver.findElementByLinkText("Delete").click();
		return new MyLeadsPage();
	}
	
	public DuplicateLeadPage clickOnDuplicateButton() {
		driver.findElementByLinkText("Duplicate Lead").click();
		return new DuplicateLeadPage();
	}
	
	public void verifyLeadName(String leadId) {
		
		if (driver.findElementById("viewLead_companyName_sp").getText().replaceAll("\\s.+", "").equals(leadId.replaceAll("\\s.+", ""))) {
			System.out.println(
					"The Dupliacated lead Name: '" + driver.findElementById("viewLead_companyName_sp").getText()
							+ "' is same as capture Lead name: '" + leadId + "'");
			System.out.println("Duplicate Lead Tcs completed");
		} else {
			System.out.println("Duplicate Lead Name is not equal to Copied Lead Name");
			System.out.println(driver.findElementById("viewLead_companyName_sp").getText());
		}
	}
	
	public MergeLeadsPage switchToFirstWindow() {
		Set<String> allWindowIds = driver.getWindowHandles();

		List<String> windowIds = new ArrayList<String>();
		windowIds.addAll(allWindowIds);
		driver.switchTo().window(windowIds.get(0));
		return new MergeLeadsPage();
	}
	
	public FindLeadsPage clickOnFindLeads(){
		driver.findElementByLinkText("Find Leads").click();
		return new FindLeadsPage();
	}

}
