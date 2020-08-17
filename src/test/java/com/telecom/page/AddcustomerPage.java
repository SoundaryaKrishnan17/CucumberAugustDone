package com.telecom.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.commonaction.Commonaction;

public class AddcustomerPage extends Commonaction {
	
	public AddcustomerPage() {
		
		PageFactory.initElements(driver, this);
	}
	
     @FindBy(id="lname")
     private WebElement lname;
     
     @FindBy(id="email")
     private WebElement email;

     @FindBy(id="addr")
     private WebElement addr;

     @FindBy(id="telephoneno")
     private WebElement phno;


	public WebElement getEmail() {
		return email;
	}


	public WebElement getAddr() {
		return addr;
	}


	public WebElement getPhno() {
		return phno;
	}


	public WebElement getLname() {
		return lname;
	} 
     
}
