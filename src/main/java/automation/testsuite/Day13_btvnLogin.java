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
import automation.constant.Locator;
import automtion.page.*;

public class Day13_btvnLogin extends CommonBase

{
	@BeforeMethod
	public void openChrome() throws InterruptedException
	{
		driver = initChromeDriver(CT_Common.URL_rise_d13);
		
	}
	@Test //Login success
	public void LoginSuccessfully() throws InterruptedException
	{
		Login_Page Login = new Login_Page(driver);
		Login.LoginFunction("client@demo.com","riseDemo");
		Thread.sleep(4000);
		assertTrue(driver.findElement(By.xpath(Locator.TEXT_DASHBOARD)).isDisplayed());
		Login.LogoutFunction();
	}
	@Test //Login fail email is incorrect
	public void Loginfail1() throws InterruptedException
	{
		Login_Page Login = new Login_Page(driver);
		Login.LoginFunction("client@demo.commmm","riseDemo");
		Thread.sleep(4000);
		assertTrue(driver.findElement(By.xpath(Locator.ERROR_AU)).isDisplayed());				
	}
	@Test //Login fail pass is incorrect
	public void Loginfail2() throws InterruptedException
	{
		Login_Page Login = new Login_Page(driver);
		Login.LoginFunction("client@demo.commmm","riseDemoooo");
		Thread.sleep(4000);
		assertTrue(driver.findElement(By.xpath(Locator.ERROR_AU)).isDisplayed());				
	}
	@Test //Login fail email is incorrect format
	public void Loginfail3() throws InterruptedException
	{
		Login_Page Login = new Login_Page(driver);
		Login.LoginFunction("client@demo..com","riseDemo");
		Thread.sleep(4000);
		assertTrue(driver.findElement(By.xpath(Locator.ERROR_MES)).isDisplayed());				
	}
}
