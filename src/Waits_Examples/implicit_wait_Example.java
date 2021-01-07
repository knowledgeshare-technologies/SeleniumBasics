package Waits_Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class implicit_wait_Example {

	public static void main(String[] args) 
	{
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * ".\\drivers\\chromedriver.exe"); WebDriver driver=new ChromeDriver();
		 */
			
			System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			//Implicit wait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://www.google.com/");
			driver.findElement(By.name("q")).sendKeys("artificial intelligence");
			Actions actions=new Actions(driver);
			actions.sendKeys(Keys.ENTER).build().perform();
			
			driver.findElement(By.xpath("(//*[@class='cfxYMc JfZTW c4Djg MUxGbd v0nnCb'])[2]")).click();

	}

}
