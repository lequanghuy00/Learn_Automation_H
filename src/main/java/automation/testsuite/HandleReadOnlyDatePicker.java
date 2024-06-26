package automation.testsuite;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import automation.common.CommonBase;
import automation.constant.CT_Common;
import automtion.page.ClientPage_Factory;
import automtion.page.LoginPageFactory;
public class HandleReadOnlyDatePicker extends CommonBase {
	
	@BeforeMethod
	public void openChrome() throws InterruptedException
	{
		driver = initChromeDriver(CT_Common.URL_TECH);	
	}
	@Test
	public void HandleDatePicker()
	{
		WebElement datePicker = driver.findElement(By.xpath("//label[text()='Departing']/following-sibling::div/input[@name='daterange-single'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript( "arguments[0].removeAttribute('readonly','readonly')",datePicker);
		datePicker.clear();
		datePicker.sendKeys("01042024");
		datePicker.sendKeys(Keys.TAB);
	}    
}
