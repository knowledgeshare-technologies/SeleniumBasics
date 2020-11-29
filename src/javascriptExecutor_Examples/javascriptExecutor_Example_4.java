package javascriptExecutor_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutor_Example_4 
{
	public static void main(String args[]) throws InterruptedException
	{
				System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.navigate().to("http://google.com/");
				driver.manage().window().maximize();
				JavascriptExecutor js=(JavascriptExecutor)driver;
				
				//1. Launching New Page
				js.executeScript("window.location='http://gmail.com/' ");
				
				Thread.sleep(3000);
				//2. Scroll using pixels
				//js.executeScript("window.scrollBy(0,1000)");
				
				//3. Scrolling till the bottom of the page
				//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");		
				
				//4. Scrolling till the element is found
				WebElement create_an_account_Bottom =driver.findElement(By.xpath("//*[@class='h-c-button h-c-button--primary started__cta--desktop']"));
				js.executeScript("arguments[0].scrollIntoView();", create_an_account_Bottom);
				
				create_an_account_Bottom.click();
				
	}
	
}
