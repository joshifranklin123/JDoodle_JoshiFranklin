package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass;

public class Java_Execute_Page extends Baseclass {
	
	
	public Java_Execute_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	

	@FindAll({
	
	@FindBy(xpath = "(//div[@class='ace_content'])[1]"),
	@FindBy(xpath ="//div[@style='top: 0px; left: 0px; width: 1233px; height: 548px;']")
	
	})
	WebElement Text_box;
	
	public WebElement getText_box() {
		return Text_box;
	}
	
	
	@FindBy(xpath = "//button[text()=' Got it! ']")
	WebElement got_it_java;
	

	
	public WebElement getGot_it_java() {
		return got_it_java;
	}




	@FindBy(xpath = "//button[text()=' External Libraries ']")
	WebElement scroll_execute;
	
	
	public WebElement getScroll_execute() {
		return scroll_execute;
	}




	@FindBy(xpath = "//button[text()=' Execute ']")
	WebElement Execute_button;
	
	public WebElement getExecute_button() {
		return Execute_button;
	}
	
	
	
	
	@FindBy(xpath = "//button[text()=' Output ']")
	WebElement prodect;
	
	public WebElement getProdect() {
		return prodect;
	}

	
	
	
	
	
	@FindBy(xpath = "(//div[@class='ace_scroller'])[2]")
	WebElement output;


	public WebElement getOutput() {
		return output;
	}


	




	
	
	//java sample multiplication code

	public String java_code="{public static void main(String[] args) {int a=5; int b=20; int c=a*b;System.out.println(\"multiplication of a*b = \" + c); }}";

	
	
	
	
	

}
