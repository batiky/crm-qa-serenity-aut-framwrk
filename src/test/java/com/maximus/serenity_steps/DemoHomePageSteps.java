package com.maximus.serenity_steps;

import org.openqa.selenium.Keys;

import com.maximus.pages.DemoHomePage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class DemoHomePageSteps extends ScenarioSteps {

	public DemoHomePage homePage;
	String keyword;
	@Step
	public void open() {
		homePage.open();
	}
	
	@Step
	public void searchFor(String keyword) {
		this.keyword = keyword;
		homePage.searchBox.sendKeys(keyword+ Keys.ENTER);
		System.out.println("Searching for " + keyword);
	}
	
	
}
