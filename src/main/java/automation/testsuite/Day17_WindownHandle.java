package automation.testsuite;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Common;

public class Day17_WindownHandle extends CommonBase {
	@BeforeMethod
	public void openGuru99() throws InterruptedException
	{
		driver = initChromeDriver(CT_Common.URL_GURU2);	
	}
	@Test
	public void handleWindownPopup()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		By clickHereBtn = By.xpath("//a[text()='Click Here']");
		click(clickHereBtn);
		
		//Lấy ra windown chính 
		String mainWindown = driver.getWindowHandle();
		// Lấy ra các windown đang được  mở
		Set<String> allWindowns = driver.getWindowHandles();
		// Duyệt qua các windown trong all windown để nhập email và click button submit
		for(String windown:allWindowns)
		{
			if(!windown.equals(mainWindown))
			{
				driver.switchTo().window(windown);
				driver.findElement(By.name("emailid")).sendKeys("huylq@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Access details to demo site.']")).isDisplayed());
				System.out.println(driver.getCurrentUrl()); //print url của windown
				System.out.println(driver.getTitle()); //print title của winsown
				driver.close();
			}
		}
		//hết for thì chuyển về main window để test tiếp các tính năng khác
		driver.switchTo().window(mainWindown);
		
		
	}
}
