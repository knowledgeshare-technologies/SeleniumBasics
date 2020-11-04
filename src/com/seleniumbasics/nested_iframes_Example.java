package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class nested_iframes_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		int number_of_iframes=driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of iframes on a page : " + number_of_iframes);
		
		driver.switchTo().frame("frame1");
		System.out.println("Switched to frame1");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("test");
		
		driver.switchTo().frame("frame3");
		System.out.println("Switched to frame3");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.switchTo().defaultContent();
		System.out.println("Switched to main content");
		
		driver.switchTo().frame("frame2");
		System.out.println("Switched to frame2");
		Select animals =new Select(driver.findElement(By.id("animals")));
		animals.selectByIndex(2);
		
		driver.switchTo().defaultContent();
		System.out.println("Switched to default content7");
		String main_text=driver.findElement(By.xpath("(//span)[3]")).getAttribute("innerHTML");
		System.out.println(main_text);
		
	}

}
