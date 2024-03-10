package automtion.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage_Factory {
	private WebDriver driver;
	@FindBy(xpath ="//span[text()='Clients']") WebElement clientMenu;
	@FindBy(xpath ="//a[@title='Add client']") WebElement btnAddClient;
	@FindBy(id ="type_person") WebElement radioPerson;
	@FindBy(id ="company_name") WebElement textboxCompany;
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
		btnAddClient.click();
		Thread.sleep(3000);
		radioPerson.click();
		textboxCompany.sendKeys(company);
		if(checkboxOnlinePayment.isDisplayed() == true && checkboxOnlinePayment.isSelected() == false)
		{
			checkboxOnlinePayment.click();
		}
		btnSave.click();
		Thread.sleep(3000);
		clientTab.click();
		Thread.sleep(3000);
		textboxSearch.sendKeys(company);
		
	}
}
