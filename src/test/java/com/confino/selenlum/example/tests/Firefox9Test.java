package com.confino.selenlum.example.tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.confino.selenium.example.pageObject.Home;
import com.confino.selenium.example.pageObject.InternationalNews;

public class Firefox9Test extends BaseTest{
	
	@Test
	public void basicTest(){
		Home home = Home.navigateTo(driver);
		InternationalNews internationalNews = home.switchToInternational();
		assertTrue(internationalNews.headerEditionContains("EDITION:  INTERNATIONAL"));
	}

}
