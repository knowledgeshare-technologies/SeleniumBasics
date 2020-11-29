package com.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerExample2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.cleartrip.com/");
		
		String Month_to_book="December 2020";
		String day_to_book="20";
		
		driver.findElement(By.xpath("//*[@id=\"DepartDate\"]")).click();
		
		while (true)
		{
			
	
			String Month_displayed=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/span[1]")).getText();
			System.out.println("Month displayed : " + Month_displayed);
			
			String Year_displayed=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/div/span[2]")).getText();
			System.out.println("Year displayed : " + Year_displayed);
			
			String final_month_year=Month_displayed + " " +Year_displayed;
			System.out.println("Final Month and Year displayed : " + final_month_year);
		
			
			if(final_month_year.equalsIgnoreCase(Month_to_book))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/div/a")).click();
			}
		
		}
		Thread.sleep(3000);
		
		//Method - 1  -- Using Variable
		//driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr/td/a[contains(text()," + day_to_book + ")]")).click();
		
		//Method -2  --- Using List Collection 
		List<WebElement> Dates=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr/td/a"));
		for(WebElement ele:Dates)
		{
			System.out.println(ele.getText()); // Printing Dates
			if(ele.getText().equalsIgnoreCase(day_to_book))
			{
				ele.click();
			}
		}
		
		
	}

}
