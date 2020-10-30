package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElement_example
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","E:\\Selenium + Java - Youtube\\Selenium\\Libraries\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://demowebshop.tricentis.com/register");
		
		WebElement first_name=driver.findElement(By.id("FirstName"));
		WebElement last_name=driver.findElement(By.id("LastName"));
		WebElement email_id=driver.findElement(By.name("Email"));
		WebElement password=driver.findElement(By.id("Password"));
		WebElement confirm_password=driver.findElement(By.id("ConfirmPassword"));
		
			Boolean check_first_name_element_presence =first_name.isDisplayed();
					
			System.out.println("First name present ? :" + check_first_name_element_presence );
			
			String getattribute_last_name=last_name.getAttribute("data-val-required");
			
			System.out.println("get attribute example : "  + getattribute_last_name);
			if(getattribute_last_name.equalsIgnoreCase("Last name is required."))
			{
				System.out.println("expected text  is present ");
			}
			
			
		
			first_name.sendKeys("knowledge");
			last_name.sendKeys("share");
			email_id.sendKeys("testknowledgeshare@gmail.com");
			password.sendKeys("123456");
			confirm_password.sendKeys("123456");
		
		
	}
}
