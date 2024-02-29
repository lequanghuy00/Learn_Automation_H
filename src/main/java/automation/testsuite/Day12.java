package automation.testsuite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Common;

public class Day12 extends CommonBase

{
	@BeforeMethod
	public void openChrome() throws InterruptedException
	{
		driver = initChromeDriver("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		
	}
	@Test
	public void multiplecheckbox()
	{
		List<WebElement> Listcheckbox = driver.findElements(By.xpath("//div[@class='checkbox']/label/child::input"));
		for (int i = 0; i < Listcheckbox.size(); i++)
		{
			WebElement checkbox = Listcheckbox.get(i);
			if (checkbox.isSelected() == true)
			{
				System.out.println("checkbox o vi tri" + (i+1) + "da duoc check");
			}
			else {
				checkbox.click();
			}
		}
		
	}
}
