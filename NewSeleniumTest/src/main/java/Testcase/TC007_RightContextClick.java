package Testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.DriverSetup;


public class TC007_RightContextClick extends DriverSetup{
	 public static String Url="https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";
	
	 @Test
	public static void doubleClickRightClick() throws InterruptedException {
		driver.get(Url);
		new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		Actions a =new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//p[contains(text(),'The multiple attribute specifies that multiple options can be selected at once:')]"));
		a.doubleClick(ele).build().perform();
		
		
		
	}

}
