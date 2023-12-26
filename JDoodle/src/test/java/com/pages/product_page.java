package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass;

public class product_page extends Baseclass{
	
	public product_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//h1[text()='JDoodle Teach and Assess']")
	WebElement tech_assess;
	
	public WebElement getTech_assess() {
		return tech_assess;
	}
	
	
	
	@FindBy(xpath="//div[@class='section-primary py-12']")
	WebElement scroll_find;
	
	public WebElement getScroll_find() {
		return scroll_find;
	}


	@FindBy(xpath="//a[text()='Find Out']")
	WebElement find_out;
	
	public WebElement getFind_out() {
		return find_out;
	}


	@FindBy(xpath="(//span[@class='sr-only'])[1]/..")
	WebElement cancel_button;
	
	public WebElement getCancel_button() {
		return cancel_button;
	}

	@FindBy(xpath="//h1[text()='Sign in to JDoodle']")
	WebElement sign_in;
	
	public WebElement getSign_in() {
		return sign_in;
	}
	
	
	@FindBy(xpath="(//button[text()='Create an Assignment '])[1]")
	WebElement create_assignment;
	
	public WebElement getCreate_assignment() {
		return create_assignment;
	}

	@FindBy(xpath = "//h1[@class='heading-large mb-5']")
	WebElement tech_page;
	
	public WebElement getTech_page() {
		return tech_page;
	}

	
	@FindBy(xpath = "(//button[@class='link-nav flex items-center rounded-md px-2 py-1 text-[14px]'])[1]")
	WebElement product;

	public WebElement getProduct() {
		return product;
	}
	
	@FindBy(xpath = "(//img[@class='object-contain'])[3]")
	WebElement tech;

	public WebElement getTech() {
		return tech;
	}
	
	
	
	public String tech_assess_text="JDoodle Teach and Assess";
	
	public String tech_head="Your own virtual institute for teaching and assessing students";
	
	public String sign_text="Sign in to JDoodle";



}
