package automation.testsuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Common;
public class Day8_Locator extends CommonBase
{
	@BeforeMethod
	public void openChrome() throws InterruptedException
	{
		driver = initChromeDriver(CT_Common.URL_SelectorHub);
		
	}
	@Test
	public void practiceLocator() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@title='Close']")).click();
		Thread.sleep(3000);
		WebElement userEmail = driver.findElement(By.name("email"));
		userEmail.sendKeys("huylq@gmail.com");
		System.out.println("userEmail" + userEmail);
		
	}
}
