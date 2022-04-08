package Testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.DriverSetup;

@Test
public class TC009_KeyboardEvent extends DriverSetup{
	
	public static String Url="http://automationpractice.com/index.php";
	
	public  static void keyboardEventCheck() throws InterruptedException {
		
		driver.get(Url);
		new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		WebElement e=driver.findElement(By.xpath("//input[@id='search_query_top']"));
		e.sendKeys(Keys.chord(Keys.SHIFT,"tedtalk"));
		Thread.sleep(3000);
		e.sendKeys(Keys.chord(Keys.ENTER));
		Thread.sleep(3000);
		
		
		
	
	
	

}
}
