package automation.testsuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Common;
public class Day8_Locator2 extends CommonBase

{
	@BeforeMethod
	public void openChrome() throws InterruptedException
	{
		driver = initChromeDriver(CT_Common.URL_Alada);
		
	}
	@Test
	public void practiceLocator() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement txtName = driver.findElement(By.id("txtFirstname"));
		txtName.sendKeys("huy");
		WebElement txtEmail = driver.findElement(By.id("txtEmail"));
		txtEmail.sendKeys("huylq@gmail.com");
		WebElement txtReEmail = driver.findElement(By.id("txtCEmail"));
		txtReEmail.sendKeys("huylq@gmail.com");
		WebElement txtPassword = driver.findElement(By.id("txtPassword"));
		txtPassword.sendKeys("12345678");
		WebElement txtRePassword = driver.findElement(By.id("txtCPassword"));
		txtRePassword.sendKeys("12345678");
		
	}
}
