package com.Stepdefinition;

import java.awt.AWTException;

import com.pages.External_Library_page;
import com.reusable.Reusable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class External_library_step extends Reusable{
	
	public External_Library_page elpg;
	
	
	@When("The user clicks on the external library option")
	public void the_user_clicks_on_the_external_library_option() throws InterruptedException, AWTException {
		elpg = new External_Library_page(driver);
		implicitywait();
		Thread.sleep(6000);
		scrolldwon(elpg.getExternal_lib());
		press_downkey(4);
		to_Click(elpg.getExternal_lib());			
	}
	
	@Then("The user validates the add library option is displayed")
	public void the_user_validates_the_add_library_option_is_displayed() {
		implicitywait();
	    assert_equal(elpg.getMaven_library(), elpg.maven_library_text);
	}

	@When("The user adds the Maven dependency in the add library text box")
	public void the_user_adds_the_Maven_dependency_in_the_add_library_text_box() throws InterruptedException {
		implicitywait();
		Thread.sleep(5000);

		action_Sendkey(elpg.getAdd_text_box(), elpg.add_dependency);
	    
	}

	@When("The user clicks the add library button")
	public void the_user_clicks_the_add_library_button() throws InterruptedException {
		implicitywait();
		Thread.sleep(5000);
		to_Click(elpg.getAdd_library());
	   
	}
	
	@Then("The user verifies that the dependency is added")
	public void the_user_verifies_that_the_dependency_is_added() throws InterruptedException {
	  implicitywait();
	  Thread.sleep(5000);
	  assert_equal(elpg.getAdded_dependency(), elpg.expected_dependency);
	  browser_Close();
	}






}
