package automation.testsuite;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Common;

public class Day16_Alert2 extends CommonBase {
	@BeforeMethod
	public void openGuru() throws InterruptedException
	{
		driver = initChromeDriver("https://demo.automationtesting.in/Alerts.html");	
	}
	@Test
	public void acceptAlert()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Alert with Textbox ']")));
		WebElement buttonAlertWithTextbox = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		wait.until(ExpectedConditions.elementToBeClickable(buttonAlertWithTextbox));
		buttonAlertWithTextbox.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='Textbox']/child::button")));
		WebElement buttonOpenAlert = driver.findElement(By.xpath("//div[@id='Textbox']/child::button"));
		wait.until(ExpectedConditions.elementToBeClickable(buttonOpenAlert));
		buttonOpenAlert.click();
		
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().sendKeys("hulq");
		driver.switchTo().alert().accept();
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("demo1")));
		WebElement outputElement = driver.findElement(By.id("demo1"));
		assertTrue(outputElement.isDisplayed());
		
		String text = outputElement.getText();
		assertEquals("Hello huylq How are you today",text);
		
		
	}
}
