package Testcase;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.DriverSetup;

public class TC004_VerifyDropDown extends DriverSetup{
	
	public static String Url="https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";
	
	@Test
	public static void DropDown() {
		
		driver.get(Url);
		new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		WebElement e =driver.findElement(By.name("cars"));
		Select s=new Select(e);
		Actions a =new Actions(driver);
		a.keyDown(Keys.CONTROL).click(s.getOptions().get(3)).click(s.getOptions().get(1)).keyUp(Keys.CONTROL).build().perform();
		s.selectByIndex(1);
		
		
	}

}
