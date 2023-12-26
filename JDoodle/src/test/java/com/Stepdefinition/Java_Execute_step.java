package com.Stepdefinition;

import java.awt.AWTException;

import org.junit.Assert;

import com.pages.Java_Execute_Page;
import com.reusable.Reusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Java_Execute_step extends Reusable{
	
	public Java_Execute_Page expg ;
	
	
	@Given("The application URL is launched")
	public void The_application_URL_is_launched() throws Exception {
	    browser_Launch();
	}
	
	@When("The text box is clicked")
	public void the_text_box_is_clicked() {
		expg = new Java_Execute_Page(driver);
		implicitywait();
	    to_Click(expg.getText_box());
	    
	}
	@When("The existing code in the text box is cleared")
	public void the_existing_code_in_the_text_box_is_cleared() throws AWTException {
		Double_click(expg.getText_box());
		implicitywait();
		click_backspace();
		implicitywait();
		Double_click(expg.getText_box());
		implicitywait();
		click_backspace();
	}
	@When("The Java multiplication method code is entered")
	public void the_Java_multiplication_method_code_is_entered() throws AWTException {
		implicitywait();
		click_Enter();
		implicitywait();
		action_Sendkey(expg.getText_box(), expg.java_code);
	}
	
	@When("The execute button is clicked")
	public void the_execute_button_is_clicked() throws AWTException, InterruptedException {
		implicitywait();
		press_downkey(5);
		action_click(expg.getGot_it_java());
		Thread.sleep(3000);
		scrolldwon(expg.getScroll_execute());
		action_click(expg.getText_box());
		Thread.sleep(3000);
	   to_Click(expg.getExecute_button());
	
	}

	@Then("Verify the validated output is correct not not")
	public void Verify_the_validated_output_is_correct_not_not() throws InterruptedException {
		Thread.sleep(10000);
		assert_output_cheak(expg.getOutput());
		
		browser_Close();
		
		
   
	}

	












}


