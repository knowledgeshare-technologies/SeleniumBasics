package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_popup_usingCredentials_in_URL {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="http://" + "admin" + ":" +"admin" + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(url);
		driver.manage().window().maximize();
		String displayed_message=driver.findElement(By.xpath("//p")).getAttribute("innerHTML");
		
		if(displayed_message.contains("Congratulations"))
		{
			System.out.println("Authentication Successfull");
			
		}
		else
		{
			System.out.println("Authentication NOT Successfull");
		}
	}

}
