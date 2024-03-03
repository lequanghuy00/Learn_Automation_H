package automation.testsuite;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Common;
import pageLocator.Login;

public class Day13_btvnLogin extends CommonBase

{
	@BeforeMethod
	public void openChrome() throws InterruptedException
	{
		driver = initChromeDriver(CT_Common.URL_rise_d13);
		
	}
	@Test
	public void LoginSuccessfully() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement txt_Email = driver.findElement(By.xpath(Login.ELEMENT_USER_TEXTBOX));
		if (txt_Email.isDisplayed()) {
			txt_Email.clear();
			txt_Email.sendKeys("admin@demo.com");
		}
		WebElement txt_Pass = driver.findElement(By.xpath(Login.ELEMENT_PASSWORD_TEXTBOX));
		if (txt_Pass.isDisplayed()) {
			txt_Pass.clear();
			txt_Pass.sendKeys("riseDemo");
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement btn_Submit = driver.findElement(By.xpath(Login.ELEMENT_LOGIN_BTN));
		if (btn_Submit.isDisplayed()) 
		{
			btn_Submit.click();
		}
		assertTrue(driver.findElement(By.xpath("//ul[@id='sidebar-menu']/descendant::span[text()='Dashboard']")).isDisplayed());
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		WebElement profile = driver.findElement(By.xpath("//a[@id='user-dropdown']"));
//		profile.click();
//		WebElement btn_Logout = driver.findElement(By.xpath("//a[@href='https://rise.fairsketch.com/signin/sign_out']"));
//		if (btn_Logout.isDisplayed()) 
//		{
//			btn_Logout.click();
//		}
	}
	@Test
	public void Loginfail() throws InterruptedException
	{
		WebElement txt_Email = driver.findElement(By.xpath(Login.ELEMENT_USER_TEXTBOX));
		if (txt_Email.isDisplayed()) {
			txt_Email.clear();
			txt_Email.sendKeys("admin@demo.commmmmm");
		}
		Thread.sleep(3000);
		WebElement txt_Pass = driver.findElement(By.xpath(Login.ELEMENT_PASSWORD_TEXTBOX));
		if (txt_Pass.isDisplayed()) {
			txt_Pass.clear();
			txt_Pass.sendKeys("riseDemo");
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement btn_Submit = driver.findElement(By.xpath(Login.ELEMENT_LOGIN_BTN));
		if (btn_Submit.isDisplayed()) 
		{
			btn_Submit.click();
		}
		assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).isDisplayed());
				
	}
}
