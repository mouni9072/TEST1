package Test;

import org.testng.annotations.Test;

import GenericUtils.DriverUtils;
import Pages.AddToCart;
import Pages.Admin;
import Pages.AnotherLogin;
import Pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void Login() throws InterruptedException
	{
		DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPage lp=new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickLogin();
		Admin pt=new Admin();
		pt.clickAdmin();
		pt.clickAdd();
		
		/*DriverUtils.getDriver().get("https://demowebshop.tricentis.com/login");
		LoginPage lp=new LoginPage();
		lp.enterEmail("mounika.katta2001@gmail.com");
		lp.enterPassword("Kannayy@");
		lp.clickLogin();
		Thread.sleep(5000);
		AddToCart se=new AddToCart();
		se.hoverComputer(driver);
		se.clickDesktops();
		se.SelectItem();
		se.SelectAddtocart();*/
		
		
	}

}
