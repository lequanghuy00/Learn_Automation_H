package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Common;

public class Day7_Practice extends CommonBase {
	@BeforeMethod
	public void openChrome() throws InterruptedException
	{
		driver = initChromeDriver(CT_Common.URL);
	}
	
	@AfterClass
	public void closeChrome()
	{
		driver.close();
	}
	
	@Test
	public void praticeSelector()
	{
		WebElement bepTu = driver.findElement(By.linkText("Bếp Từ"));
		System.out.println("bếp từ");
		WebElement hutMui = driver.findElement(By.partialLinkText("hút mùi"));
		System.out.println("hút mùi");
	}

}
