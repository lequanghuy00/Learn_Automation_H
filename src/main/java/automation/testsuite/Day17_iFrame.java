package automation.testsuite;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Common;

public class Day17_iFrame extends CommonBase {
	@BeforeMethod
	public void openGuru99() throws InterruptedException
	{
		driver = initChromeDriver(CT_Common.URL_CodeStar);	
	}
	public void findiFrame_Index() throws InterruptedException
	{
		Thread.sleep(10000);
		int totalIframe = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Tổng số iframe:" +totalIframe);
		for (int i=0; i< totalIframe; i++)
		{
			driver.switchTo().frame(i);
			// Tìm phần tử đại điện trên iframe cần test là button có text = Gửi ngay
			int soLuongPhanTuDaiien = driver.findElements(By.xpath("//button[text()='Gửi ngay']")).size();
			if(soLuongPhanTuDaiien>0)
			{
				System.out.println("iFrame cần tìm là ở vị trí thứ " +(i+1));
			}
			driver.switchTo().defaultContent();
		}
	}
	@Test
	public void case_DangKyKhongThanhCong_ThieuEmail()throws InterruptedException
	{
		Thread.sleep(10000);
		By textCanScroll = By.xpath("//h2[contains(text(),'Đăng kí nhận tư vấn lộ trình')]");
		scrollToElement(textCanScroll);
		driver.switchTo().frame(1);
		driver.findElement(By.id("account_phone")).sendKeys("0911111111");
		driver.findElement(By.xpath("//button[text()='Gửi ngay']")).click();
		Assert.assertTrue(driver.findElement(By.id("account_phone")).isDisplayed());
	}
}
