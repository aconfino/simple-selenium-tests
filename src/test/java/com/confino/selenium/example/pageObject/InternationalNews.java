package com.confino.selenium.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InternationalNews {

	protected WebDriver driver;

	@FindBy(id = "hdr-editions")
	private WebElement content;

	public InternationalNews(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean headerEditionContains(String string){
		return content.getText().contains(string);
	}

}
