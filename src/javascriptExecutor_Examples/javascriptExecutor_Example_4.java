package javascriptExecutor_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutor_Example_4 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		// Launching New Page
		js.executeScript(" window.location='http://www.gmail.com/' ");
		
		// Scrolling using pixel size
		//js.executeScript("window.scrollBy(0,1000) ");
		
		//Scrolling till the bottom of the page
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		// Scrolling till the element is found
		WebElement create_an_Account_bottom_button =driver.findElement(By.xpath("//*[@class='h-c-button h-c-button--primary started__cta--desktop']"));
		
		js.executeScript("arguments[0].scrollIntoView();", create_an_Account_bottom_button);
		create_an_Account_bottom_button.click();
		
	}

}
