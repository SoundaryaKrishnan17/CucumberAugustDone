package com.commonaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commonaction {
	
	public static WebDriver driver;
	
	public static void launch(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Soundharya\\eclipse-workspace\\CucumberAugust\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void insertext(WebElement ele , String value)
	{
		ele.sendKeys(value);
	}
	
	public void submit(WebElement ele)
	{
		ele.click();
	}
}


