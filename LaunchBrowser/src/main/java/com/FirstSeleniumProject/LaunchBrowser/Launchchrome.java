package com.FirstSeleniumProject.LaunchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchchrome {
	
	public static WebDriver driver;
	public static void main(String args[])
	{
		openChrome();
	}

	public static void openChrome()
	{
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver","/home/qainfotech/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to("http://google.com");
		WebElement element=driver.findElement(By.id("xyz"));
	}

}
