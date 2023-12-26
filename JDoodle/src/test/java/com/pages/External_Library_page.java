package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass;

public class External_Library_page extends Baseclass{

	
	public External_Library_page(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()=' External Libraries ']")
	WebElement external_lib;

	public WebElement getExternal_lib() {
		return external_lib;
	}
	
	
	@FindBy(xpath="(//label[text()='Add Jar from Maven Library'])[2]")
	WebElement maven_library;

	public WebElement getMaven_library() {
		return maven_library;
	}
	
	
	@FindBy(xpath="(//button[text()=' Add Library '])[2]")
	WebElement add_library;
	
	public WebElement getAdd_library() {
		return add_library;
	}
	
	
	
	@FindBy(xpath="(//input[@class='section-tertiary w-full rounded-md p-2'])[2]")
	WebElement add_text_box;
	
	public WebElement getAdd_text_box() {
		return add_text_box;
	}
	
	
	
	@FindBy(xpath="(//p[@class='truncate text-xs'])[2]")
	WebElement added_dependency;
	
	public WebElement getAdded_dependency() {
		return added_dependency;
	}

	// The click function of this string verification library is working
	public String maven_library_text="Add Jar from Maven Library";
	
	
	//The dependency for verifying this string has been added
	public String expected_dependency="<dependency> <groupId>io.github.bonigarcia</groupId> <artifactId>webdrivermanager</artifactId> <version>5.5.3</version> </dependency>";
	
	
	//A dependency has been added for storing this string
	public String add_dependency="<dependency>     <groupId>io.github.bonigarcia</groupId>     <artifactId>webdrivermanager</artifactId>     <version>5.5.3</version> </dependency>";
	
	
	
}
