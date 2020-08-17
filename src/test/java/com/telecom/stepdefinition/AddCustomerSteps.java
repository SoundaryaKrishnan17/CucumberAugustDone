   package com.telecom.stepdefinition;


import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.commonaction.Commonaction;
import com.telecom.page.AddcustomerPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomerSteps extends Commonaction {
	
	AddcustomerPage ac = new AddcustomerPage();
	
	

	@Given("User click on add customer button")
	public void user_click_on_add_customer_button() throws InterruptedException {
		handleFrame();
	      
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	    
	}

	@When("User filling up all the details")
	public void user_filling_up_all_the_details() throws InterruptedException {
		handleFrame();
		
	   submit(driver.findElement(By.xpath("//label[@for='done']")));
	   insertext(driver.findElement(By.id("fname")), "soundarya");
	   insertext(ac.getLname(), "krishnan");
	   insertext(ac.getEmail(), "soundarya@gmail.com");
	   insertext(ac.getAddr(), "chennai");
	   insertext(ac.getPhno(),"9629583643");
	   
	}

	@When("User filling up all the details with one dim list")
	public void user_filling_up_all_the_details_with_one_dim_list(DataTable datas) throws InterruptedException {
		
		List<String> cusDatas = datas.asList();
		
		handleFrame();
		
	   driver.findElement(By.xpath("//label[@for='done']")).click();
	   driver.findElement(By.id("fname")).sendKeys(cusDatas.get(0));
	   driver.findElement(By.id("lname")).sendKeys(cusDatas.get(1));
	   driver.findElement(By.id("email")).sendKeys(cusDatas.get(2));
	   driver.findElement(By.name("addr")).sendKeys(cusDatas.get(3));
	   driver.findElement(By.id("telephoneno")).sendKeys(cusDatas.get(4));
	    
	}

	
	@When("User filling up all the details with one dim map")
	public void user_filling_up_all_the_details_with_one_dim_map(DataTable datas) throws InterruptedException {
		
		Map<String, String> cusDatas = datas.asMap(String.class, String.class);
		
		handleFrame();
		
	   driver.findElement(By.xpath("//label[@for='done']")).click();
	   driver.findElement(By.id("fname")).sendKeys(cusDatas.get("Fname"));
	   driver.findElement(By.id("lname")).sendKeys(cusDatas.get("lname"));
	   driver.findElement(By.id("email")).sendKeys(cusDatas.get("mail"));
	   driver.findElement(By.name("addr")).sendKeys(cusDatas.get("address"));
	   driver.findElement(By.id("telephoneno")).sendKeys(cusDatas.get("phno"));
	    
	}
	
	@When("User filling up all the details with two dim list")
	public void user_filling_up_all_the_details_with_two_dim_list(DataTable datas) throws InterruptedException {
		
		List<List<String>> cusDatas = datas.asLists();
		
		handleFrame();
		
	   driver.findElement(By.xpath("//label[@for='done']")).click();
	   driver.findElement(By.id("fname")).sendKeys(cusDatas.get(1).get(0));
	   driver.findElement(By.id("lname")).sendKeys(cusDatas.get(3).get(1));
	   driver.findElement(By.id("email")).sendKeys(cusDatas.get(2).get(2));
	   driver.findElement(By.name("addr")).sendKeys(cusDatas.get(2).get(3));
	   driver.findElement(By.id("telephoneno")).sendKeys(cusDatas.get(2).get(4));
	    
	}
	

	
	@When("User filling up all the details with two dim map")
	public void user_filling_up_all_the_details_with_two_dim_map(DataTable datas) throws InterruptedException {
		
		List<Map<String, String>> cusDatas = datas.asMaps(String.class, String.class);
		
		handleFrame();
		
	   driver.findElement(By.xpath("//label[@for='done']")).click();
	   driver.findElement(By.id("fname")).sendKeys(cusDatas.get(1).get("FirstN"));
	   driver.findElement(By.id("lname")).sendKeys(cusDatas.get(3).get("LastN"));
	   driver.findElement(By.id("email")).sendKeys(cusDatas.get(2).get("mail"));
	   driver.findElement(By.name("addr")).sendKeys(cusDatas.get(2).get("Addr"));
	   driver.findElement(By.id("telephoneno")).sendKeys(cusDatas.get(2).get("phno"));
	    
	}
	
	@When("User filling up all the details with {string},{string},{string},{string},{string}")
	public void user_filling_up_all_the_details_with(String fname, String lname, String mail, String addr, String phno) throws InterruptedException {
	  
          handleFrame();
		
	   driver.findElement(By.xpath("//label[@for='done']")).click();
	   driver.findElement(By.id("fname")).sendKeys(fname);
	   driver.findElement(By.id("lname")).sendKeys(lname);
	   driver.findElement(By.id("email")).sendKeys(mail);
	   driver.findElement(By.name("addr")).sendKeys(addr);
	   driver.findElement(By.id("telephoneno")).sendKeys(phno);
	    
	}
	
	@When("User click on submit button")
	public void user_click_on_submit_button() {
	  driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	  
	}

	
	@Then("User will be displayed customer ID is generated")
	public void user_will_be_displayed_customer_ID_is_generated() throws InterruptedException {
		handleFrame();
	    
	   Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	   String text =driver.findElement(By.xpath("(//td[@align='center'])[2]")).getText();
	   System.out.println(text);
	  driver.close();
	   
	}

	public void handleFrame() throws InterruptedException {
		Thread.sleep(5000);
		driver.switchTo().frame("flow_close_btn_iframe");
		driver.findElement(By.xpath("//div[@id='closeBtn']")).click();
		driver.switchTo().defaultContent();
	}

}
