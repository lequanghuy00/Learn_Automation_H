package automation.testsuite;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Common;

public class Day17_btvn1 extends CommonBase {
	@BeforeMethod
	public void openGuru99() throws InterruptedException
	{
		driver = initChromeDriver(CT_Common.URL_DMHungAnh);	
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
	public void iframechat() throws InterruptedException
	{
		Thread.sleep(20000);
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//div[@class='_a2zm']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Đăng nhập']")).isDisplayed());
	}
}
