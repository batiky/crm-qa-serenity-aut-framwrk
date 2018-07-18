package com.maximus.step_definitions;

import com.maximus.pages.DemoHomePage;
import com.maximus.serenity_steps.DemoHomePageSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class DemoHomePageStepDefs {

	
	@Steps
	DemoHomePageSteps homePage;
	DemoHomePage home;
	private String keyword;
	
	
	@Given("^I am on amazon home page$")
	public void i_am_on_amazon_home_page() throws Exception {
	   homePage.open(); 
	}

	@Given("^I search for (.*)$")
	public void i_search_for(String keyword) throws Exception {
	    this.keyword= keyword;
		homePage.searchFor(keyword);
	}

	@Then("^Search result should be displayed$")
	public void search_result_should_be_displayed() throws Exception {
	    
	}


	
}
