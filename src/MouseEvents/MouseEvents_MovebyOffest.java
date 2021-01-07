package MouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents_MovebyOffest 
{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://knowledgesharetechnologies.000webhostapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		

		WebElement source=driver.findElement(By.xpath("//*[@id=\"ResponsiveMenu1\"]/li[6]/a"));
		int x=source.getLocation().getX();
		int y=source.getLocation().getY();
		System.out.println("X cord : " + x);
		System.out.println("Y cord : " + y);
		
		Actions action=new Actions(driver);
		action.moveByOffset(x, y).build().perform();
		Thread.sleep(3000);		
		
		
	}

}
