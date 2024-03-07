package automation.constant;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locator {
	public static String ELEMENT_USER_TEXTBOX = "//input[@id='email']";
	public static String ELEMENT_PASSWORD_TEXTBOX = "//input[@id='password']";
	public static String ELEMENT_LOGIN_BTN = "//button[text()='Sign in']";
	public static String ELEMENT_USER_BTN = "//a[@id='user-dropdown']";
	public static String ELEMENT_LOGOUT_BTN = "//a[@href='https://rise.fairsketch.com/signin/sign_out']";
	public static String TEXT_DASHBOARD = "//span[text()='Dashboard']";
	public static String ERROR_AU = "//div[@class='alert alert-danger']";
	public static String ERROR_MES = "//span[text()='Please enter a valid email address.']";

}
