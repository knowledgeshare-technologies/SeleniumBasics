package MouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents_MovetoElement_ContextClick {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://knowledgesharetechnologies.000webhostapp.com/");
		driver.manage().window().maximize();
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"ResponsiveMenu1\"]/li[6]/a"))).build().perform();
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"ResponsiveMenu1\"]/li[6]/ul/li[1]/a"))).build().perform();
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"ResponsiveMenu1\"]/li[6]/ul/li[1]/ul/li[2]/a"))).build().perform();
		Thread.sleep(3000);
		
		action.contextClick().build().perform();
		
		
	}

}
