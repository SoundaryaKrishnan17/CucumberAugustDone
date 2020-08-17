package com.telecom.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.commonaction.Commonaction;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends Commonaction{
	
	@Before
	public void beforeScenario() {
		launch("http://demo.guru99.com/telecom/");
	}
		

	@After
	public void afterScenario() {
		
		driver.close();
	}
}
