package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass;

public class Search_page extends Baseclass {

	public Search_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//button[text()=' Execute ']")
	WebElement python_Execute_button;
	
	
	public WebElement getPython_Execute_button() {
		return python_Execute_button;
	}
	
	
	@FindBy(xpath = "//button[text()=' Got it! ']")
	WebElement got_it_search;
	
	
	public WebElement getGot_it_search() {
		return got_it_search;
	}
	@FindBy(xpath="//button[text()=' External Libraries ']")
	WebElement scroll_python_execute;
	
	public WebElement getScroll_python_execute() {
		return scroll_python_execute;
	}
	
	
	@FindBy(xpath = "(//div[@class='ace_scroller'])[2]")
	WebElement python_output;
	
	public WebElement getPython_output() {
		return python_output;
	}

	
	
	
	@FindBy(xpath = "//h1[@class='text-md font-medium xl:text-lg']")
	WebElement python_ide;
	
	public WebElement getPython_ide() {
		return python_ide;
	}
	
	
	@FindBy(xpath = "//div[@class='hidden w-auto justify-end py-3 pr-2 lg:flex lg:w-[162px] xl:w-auto']")
	WebElement search_box;
	
	public WebElement getSearch_box() {
		return search_box;
	}
	
	
	@FindBy(xpath = "(//input[@id='searchBar'])[2]")
	WebElement text_enter;
	

	public WebElement getText_enter() {
		return text_enter;
	}
	
	
	@FindBy(xpath = "(//span[text()='Python2'])[2]")
	WebElement python_option;
	
	public WebElement getPython_option() {
		return python_option;
	}




	
	
	
}
