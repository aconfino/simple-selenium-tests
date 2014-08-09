package com.confino.selenlum.example.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.confino.selenium.example.pageObject.GoogleHome;
import com.confino.selenium.example.pageObject.SearchResults;

public class Firefox16Test extends BaseTest{
	
	@Test
	public void basicTest(){
		GoogleHome google = GoogleHome.navigateTo(driver);
		SearchResults searchResults = google.performDefaultSearch();
		assertTrue(searchResults.correctPage());
	}

}
