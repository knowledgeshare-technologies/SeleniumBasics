package com.seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edge_Browser_example {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("http://www.google.com");

	}

}
