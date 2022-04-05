package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetup {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setDriver ()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@AfterSuite
	public  void close() {
		driver.close();
	}

}
