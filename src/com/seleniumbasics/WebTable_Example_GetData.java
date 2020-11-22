package com.seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Example_GetData 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://the-internet.herokuapp.com/tables");
		
		/* Number of Rows */
		List rows=driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr"));
		int no_of_rows=rows.size();
		System.out.println("Number of rows/records in a webtable : " + no_of_rows);
				
				/* Getting 1st Row - 4th Column Value */
		WebElement first_member_due =driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td[4]"));
		System.out.println("1st Row - 4th Column Value is : " + first_member_due.getText());
		
		Float max_due=0.00f;
		Float final_max_due=0.00f;
		for(int i=1;i<no_of_rows;i++)
		{
			String max_dollar= driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[" + (i+1) + "]/td[4]")).getText();
			//System.out.println(max_dollar);
			max_dollar=max_dollar.replace("$","");
			
			max_due=Float.parseFloat(max_dollar); /* Convert from String to Float */
			
			if(max_due>final_max_due)
			{
				final_max_due=max_due;
			}
		}
		
			System.out.println("Maximum Due from the Web Table is : " + final_max_due);
	}

}
