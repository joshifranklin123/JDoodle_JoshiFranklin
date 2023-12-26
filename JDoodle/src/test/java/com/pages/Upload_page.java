package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.Baseclass;

public class Upload_page extends Baseclass {
	
	public Upload_page(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);

	}
	
	
	@FindBy(xpath = "//h6[text()=' Generated Files ']")
	WebElement upload_scroll;
	
	public WebElement getUpload_scroll() {
		return upload_scroll;
	}


	


	@FindBy(xpath = "//div[@class='rc-imageselect-desc-no-canonical']")
	WebElement captcha;
	
	
	public WebElement getCaptcha() {
		return captcha;
	}

	@FindBy(xpath = "//button[text()=' Upload Files ']")
	WebElement upload_button;
	
	public WebElement getUpload_button() {
		return upload_button;
	}
	
	
	@FindBy(xpath = "(//input[@class='absolute left-0 top-0 h-full w-full cursor-pointer opacity-0'])[2]")
	WebElement file_upload;
	
	public WebElement getFile_upload() {
		return file_upload;
	}
	
	
	@FindBy(xpath = "//button[text()=' Got it! ']")
	WebElement got_it_upload;
	
	
	
	
	public WebElement getGot_it_upload() {
		return got_it_upload;
	}


	@FindBy(xpath = "(//p[@class='p-xsmall truncate'])[2]")
	WebElement upload_verify;


	public WebElement getUpload_verify() {
		return upload_verify;
	}


	@FindBy(xpath = "(//h6[text()=' Upload Files '])[2]")
	WebElement text_upload;


	public WebElement getText_upload() {
		return text_upload;
	}
	
	
	
	public String file_path="D:\\jaga\\eclipse\\New folder\\projects.zip_expanded\\JDoodle\\uploadfile.txt";
	
	public String file_upload_verify="/uploads/uploadfile.txt";

	
	
	
	

}
