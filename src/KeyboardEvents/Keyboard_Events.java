package KeyboardEvents;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Events {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://knowledgesharetechnologies.000webhostapp.com/");
		
		driver.manage().window().maximize();
		
		/*
		 * //Example - 1 Actions action=new Actions(driver);
		 * action.moveToElement(driver.findElement(By.xpath(
		 * "//*[@id=\"ResponsiveMenu1\"]/li[7]/a"))).build().perform();
		 * Thread.sleep(5000); action.moveToElement(driver.findElement(By.xpath(
		 * "//*[@id=\"ResponsiveMenu1\"]/li[7]/ul/li[4]/a"))).build().perform();
		 * Thread.sleep(5000);
		 */
		
		//Example - 2
		Actions action_1=new  Actions(driver);
		action_1.moveToElement(driver.findElement(By.xpath("//*[@id=\"ResponsiveMenu1\"]/li[6]/a"))).build().perform();
		Thread.sleep(5000);
		action_1.moveToElement(driver.findElement(By.xpath("//*[@id=\"ResponsiveMenu1\"]/li[6]/ul/li[1]/a"))).build().perform();
		Thread.sleep(5000);
		action_1.moveToElement(driver.findElement(By.xpath("//*[@id=\"ResponsiveMenu1\"]/li[6]/ul/li[1]/ul/li[2]/a"))).build().perform();
		Thread.sleep(5000);
		
		//Right Click Example
		action_1.contextClick().build().perform();
	}

}
