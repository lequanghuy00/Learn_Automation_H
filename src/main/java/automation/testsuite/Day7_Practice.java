package automation.testsuite;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automation.common.CommonBase;
import automation.constant.CT_Common;

public class Day7_Practice extends CommonBase {
	@BeforeMethod
	public void openChrome() throws InterruptedException
	{
		driver = initChromeDriver(CT_Common.URL);
	}
	
	@AfterClass
	public void closeChrome()
	{
		driver.close();
	}
	
	@Test
	public void testBepAnToan()
	{
		System.out.print("Test web bep an toan");
	}

}
