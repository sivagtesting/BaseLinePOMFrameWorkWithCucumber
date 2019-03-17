package pages;

import base.BaseClass;

public class HomePage extends BaseClass {
	public HomePage() {

	}

	public MyHomePage clickCRMSFALink() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
	}

}
