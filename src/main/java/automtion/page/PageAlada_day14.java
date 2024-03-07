package automtion.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class PageAlada_day14 {
	private WebDriver driver;
	
	@FindBy(xpath ="//a[@href='https://alada.vn/tai-khoan/dang-nhap.html']") WebElement btnDangnhap;
	@FindBy(xpath ="//a[@href='https://alada.vn/tai-khoan/dang-ky.html']") WebElement btnDangky;	
	//Xpath page dang ky
	
	@FindBy(xpath ="//input[@id='txtFirstname']") WebElement txtName;
	@FindBy(xpath ="//input[@id='txtEmail']") WebElement txtEmail;
	@FindBy(xpath ="//input[@id='txtCEmail']") WebElement txtREmail;
	@FindBy(xpath ="//input[@id='txtPassword']") WebElement txtPass;
	@FindBy(xpath ="//input[@id='txtCPassword']") WebElement txtRPass;
	@FindBy(xpath ="//input[@id='txtPhone']") WebElement txtPhone;
	@FindBy(xpath ="//button[text()='ĐĂNG KÝ' and @class='btn_pink_sm fs16']") WebElement btnDK;
	
	//Xpath page dang nhap
	@FindBy(xpath ="//input[@id='txtLoginUsername']") WebElement txtUsername;
	@FindBy(xpath ="//input[@id='txtLoginPassword']") WebElement txtPassword;
	@FindBy(xpath ="//button[@class='btn btn-lg btn_pink fs18 fleft w100per pass btn_submit']") WebElement btnLogin;
	
	
	//Xpath page chỉnh sửa thông tin
	@FindBy(xpath= "//div[@class='avatar2']") WebElement btnavatar;
	@FindBy(xpath= "//a[@class='fs14']") WebElement btnchinhsua;
	@FindBy(xpath= "//input[@placeholder='Mật khẩu hiện tại']") WebElement txtmkhientai;
	@FindBy(xpath= "//input[@placeholder='Mật khẩu mới']") WebElement txtmkhmoi;
	@FindBy(xpath= "//input[@placeholder='Nhập lại mật khẩu mới']") WebElement txtnhapmkmoi;
	@FindBy(xpath= "//button[text()='Lưu mật khẩu mới']") WebElement btnSave;
	
	public PageAlada_day14(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void LoginFunction (String email, String pass)
	{
		btnDangnhap.click();
		txtUsername.clear();
		txtUsername.sendKeys(email);
		
		txtPassword.clear();
		txtPassword.sendKeys(pass);
		
		btnLogin.click();
	}
	
	public void RegisterFunction (String name, String mail, String rmail, String pass, String rpass, String phone)
	{
		btnDangky.click();
		
		txtName.clear();
		txtName.sendKeys(name);
		
		txtEmail.clear();
		txtEmail.sendKeys(mail);
		
		txtREmail.clear();
		txtREmail.sendKeys(rmail);
		
		txtPass.clear();
		txtPass.sendKeys(pass);
		
		txtRPass.clear();
		txtRPass.sendKeys(rpass);
		
		txtPhone.clear();
		txtPhone.sendKeys(phone);
		
		btnDK.click();
	}
	
	public void ChangePasswordFunction (String pass, String newpass, String rnewpass)
	{
		btnavatar.click();
		btnchinhsua.click();
		
		txtmkhientai.clear();
		txtmkhientai.sendKeys(pass);
		
		txtmkhmoi.clear();
		txtmkhmoi.sendKeys(newpass);
		
		txtnhapmkmoi.clear();
		txtnhapmkmoi.sendKeys(rnewpass);
		
		btnSave.click();
	}
}
