package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Admin extends BasePage {
	@FindBy(xpath="//input[@name='username']")
	private WebElement textUsername;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement textPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnClick;
	
	@FindBy(xpath="//a[@href='/web/index.php/admin/viewAdminModule']")
	private WebElement AdminClick;
	
	@FindBy(xpath="(//button[@type='button'])[4]")
	private WebElement AddClick;
	
	@FindBy(xpath="//div[text()='Admin']")
	private WebElement AdminSelect;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement textTypeforhints;
	
	@FindBy(xpath="//div[text()='Enabled']")
	private WebElement StatusSelect;
	
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active']")
	private WebElement textUsername1;
	
	@FindBy(xpath="//input[@class='password']")
	private WebElement textPassowrd1;
	
	@FindBy(xpath="//input[@class='password']")
	private WebElement textconfirmPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement SaveClick;
	
	public void clickAdmin() {
		AdminClick.click();
	}
	public void clickAdd() {
		AddClick.click();
	}
	public void enterUsername(String str)
	{
		textUsername.sendKeys(str);
	}
	public void enterPassword(String str)
	{
		textPassword.sendKeys(str);
	}
	public void clickLogin()
	{
		btnClick.click();
	}
	

}
