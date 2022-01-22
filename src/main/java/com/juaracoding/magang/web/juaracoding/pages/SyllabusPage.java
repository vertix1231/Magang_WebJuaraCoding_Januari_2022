package com.juaracoding.magang.web.juaracoding.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.magang.web.juaracoding.driver.DriverSingleton;



public class SyllabusPage {

	private WebDriver driver;
	
	public SyllabusPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//Dropdown Menu Learning
		@FindBy(css = "#navbarsMenu > ul > li.nav-item.dropdown > a")
		private WebElement menuLearning;
		
		public void learningDropDown() {
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			menuLearning.click();
		}
	
	@FindBy(css = "#navbarsMenu > ul > li.nav-item.dropdown.show > div > a:nth-child(2)")
	private WebElement menuSyllabus;
	
	public void pageSyllabus() {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		menuSyllabus.click();
	}
	
	@FindBy(css = "#myTab > li:nth-child(2) > a")
	private WebElement tabSyllabus;
	
	@FindBy(css = "#myTab > li:nth-child(2) > a")
	private WebElement tabQualification;
	
	public void ProfileTabSyllabus() {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		tabSyllabus.click();	
	}
	
	public void ProfileTabQualification() {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		tabQualification.click();
	}
		
	
}
