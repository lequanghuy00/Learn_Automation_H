package automtion.page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import automation.common.*;
public class ClientPage_Factory {
	private WebDriver driver;
	@FindBy(xpath ="//span[text()='Clients']") WebElement clientMenu;
	@FindBy(xpath ="//a[@title='Add client']") WebElement btnAddClient;
	@FindBy(xpath ="//input[@id='type_person']") WebElement radioPerson;
	@FindBy(xpath ="//input[@id='company_name']") WebElement textboxCompany;
	@FindBy(id ="disable_online_payment") WebElement checkboxOnlinePayment;
	@FindBy(xpath ="//button[text()=' Save']") WebElement btnSave;
	
	@FindBy(xpath ="//a[text()='Clients']") WebElement clientTab;
	@FindBy(xpath ="//input[@type='search'and @placeholder='Search']") WebElement textboxSearch;
	

	public ClientPage_Factory (WebDriver commonDriver) 
	{
		this.driver = commonDriver;
		PageFactory.initElements(commonDriver, this);	
	}
	
	public void AddClient (String company) throws InterruptedException
	{
		clientMenu.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", btnAddClient);
		//btnAddClient.click();
		Thread.sleep(2000);
		radioPerson.click();
		textboxCompany.sendKeys(company);
		if(checkboxOnlinePayment.isDisplayed() == true && checkboxOnlinePayment.isSelected() == false)
		{
			checkboxOnlinePayment.click();
		}
		Thread.sleep(3000);
		btnSave.click();
		Thread.sleep(3000);
		if(!company.equals(""))
		{
			clientTab.click();
			Thread.sleep(3000);
			textboxSearch.sendKeys(company);
		}
		else return;
	}
}
