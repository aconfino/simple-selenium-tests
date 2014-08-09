package com.confino.selenium.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHome {

	protected WebDriver driver;

	@FindBy(id = "gbqfq")
	private WebElement inputField;
	
	@FindBy(id = "gbqfb")
	private WebElement searchButton;

	public GoogleHome(WebDriver driver) {
		this.driver = driver;
	}

	public static GoogleHome navigateTo(WebDriver driver) {
		driver.get("http://www.google.com/");
		return PageFactory.initElements(driver, GoogleHome.class);
	}
	
	public SearchResults performDefaultSearch(){
		return searchFor("dogs");
	}

	public SearchResults searchFor(String searchTerm) {
		inputField.sendKeys(searchTerm);
		searchButton.click();
		return PageFactory.initElements(driver, SearchResults.class);
	}

}
