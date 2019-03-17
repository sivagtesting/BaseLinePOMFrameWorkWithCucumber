package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.BaseClass;

public class CreateLead extends BaseClass {
	public CreateLead() {

	}

	public CreateLead enterCompanyName(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		return this;
	}

	public CreateLead enterFirstName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		return this;
	}

	public CreateLead enterLastName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		return this;
	}

	public CreateLead selectIndustry() {
		int count = 0;
		WebElement dropDown = driver.findElementById("createLeadForm_industryEnumId");
		Select dd1 = new Select(dropDown);
		List<WebElement> options = dd1.getOptions();
		for (int j = 0; j < options.size(); j++) {
			String text = options.get(j).getText();
			// System.out.println(text);
			// System.out.println(text.charAt(0));
			// char c = text.charAt(0) ;
			if (text.charAt(0) == 'C') {// not working
				count++;
			}
			if (count == 2) {
				dd1.selectByIndex(j);
				break;
			}

		}
		return this;
	}

	public CreateLead enterEmail(String mail) {
		driver.findElementById("createLeadForm_primaryEmail").sendKeys(mail);
		return this;
	}

	public ViewLeadsPage clickCreateLeadButton() {
		driver.findElementByName("submitButton").click();
		return new ViewLeadsPage();
	}

}
