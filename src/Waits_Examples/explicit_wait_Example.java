package Waits_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait_Example {

	public static void main(String[] args) {

		
		  System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		  WebDriver driver=new FirefoxDriver();
		 

		/*
		 * System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		 * WebDriver driver=new ChromeDriver();
		 */

		// Explicit Wait

		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("artificial intelligence");
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();

		// WebElement link_to_click=driver.findElement(By.xpath("(//*[@class='cfxYMc
		// JfZTW c4Djg MUxGbd v0nnCb'])[2]"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='cfxYMc JfZTW c4Djg MUxGbd v0nnCb'])[2]")));
		driver.findElement(By.xpath("(//*[@class='cfxYMc JfZTW c4Djg MUxGbd v0nnCb'])[2]")).click();

	}

}
