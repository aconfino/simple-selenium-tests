package com.confino.selenlum.example.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.confino.selenium.example.pageObject.Home;
import com.confino.selenium.example.pageObject.InternationalNews;

public class Firefox2Test extends BaseTest{
	
	@Test
	public void basicTest(){
		Home home = Home.navigateTo(driver);
		InternationalNews internationalNews = home.switchToInternational();
		assertTrue(internationalNews.headerEditionContains("EDITION:  INTERNATIONAL"));
	}

}
