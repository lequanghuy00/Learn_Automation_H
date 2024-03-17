package automation.testsuite;

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
import automtion.page.ClientPage_Factory;
import automtion.page.LoginPageFactory;

public class Day16_Alert1 extends CommonBase {
	@BeforeMethod
	public void openGuru() throws InterruptedException
	{
		driver = initChromeDriver(CT_Common.URL_GURU);	
	}
	@Test
	public void acceptAlert()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("cusid")));
		WebElement custTextBox = driver.findElement(By.name("cusid"));
		custTextBox.sendKeys("1234");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("submit")));
		WebElement buttonSubmit = driver.findElement(By.name("submit"));
		buttonSubmit.click();
		
		//Đợi alert xác nhận có muốn xóa customer hiển thị rồi bấm vào ok
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		//Đợi alert xóa customer thành công hiển thị rồi bấm vào ok
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//td[text()='Delete Customer Form']")));
		assertTrue(driver.findElement(By.xpath("//td[text()='Delete Customer Form']")).isDisplayed());
		
		
		
	}
}
