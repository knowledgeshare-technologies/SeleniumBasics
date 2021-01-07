package javascriptExecutor_Examples;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutor_Async_Example {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		driver.manage().window().maximize();
		
		long start_time=System.currentTimeMillis();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Waiting for 5 seconds using JavaScript
		js.executeAsyncScript(" window.setTimeout(arguments[arguments.length-1],5000); ");
		
		long end_time=System.currentTimeMillis();
		
		System.out.println("Passed time : " + (end_time-start_time) );
	}	

}
