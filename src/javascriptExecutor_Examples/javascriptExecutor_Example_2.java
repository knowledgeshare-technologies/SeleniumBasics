package javascriptExecutor_Examples;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutor_Example_2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Generating Manual Alert
		//js.executeScript(" alert('This is Google Page Manual Alert'); ");
		
		//Generating Manual Prompts
		js.executeScript("prompt('This is Google Page Manual Prompt'); ");
	}

}
