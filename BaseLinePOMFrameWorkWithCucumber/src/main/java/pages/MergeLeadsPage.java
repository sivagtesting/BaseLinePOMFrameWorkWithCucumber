package pages;

import java.util.Set;

import base.BaseClass;

public class MergeLeadsPage extends BaseClass {
	public MergeLeadsPage() {

	}

	public MergeLeadsPage clickFrmLeadIcon() {
		driver.findElementByXPath("//table[@id='widget_ComboBox_partyIdFrom']//following-sibling::a").click();
		return this;
	}
	
	public FindLeadsPage switchToLastWindow() {
		Set<String> allWindowIds = driver.getWindowHandles();
		
		for (String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			
		}
		/*
		List<String> windowIds = new ArrayList<String>();
		
		
		windowIds.addAll(allWindowIds);
		driver.switchTo().window(windowIds.get(1));*/
		return new FindLeadsPage();
	}
	
	public MergeLeadsPage clickToLeadIcon() {
		driver.findElementByXPath("//input[@id='partyIdTo']/following-sibling::a").click();
		return this;
	}
	
	public MergeLeadsPage clickOnMergeButton() {
		driver.findElementByLinkText("Merge").click();
		return this;
	}
	
	public ViewLeadsPage acceptAlert() {
		driver.switchTo().alert().accept();
		return new ViewLeadsPage();
	}

}
