package Testcase;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.DriverSetup;


public class TC005_Refresh extends DriverSetup{
	
	public static String Url="https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";
	
	@Test
	public static void refreshPage() {
		
		driver.get(Url);
		new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
