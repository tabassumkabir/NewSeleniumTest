package Testcase;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.DriverSetup;

public class TC002_VerifyPageTitle extends DriverSetup{
	
	public static String Url="http://automationpractice.com/index.php";
	
	@Test(priority=1)
	public static void verifyTitle() {
		driver.get(Url);
		new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("The page title is ="+title);
		
		
	}
	
	@Test
	public static void IsWebsiteSafe() {
		
		String y=driver.getCurrentUrl();	
		if(y.contains("https")) {
			System.out.println("Secured");
		}
		else {
			System.out.println("Not secured");
		}

}
}
