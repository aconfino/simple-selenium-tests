package com.confino.selenlum.example.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.confino.selenium.example.pageObject.GoogleHome;
import com.confino.selenium.example.pageObject.SearchResults;

public class Firefox20Test extends BaseTest{
	
	@Test
	public void basicTest(){
		GoogleHome google = GoogleHome.navigateTo(driver);
		SearchResults searchResults = google.searchFor("dogs");
		assertTrue(searchResults.searchResultsContain("The domestic dog is a subspecies of the gray wolf"));
	}

}
