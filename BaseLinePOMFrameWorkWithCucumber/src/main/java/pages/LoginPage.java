package pages;

import base.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage() {

	}

	public LoginPage enterUserName(String uName) {
		driver.findElementById("username").sendKeys(uName);
		return this;
	}

	public LoginPage enterPassword(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
		return this;
	}

	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
	}

}
