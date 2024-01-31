package automation.common;
import org.openqa.selenium.By;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class CommonBase {
	public WebDriver driver;
	
	public WebDriver initChromeDriver(String URL) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get(URL);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		//Thread.sleep(10000);
		return driver;
	}
}
