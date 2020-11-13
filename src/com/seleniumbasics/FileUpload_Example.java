package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_Example 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://the-internet.herokuapp.com/upload");

		WebElement upload_button = driver.findElement(By.xpath("//input[@id='file-upload']"));
		upload_button.sendKeys("C:\\Users\\SAM\\Documents\\Files\\test.txt");

		driver.findElement(By.xpath("//input[@id='file-submit']")).click();

		if (driver.findElement(By.xpath("//*[text()='File Uploaded!']")).isDisplayed())
		{
			System.out.println("File upload is successfull");
		} 
		
		else 
		{
			System.out.println("File upload is not successfull");
		}
	}
}
