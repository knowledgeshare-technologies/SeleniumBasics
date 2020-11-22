package com.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Example_Count_Rows_Columns {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://the-internet.herokuapp.com/tables");
		
		
		List col=driver.findElements(By.xpath("//*[@id=\"table1\"]/thead/tr/th"));
		int no_of_columns=col.size();
		System.out.println("Number of Columns in a web table : "  + no_of_columns);
		
		List rows=driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr"));
		int no_of_rows=rows.size();
		System.out.println("Number of rows/records in a webtable : " + no_of_rows);

	}

}
