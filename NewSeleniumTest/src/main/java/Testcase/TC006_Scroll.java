package Testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.DriverSetup;

@Test
public class TC006_Scroll extends DriverSetup{
	
	public static String Url="https://www.seleniumhq.org";
	
	public static void scrollCheck() throws InterruptedException {
		
		driver.get(Url);
		new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		
		
		
	}

}
