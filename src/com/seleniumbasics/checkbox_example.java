package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox_example 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://the-internet.herokuapp.com/checkboxes");
		
		WebElement checkbox_1=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
				checkbox_1.click();
		
		WebElement checkbox_2=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		
		if(checkbox_2.isSelected())
		{
			System.out.println("checkbox2 is checked already and unchecking it.....");
			checkbox_2.click();
		}
	}
}

