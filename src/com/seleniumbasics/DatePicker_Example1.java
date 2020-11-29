package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker_Example1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://phptravels.net/home");
		driver.manage().window().maximize();
		
		String Month_to_book="December,";
		String day_to_book ="20";
		
		driver.findElement(By.xpath("//*[@id=\"checkin\"]")).click();
		
		/* Finding the Month */
		while(true)
		{
				String month_displayed=driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/nav/div[2]")).getText();
				System.out.println("Month dsiplayed is : " + month_displayed);
				
				if(month_displayed.contains(Month_to_book))
				{
					break;
				}
				else
				{
					driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/nav/div[3]")).click();
					Thread.sleep(3000);
				}
		}	
		
		/* Clicking on desired Date */
		
		driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/div/div/div/div[contains(text()," + day_to_book + ")]")).click();		
	}

}
