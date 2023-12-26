package com.Stepdefinition;

import java.awt.AWTException;

import com.pages.Search_page;
import com.reusable.Reusable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_step extends Reusable {
	
	public Search_page scpg;
	
	
	@When("The user clicks on the search box")
	public void the_user_clicks_on_the_search_box() {
		scpg = new Search_page(driver);
		implicitywait();
		to_Click(scpg.getSearch_box());
	   
	}
	@When("The user enter the {string} in text box")
	public void the_user_enter_the_in_text_box(String py) throws AWTException {
		implicitywait();
	   enter_Text(scpg.getText_enter(), py);
	   
	}
	
	@When("The user click on the python option")
	public void the_user_click_on_the_python_option() {
	    implicitywait();
	    action_click(scpg.getPython_option());
	}
	
	@Then("The user validates the appearance of the Python {int} IDE")
	public void the_user_validates_the_appearance_of_the_Python_IDE(Integer int1) {
	    implicitywait();
	    assert_equal(scpg.getPython_ide(), "Online Python 2 IDE");
	    
	}
	
	@When("The user click on the execute button")
	public void the_user_click_on_the_execute_button() throws InterruptedException {
		implicitywait();
		action_click(scpg.getGot_it_search());
		Thread.sleep(2000);
		scrolldwon(scpg.getScroll_python_execute());
		to_Click(scpg.getPython_Execute_button());
	}
	
	@Then("Verify the validated python output is correct not not")
	public void verify_the_validated_python_output_is_correct_not_not() throws InterruptedException {
		implicitywait();
		Thread.sleep(9000);
	    Assert_not_equal(scpg.getPython_output(), "Sum of x+y = 35");
	    driver.quit();
	}






}
