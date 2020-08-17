package com.telecom.stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddTariffSteps {


	@Given("User click on add tariff button")
	public void user_click_on_add_tariff_button() {

		Hook.driver.findElement(By.xpath("(//a[@href='addtariffplans.php'])[1] ")).click();
	    
	}

	@When("User filling up tariff plan all the details")
	public void user_filling_up_tariff_plan_all_the_details() throws InterruptedException {
		handleFrame();
		 
		 Hook.driver.findElement(By.id("rental1")).sendKeys("45");
		 Hook.driver.findElement(By.id("local_minutes")).sendKeys("37");
		 Hook.driver.findElement(By.id("inter_minutes")).sendKeys("4");
		 Hook.driver.findElement(By.id("sms_pack")).sendKeys("1");
		 Hook.driver.findElement(By.id("minutes_charges")).sendKeys("2");
		 Hook.driver.findElement(By.id("inter_charges")).sendKeys("5");
		 Hook.driver.findElement(By.id("sms_charges")).sendKeys("6");
		 
	}
	
	@When("User filling up tariff plan all the details with one dim list")
	public void user_filling_up_tariff_plan_all_the_details_with_one_dim_list(DataTable tariff) throws InterruptedException {
	    handleFrame();
	    
	    List<String> data = tariff.asList();
	    
	    Hook.driver.findElement(By.id("rental1")).sendKeys(data.get(0));
		Hook.driver.findElement(By.id("local_minutes")).sendKeys(data.get(1));
		 Hook.driver.findElement(By.id("inter_minutes")).sendKeys(data.get(2));
		 Hook.driver.findElement(By.id("sms_pack")).sendKeys(data.get(3));
		 Hook.driver.findElement(By.id("minutes_charges")).sendKeys(data.get(4));
		 Hook.driver.findElement(By.id("inter_charges")).sendKeys(data.get(5));
		 Hook.driver.findElement(By.id("sms_charges")).sendKeys(data.get(6));
		 
	    
	}

	@When("User filling up tariff plan all the details with one dim map")
	public void user_filling_up_tariff_plan_all_the_details_with_one_dim_map(DataTable tariff1) throws InterruptedException {
	    handleFrame();
	    
	    Map<String,String> data = tariff1.asMap(String.class, String.class);
	    
	     Hook.driver.findElement(By.id("rental1")).sendKeys(data.get("Rent"));
		 Hook.driver.findElement(By.id("local_minutes")).sendKeys(data.get("Lim"));
		 Hook.driver.findElement(By.id("inter_minutes")).sendKeys(data.get("Imp"));
		 Hook.driver.findElement(By.id("sms_pack")).sendKeys(data.get("Sps"));
		 Hook.driver.findElement(By.id("minutes_charges")).sendKeys(data.get("Mca"));
		 Hook.driver.findElement(By.id("inter_charges")).sendKeys(data.get("Ics"));
		 Hook.driver.findElement(By.id("sms_charges")).sendKeys(data.get("Scp"));
		 
	    
	}
	
	@When("User filling up tariff plan all the details with two dim list")
	public void user_filling_up_tariff_plan_all_the_details_with_two_dim_list(DataTable tariff2) throws InterruptedException {
	    handleFrame();
	    
	    List<List<String>> data1 = tariff2.asLists();
	    
	     Hook.driver.findElement(By.id("rental1")).sendKeys(data1.get(3).get(0));
		 Hook.driver.findElement(By.id("local_minutes")).sendKeys(data1.get(1).get(1));
		 Hook.driver.findElement(By.id("inter_minutes")).sendKeys(data1.get(4).get(2));
		 Hook.driver.findElement(By.id("sms_pack")).sendKeys(data1.get(2).get(3));
		 Hook.driver.findElement(By.id("minutes_charges")).sendKeys(data1.get(3).get(4));
		 Hook.driver.findElement(By.id("inter_charges")).sendKeys(data1.get(0).get(5));
		 Hook.driver.findElement(By.id("sms_charges")).sendKeys(data1.get(2).get(6));
		 
	    
	}
	
	@When("User filling up tariff plan all the details with two dim map")
	public void user_filling_up_tariff_plan_all_the_details_with_two_dim_map(DataTable tariff3) throws InterruptedException {
	    handleFrame();
	    
	    List<Map<String, String>> data2 = tariff3.asMaps(String.class, String.class);
	    
	     Hook.driver.findElement(By.id("rental1")).sendKeys(data2.get(2).get("RT"));
		 Hook.driver.findElement(By.id("local_minutes")).sendKeys(data2.get(0).get("LMP"));
		 Hook.driver.findElement(By.id("inter_minutes")).sendKeys(data2.get(2).get("IMS"));
		 Hook.driver.findElement(By.id("sms_pack")).sendKeys(data2.get(4).get("SPC"));
		 Hook.driver.findElement(By.id("minutes_charges")).sendKeys(data2.get(3).get("MCS"));
		 Hook.driver.findElement(By.id("inter_charges")).sendKeys(data2.get(3).get("ICO"));
		 Hook.driver.findElement(By.id("sms_charges")).sendKeys(data2.get(2).get("SCM"));
		 
	    
	}

	@When("User click on add tariff submit button")
	public void user_click_on_add_tariff_submit_button() {
		
		Hook.driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}

	@Then("User verifying add tariff congrats msg")
	public void user_verifying_add_tariff_congrats_msg() throws InterruptedException {
		
		handleFrame();
		   
		   String text = Hook.driver.findElement(By.tagName("h2")).getText();
		   System.out.println(text);
		   Hook.driver.close();
	}

	public void handleFrame() throws InterruptedException {
		Thread.sleep(5000);
		Hook.driver.switchTo().frame("flow_close_btn_iframe");
		Hook.driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
		Hook.driver.switchTo().defaultContent();
	}

}
