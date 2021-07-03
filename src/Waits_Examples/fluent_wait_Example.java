package Waits_Examples;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class fluent_wait_Example {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("https://www.google.com/");
		//driver.findElement(By.name("qaadsa")).sendKeys("artificial intelligence");
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(20))
			       .pollingEvery(Duration.ofSeconds(5))
			       .withMessage(" Hey,Element is not found, please correct and run again ")
			       .ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("qaadsa"))).sendKeys("artifical Intelligence");
		
	}

}
