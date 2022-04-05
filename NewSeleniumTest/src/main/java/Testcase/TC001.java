package Testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.DriverSetup;

public class TC001 extends DriverSetup{
	
	static String Url="https://rahulshettyacademy.com/locatorspractice/";
	
	@Test
	public void TestCase() throws InterruptedException {
		
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("inputUsername")).sendKeys("ytr");
		driver.findElement(By.name("inputPassword")).sendKeys("123ert");
		
		driver.findElement(By.name("chkboxTwo")).click();
		
		driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Taba");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("taba@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("01973434567");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		String password = getPassword(driver);
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("Taba");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		Thread.sleep(2000);
		
		driver.findElement(By.name("chkboxOne")).click();
		
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(5000);
		
		/*driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Taba");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("taba@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("01973434567");
		Thread.sleep(2000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		Thread.sleep(2000);*/
		
		
		


		
		
		
		
	}
public static  String getPassword(WebDriver driver) throws InterruptedException {
		driver.get(Url);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		/*WebElement ele=driver.findElement(By.cssSelector(".reset-pwd-btn"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("argument[0].click()",ele);*/
		String passText=driver.findElement(By.cssSelector("form p")).getText();
	    System.out.println(passText);
		String [] passArray=passText.split("'");
		String pass=passArray[1].split("'")[0];
		
		return pass;
		
	}

	
	

}
