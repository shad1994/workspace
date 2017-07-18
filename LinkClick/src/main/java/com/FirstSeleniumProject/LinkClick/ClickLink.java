package com.FirstSeleniumProject.LinkClick;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class ClickLink 
{
    public static void main( String[] args )
    {
        
        System.setProperty("webdriver.gecko.driver", "/home/qainfotech/workspace/LaunchBrowser/resources/geckodriver");

		WebDriver driver = new FirefoxDriver();
		
		System.out.println("Hello Google...");
       // driver.manage().window().maximize();
        driver.get("https://google.com");
        
        // Enter the text in the search box
        WebElement searchText = driver.findElement(By.id("lst-ib"));
        searchText.sendKeys("FirefoxDriver");
        
        try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("The search list is - \n");
        
      
        List<WebElement> search = driver.findElements(By.cssSelector("li.gsfs"));
        for (WebElement ele : search) {
        	System.out.println(ele.getText());
        	}
        
        try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("The url list is - \n");
        
        List<WebElement> urls = driver.findElements(By.cssSelector("h3.r"));
        System.out.println(urls.size());
        for (WebElement url : urls) {
        	System.out.println(url.getText());
        	}
        
        try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("\n");
        
        List<WebElement> urls1 = driver.findElements(By.xpath("//h3[@class='r']"));
        System.out.println(urls1.size());
        for (WebElement url : urls1) {
        	System.out.println(url.getText());
        	}
        
       urls.get(4).click();
        
        
       
       
        
    }}
