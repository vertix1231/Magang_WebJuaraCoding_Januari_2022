package com.juaracoding.magang.web.juaracoding.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.magang.web.juaracoding.driver.DriverSingleton;

public class LearningAdminPage {
	
	private WebDriver driver;

	public LearningAdminPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
}
