package com.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_buttons_example {

		public static void main(String args[])
		{
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("http://demowebshop.tricentis.com/register");
			
			WebElement male_select=driver.findElement(By.xpath("//input[@id='gender-male']"));
			male_select.click();
			
			if(male_select.isSelected())
			{
				System.out.println("male radio button is selected");
			}
			else
			{
				System.out.println("male radio button is not selected");
			}
			
			List<WebElement> radio_buttons=driver.findElements(By.xpath("//input[@type='radio']"));
			//Getting number of radio buttons
			System.out.println("Number of radio buttons on a web page : " +radio_buttons.size() );
			
			//Printing the radio buttons
			for(WebElement printradio: radio_buttons)
			{
				System.out.println(printradio.getAttribute("id"));
				
			}
		}
}
