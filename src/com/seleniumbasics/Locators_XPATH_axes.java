package com.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_XPATH_axes 
{
	public static void main(String args[])
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium + Java - Youtube\\Selenium\\Libraries\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://money.rediff.com/companies/most-traded");
		driver.manage().window().maximize();
		System.out.println("XPATH Examples - Registration Page ");
		
		
		/* following example: */
			
						//a[contains(text(),'Vodafone Idea L')]/following::a
		
		/* preceding example: */
			
						//a[contains(text(),'Vodafone Idea L')]/preceding::a
		
		//=======================================  DONE
		
		/* following-sibling */
		 	
						//a[contains(text(),'Suzlon Energy Ltd.')]/parent::td/following-sibling::td
		
		/* preceding-sibling */
			
						//*[contains(text(),'19050661')]/preceding-sibling::*
		
		//=======================================
		/* parent example */
			
						//*[contains(text(),'19050661')]/parent::*

		/* child example */
			
						//a[contains(text(),'Vodafone Idea L')]/following::tr[1]/child::*
		
		//=======================================
		
		/* ancestor example : */
					
						//*[contains(text(),'19050661')]/ancestor::*
		
		/* descendant example : */				
		
						//a[contains(text(),'Vodafone Idea L')]/following::tr/descendant::*
		
		//=======================================
		
	}
	
}
