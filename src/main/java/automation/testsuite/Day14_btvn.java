package automation.testsuite;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Common;
import automation.constant.Locator;
import automtion.page.*;

public class Day14_btvn extends CommonBase {
	@BeforeMethod
	public void openChrome() throws InterruptedException
	{
		driver = initChromeDriver(CT_Common.URL_Alada);		
	}
	
	@Test // Đăng ký thành công
	public void Registersuccess() throws InterruptedException
	{
		Thread.sleep(4000);
		PageAlada_day14 Reg = new PageAlada_day14(driver);
		Reg.RegisterFunction("huylllee","huyllleeee@gmail.com","huyllleeee@gmail.com","12345678","12345678","0922222222");
		Thread.sleep(4000);
		assertTrue(driver.findElement(By.xpath("//span[text()='NỔI BẬT']")).isDisplayed());
	}
	
	@Test // Đăng nhập thành công
	public void Loginsuccess() throws InterruptedException
	{
		Thread.sleep(4000);
		PageAlada_day14 login = new PageAlada_day14(driver);
		login.LoginFunction("day14@gmail.com", "12345678");
		Thread.sleep(4000);
		assertTrue(driver.findElement(By.xpath("//span[text()='NỔI BẬT']")).isDisplayed());
	}
	
	@Test // Change password
	public void changepassword() throws InterruptedException
	{
		Thread.sleep(4000);
		PageAlada_day14 changepass = new PageAlada_day14(driver);
		changepass.LoginFunction("day14@gmail.com", "12345678");
		Thread.sleep(4000);
		assertTrue(driver.findElement(By.xpath("//span[text()='NỔI BẬT']")).isDisplayed());
		Thread.sleep(4000);
		changepass.ChangePasswordFunction("12345678","123456789","123456789");
		
	}
	@AfterMethod
	public void closeDriver()
	{
		driver.close();
	}
}
