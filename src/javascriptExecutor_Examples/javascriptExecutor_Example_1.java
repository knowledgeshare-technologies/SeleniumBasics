package javascriptExecutor_Examples;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutor_Example_1 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		// Getting Page Title
		String page_Title=js.executeScript("return document.title;").toString();
		System.out.println("Page title : " + page_Title);
		// Getting Page URL
		String page_URL =js.executeScript("return document.URL;").toString();
		System.out.println("Page URL : " + page_URL);
		
	}
}
