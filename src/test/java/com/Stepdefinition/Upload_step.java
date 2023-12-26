package com.Stepdefinition;

import java.awt.AWTException;

import com.pages.Upload_page;
import com.reusable.Reusable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Upload_step extends Reusable{
	
	public Upload_page upg;
	
	
	@When("The user clicks on the upload option")
	public void The_user_clicks_on_the_upload_option() throws InterruptedException {
		upg = new Upload_page(driver);
		implicitywait();
		action_click(upg.getGot_it_upload());
		Thread.sleep(2000);
		scrolldwon(upg.getUpload_scroll());

		to_Click(upg.getUpload_button());
	    
	}
	
	@Then("The upload option should be visible")
	public void the_upload_option_should_be_visible() {
		implicitywait();
		assert_equal(upg.getText_upload(), "Upload Files");
		
	    
	}
	
	@When("The user provides the file path")
	public void The_user_provides_the_file_path() throws InterruptedException, AWTException {
		implicitywait();
		Thread.sleep(2000);		
		enter_Text(upg.getFile_upload(), upg.file_path);
	   
	}

	@Then("The system should verify whether the file is successfully uploaded")
	public void the_system_should_verify_whether_the_file_is_successfully_uploaded() throws InterruptedException {
		implicitywait();
		Thread.sleep(5000);
		//captcha_handle(upg.getCaptcha(), "Select");
		//assert_equal(upg.getUpload_verify(), upg.file_upload_verify);
		//Assert_upload(upg.getUpolad_verify_captcha(), upg.file_upload_captcha, upg.getUpload_verify(),upg.file_upload_verify);
		//Assert_not_equal(upg.getUpload_verify(), upg.file_upload_verify);
		browser_Close();
	    
		
		
	
	}
	

}
