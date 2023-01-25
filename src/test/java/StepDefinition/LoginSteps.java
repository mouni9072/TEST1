package StepDefinition;

import GenericUtils.DriverUtils;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	LoginPage page = new LoginPage();
	@Given("Open the Url")
	public void open_the_url() throws InterruptedException {
		DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
	}

	@When("enter valid username {string} and Password {string}")
	public void enter_valid_username_and_password(String string, String string2) {
		page.enterUsername(string);
		page.enterPassword(string2);
	}

	@When("Click Login button")
	public void click_login_button() {
		page.clickLogin();
	}

	@Then("Login Successful")
	public void login_successful() {
		System.out.println("LOGIN SUCCESSFUL");
	}


}
