package javascriptExecutor_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutor_Example_3 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	
		//Clicking on an element/ hidden element
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement remember_me_button =driver.findElement(By.xpath("//*[@id='RememberMe']"));
		js.executeScript("arguments[0].click()", remember_me_button);
	}

}
