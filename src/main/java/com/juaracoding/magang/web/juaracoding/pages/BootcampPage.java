package com.juaracoding.magang.web.juaracoding.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.magang.web.juaracoding.driver.DriverSingleton;



public class BootcampPage {
	
	private WebDriver driver;
	
	public BootcampPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	//Dropdown Menu Learning
		@FindBy(css = "#navbarsMenu > ul > li.nav-item.dropdown > a ")
		private WebElement menuLearning;
		
		public void learningDropDown() {
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			menuLearning.click();
		}
	
	@FindBy(css = "#navbarsMenu > ul > li.nav-item.dropdown.show > div > a:nth-child(1)")
	private WebElement menuBootcamp;

	public void pageBootcamp() {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		menuBootcamp.click();
	}
}
