package com.FirstSeleniumProject.LaunchBrowser;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchFirefox {

	public static void main(String args[]) throws IOException, InterruptedException {

		Locators locator = new Locators();
		System.setProperty("webdriver.gecko.driver", "/home/qainfotech/workspace/LaunchBrowser/resources/geckodriver");

	WebDriver driver = new FirefoxDriver();

		driver.get("https://accounts.google.co.in");
	

		WebDriverWait wait = new WebDriverWait(driver, 20);

		//wait.until(ExpectedConditions.visibilityOfElementLocated(locator.findLocator("email")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".uBOgn")));

		
		driver.findElement(locator.findLocator("email")).sendKeys("shad.sayeed2");

		// email;
		System.out.println("email id entered..");

		// wait.until(ExpectedConditions.visibilityOfElementLocated(locator.findLocator("nextbutton")));

		// WebElement button =
		System.out.println(locator.findLocator("nextbutton"));

		
		
		driver.findElement(locator.findLocator("nextbutton")).click();

		
		
		/// ho gya.................

		System.out.println("enter the password..");
		
		///Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("headingText")));
		
		
	 
		driver.findElement(locator.findLocator("password")).sendKeys("shad1994");
		System.out.println("password entered..");

		//wait.until(ExpectedConditions.visibilityOfElementLocated(locator.findLocator("nextbutton")));

		WebElement button2 = driver.findElement(locator.findLocator("nextbutton"));
		button2.click();
		System.out.println("Welcome ...");

		// System.out.println("Time to open your inbox ...");

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/*WebElement compose=driver.findElement(locator.findLocator("composebutton"));
		compose.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement to=driver.findElement(locator.findLocator("to"));
		to.sendKeys("shadabsayeed@qainfotech.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement subject=driver.findElement(locator.findLocator("subject"));
		subject.sendKeys("Hello Selenium");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement content=driver.findElement(locator.findLocator("content"));
		content.sendKeys("Automatic mail");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement send=driver.findElement(locator.findLocator("sendbutton"));
		send.click();
		
		System.out.println("Mail sent");*/

	}
};
