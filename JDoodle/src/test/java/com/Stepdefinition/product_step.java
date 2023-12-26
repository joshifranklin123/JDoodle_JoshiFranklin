package com.Stepdefinition;

import com.pages.product_page;
import com.reusable.Reusable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class product_step extends Reusable {
	
	public product_page prpg;
	
	@When("The user click on the product option")
	public void the_user_click_on_the_product_option() throws InterruptedException {
	    implicitywait();
	    prpg = new product_page(driver);
	    Thread.sleep(3000);
	    action_click(prpg.getProduct());
		
	}
	
	@When("The user click on the tech and assess platfrom")
	public void the_user_click_on_the_tech_and_assess_platfrom() throws InterruptedException {
		implicitywait();
		Thread.sleep(3000);
		to_Click(prpg.getTech());
	}
	
	@Then("The user validate the tech page")
	public void the_user_validate_the_tech_page() {
		implicitywait();
	    assert_equal(prpg.getTech_page(), prpg.tech_head);
	}
	
	@When("The user clicks on the Create an Assignment button")
	public void the_user_clicks_on_the_Create_an_Assignment_button() throws InterruptedException {
		implicitywait();
		move_to_element(prpg.getCreate_assignment());
		Thread.sleep(3000);
		action_click(prpg.getCreate_assignment());
	}

	@Then("The user validates the sign in page")
	public void the_user_validates_the_sign_in_page() {
		implicitywait();
		assert_equal(prpg.getSign_in(), prpg.sign_text);
	    
	}
	
	@When("The user clicks the Cancel button")
	public void the_user_clicks_the_Cancel_button() throws InterruptedException {
		implicitywait();
		move_to_element(prpg.getCancel_button());
		Thread.sleep(3000);
		action_click(prpg.getCancel_button());
	    
	}

	@When("The user scrolls down the documentation to explore a topic")
	public void the_user_scrolls_down_the_documentation_to_explore_a_topic() {
		implicitywait();
	   scrolldwon(prpg.getScroll_find());
	}

	@When("The user clicks on the find out button")
	public void the_user_clicks_on_the_find_out_button() throws InterruptedException {
		implicitywait();
		Thread.sleep(5000);
		javascript_click(prpg.getFind_out());
	    move_to_element(prpg.getFind_out());
		Thread.sleep(3000);
		action_click(prpg.getFind_out());
	}
	
	@Then("The user validates the Tech and Assess page")
	public void the_user_validates_the_Tech_and_Assess_page() {
		implicitywait();
		assert_equal(prpg.getTech_assess(), prpg.tech_assess_text);
		browser_Close();
	    
	}









}
