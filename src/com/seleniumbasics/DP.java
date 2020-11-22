package com.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DP 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.navigate().to("http://the-internet.herokuapp.com/tables");
		
		
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement departonbox=driver.findElement(By.id("DepartDate"));// storing depart box in to webelement variable
		Actions action =new Actions(driver); // Action class, to perform mouse actions
		action.moveToElement(departonbox).build().perform(); // Point mouse to depart text box
		departonbox.click(); // click on depart text box
		Thread.sleep(5000);
		
		//div[@id='ui-datepicker-div']/div[1]/table/tbody//td
		
		// Storing all the dates
		// First Block
		/*List<WebElement> dates=driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/div[1]/table/tbody//td"));*/
		//Second Block
		List<WebElement> dates=driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/div[2]/table/tbody//td"));
		
		// Storing the count of dates
		int datescount=dates.size();
		//Printing the count
		System.out.println(" Count of dates are : "+datescount );
		int i;
		// Iterating through all the dates to click on my required date
		for(i=1;i<datescount;i++)
		{
			String date=dates.get(i).getText(); // Getting the value of the date
			//System.out.println("i Value is :"+i+"date value is "+date);
			if(date.equals("15")) // Provide my required date and comparing with the current date value
			{
				dates.get(i).click(); // Clicking on my required date
				System.out.println("Date selected");
				break; // Breaking the for loop inorder to make not to iterate to other values when my required date is found
			}
		}	}

}
