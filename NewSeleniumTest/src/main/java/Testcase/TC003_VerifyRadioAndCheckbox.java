package Testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Base.DriverSetup;

@Test
public class TC003_VerifyRadioAndCheckbox extends DriverSetup{
	
	public static String Url="https://jqueryui.com/checkboxradio/";
	public static void CheckboxAndRadioButtonInframe() throws InterruptedException {
		driver.get(Url);
		new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//body/div[1]/fieldset[1]/label[3]")).click();
		driver.findElement(By.xpath("//body/div[1]/fieldset[2]/label[4]")).click();
		
	}

}
