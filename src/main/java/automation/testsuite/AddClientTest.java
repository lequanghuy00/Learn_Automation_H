package automation.testsuite;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Common;
import automation.constant.Locator;
import automtion.page.*;

public class AddClientTest extends CommonBase {
	@BeforeMethod
	public void openChrome() throws InterruptedException
	{
		driver = initChromeDriver(CT_Common.URL_rise_d13);	
	}
	@Test
	public void addClientSuccess() throws InterruptedException
	{
		LoginPageFactory login = new LoginPageFactory(driver);
		login.LoginFunction("admin@demo.com", "riseDemo");
		ClientPage_Factory client = new ClientPage_Factory(driver);
		client.AddClient("ttlabvn");
		Thread.sleep(3000);
		assertTrue(driver.findElement(By.xpath("//td/child::a[text()='ttlabvn']")).isDisplayed());
	}
}
