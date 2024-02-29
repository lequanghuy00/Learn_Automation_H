package automation.testsuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Common;

public class Day12_btvn extends CommonBase

{
	@BeforeMethod
	public void openChrome() throws InterruptedException
	{
		driver = initChromeDriver(CT_Common.URL_btvnd12);
		
	}
	@Test
	public void btvn12() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement txt_name = driver.findElement(By.xpath("//input[@name='first_name']"));
		txt_name.sendKeys("huylq");
		WebElement Drop_state = driver.findElement(By.xpath("//option[text()='Alaska']"));
		Drop_state.click();
		System.out.println("slect Alaska");
		WebElement Rdo_yes = driver.findElement(By.xpath("//input[@value='yes']"));
		if( Rdo_yes.isSelected() == true && Rdo_yes.isSelected() == false)
		{
			Rdo_yes.click();
		}
		else
		{
			WebElement Rdo_no = driver.findElement(By.xpath("//input[@value='no']"));
			Rdo_no.click();
		}
	}
}
