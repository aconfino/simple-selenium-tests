package com.confino.selenium.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {

	protected WebDriver driver;

	@FindBy(id = "cnn_switchEdition_intl")
	private WebElement internationalEdition;

	public Home(WebDriver driver) {
		this.driver = driver;
	}

	public static Home navigateTo(WebDriver driver) {
		driver.get("http://www.cnn.com/");
		return PageFactory.initElements(driver, Home.class);
	}

	public InternationalNews switchToInternational() {
		internationalEdition.click();
		return PageFactory.initElements(driver, InternationalNews.class);
	}

}
