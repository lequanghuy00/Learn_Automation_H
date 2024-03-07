package automtion.page;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import automation.constant.Locator;

public class Login_Page 
{
	private WebDriver driver;
	
	public Login_Page (WebDriver commonDriver)
	{
		this.driver=commonDriver;
	}
	
	public void LoginFunction (String email, String pass)
	{
		WebElement txt_Email = driver.findElement(By.xpath(Locator.ELEMENT_USER_TEXTBOX));
		if (txt_Email.isDisplayed()) {
			txt_Email.clear();
			txt_Email.sendKeys(email);
		}
		WebElement txt_Pass = driver.findElement(By.xpath(Locator.ELEMENT_PASSWORD_TEXTBOX));
		if (txt_Pass.isDisplayed()) {
			txt_Pass.clear();
			txt_Pass.sendKeys(pass);
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement btn_Submit = driver.findElement(By.xpath(Locator.ELEMENT_LOGIN_BTN));
		if (btn_Submit.isDisplayed()) 
		{
			btn_Submit.click();
		}
	}
	public void LogoutFunction ()
	{
		WebElement btn_User = driver.findElement(By.xpath(Locator.ELEMENT_USER_BTN));
		if (btn_User.isDisplayed()) 
		{
			btn_User.click();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement btn_Logout = driver.findElement(By.xpath(Locator.ELEMENT_LOGOUT_BTN));
		if (btn_Logout.isDisplayed()) 
		{
			btn_Logout.click();
		}
	}
}
	



