package javascriptExecutor_Examples;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutor_Async_Example
{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.google.com");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		long start_time=System.currentTimeMillis();
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		
		LocalDateTime now_start=LocalDateTime.now();
		System.out.println("Start time : " + now_start);
		
		// Waiting for 5 seconds using Javascript
		js.executeAsyncScript("window.setTimeout(arguments[arguments.length-1], 5000);");
		
		long end_time=System.currentTimeMillis();
		LocalDateTime now_end=LocalDateTime.now();
		System.out.println("End time : " + now_end);
		
		System.out.println("Passed time : " +  (end_time - start_time) );

	}

}
