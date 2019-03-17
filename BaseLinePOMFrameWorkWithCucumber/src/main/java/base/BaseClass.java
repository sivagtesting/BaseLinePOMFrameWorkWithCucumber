package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;

import baseUtils.ReadExcel;

@Listeners(ExtentITestListenerClassAdapter.class)
public class BaseClass {
	public static ChromeDriver driver;
	public String dataSheetName;

	/*
	 * Concepts Covered 1) Using TestNG Annotation and configuring common steps for
	 * all tcs to be executed automatically week5.day2: 2) Parameterizing test data
	 * which are common to all tcs(For ex: URL, Username, pwd etc.,) 3) Using Data
	 * provider annotation for test data which are specific to test cases(For ex:
	 * companyName, firstName, lastName
	 */

	@Parameters("url") // Name should be as per mentioned in xml(need not be same order)
	@BeforeMethod
	public void login(String url) { 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	}

	@AfterMethod
	public void closeApp() {
		driver.close();
	}

	@DataProvider(name = "fetchData")
	public String[][] getData() throws IOException {
		return ReadExcel.getExcelData(dataSheetName);

	}

}
