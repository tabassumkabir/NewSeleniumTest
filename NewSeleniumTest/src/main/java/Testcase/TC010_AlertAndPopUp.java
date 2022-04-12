package Testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.DriverSetup;



public class TC010_AlertAndPopUp extends DriverSetup {
	
	public static String Url="https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert";
	
	@Test
	public static void alertHandlingCheck() throws InterruptedException {
		
		driver.get(Url);
		new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement e=driver.findElement(By.name("iframeResult"));
		driver.switchTo().frame(e);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		
		
		
	}

}
