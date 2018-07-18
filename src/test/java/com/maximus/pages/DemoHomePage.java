package com.maximus.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.amazon.com")

public class DemoHomePage extends PageObject {

	
	@FindBy(id="twotabsearchtextbox")
    public WebElement searchBox;
}
