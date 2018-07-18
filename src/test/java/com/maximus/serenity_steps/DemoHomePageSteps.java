package com.maximus.serenity_steps;

import com.maximus.pages.DemoHomePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DemoHomePageSteps extends ScenarioSteps {

	public DemoHomePage homePage;
	
	@Step
	public void open() {
		homePage.open();
	}
	
	@Step
	public void searchFor() {
		
	}
	
	
}
