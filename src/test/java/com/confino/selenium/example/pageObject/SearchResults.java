package com.confino.selenium.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResults {

	protected WebDriver driver;

	@FindBy(id = "rhs_block")
	private WebElement searchResults;

	public SearchResults(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean searchResultsContain(String string){
		return searchResults.getText().contains(string);
	}
	
	public boolean correctPage(){
		return searchResultsContain("The term \"domestic dog\" is generally used for both domesticated");
	}

}
