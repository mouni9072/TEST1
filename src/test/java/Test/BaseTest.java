package Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import GenericUtils.DriverUtils;

public class BaseTest {
	WebDriver driver;
	@BeforeMethod
	
	public void setUp() throws FileNotFoundException, IOException
	{
		DriverUtils.createDriver();
	}
}
