package automation.testsuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Common;
public class Day8_btvn extends CommonBase

{
	@BeforeMethod
	public void openChrome() throws InterruptedException
	{
		driver = initChromeDriver(CT_Common.URL_btvnd8);
		
	}
	@AfterClass
	public void closeChrome()
	{
		driver.close();
	}
	@Test
	public void practiceLocator() throws InterruptedException
	{
		Thread.sleep(1000);
		WebElement txtName = driver.findElement(By.name("name"));
		System.out.println("find locator by name");
		WebElement txtAddress = driver.findElement(By.id("address"));
		System.out.println("find locator by id");
		WebElement txtEmail = driver.findElement(By.name("email"));
		System.out.println("find locator by name");
		WebElement txtPassword = driver.findElement(By.id("password"));
		System.out.println("find locator by id");
		
	}
}
