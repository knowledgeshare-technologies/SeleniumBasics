package com.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown_examples 
{
		public static void main(String args[])
		{
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
			/* Multi Select DropsDown */
			driver.get("C:\\Users\\SAM\\Desktop\\webpages\\MultiSelectDropDown_Page.html");
			
			Select browsers_selection =new Select(driver.findElement(By.name("Browsers")));
			browsers_selection.selectByVisibleText("Chrome");
			browsers_selection.selectByVisibleText("IE");
			
			browsers_selection.deselectAll();
			
			/*
			 * List<WebElement> browsers_list=browsers_selection.getOptions();
			 * 
			 * for(int i=0;i<browsers_list.size();i++) {
			 * System.out.println(browsers_list.get(i).getText()); }
			 */
			
		}
}
