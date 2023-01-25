package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AddToCart {
	
	@FindBy(xpath="(//a[contains(text(),'Computers')])[1]")
	private WebElement HoverComputers;
	
	public void hoverComputer(WebDriver driver) {
		Actions sct=new Actions(driver);
		sct.moveToElement(HoverComputers).perform();
		}
	
	@FindBy(xpath="(//a[contains(text(),'Desktops')])[1]")
	private WebElement DesktopsClick;
	
	public void clickDesktops() {
		DesktopsClick.click();
		}
	
	@FindBy(xpath="//a[text()='Simple Computer']")
	private WebElement ItemSelect;
	
	public void SelectItem() {
		ItemSelect.click();
		}
	
	@FindBy(xpath="//input[@class='button-1 add-to-cart-button']")
	private WebElement AddtocartClick;
	
	public void SelectAddtocart() {
		AddtocartClick.click();
		}
}
