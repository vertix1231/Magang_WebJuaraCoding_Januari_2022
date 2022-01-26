package com.juaracoding.magang.web.juaracoding.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(menuSyllabus));
		menuSyllabus.click();
	}
	
	@FindBy(css = "#myTab > li:nth-child(2) > a")
	private WebElement tabSyllabus;
	
	@FindBy(css = "#myTab > li:nth-child(2) > a")
	private WebElement tabQualification;
	
	public void ProfileTabSyllabus() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(tabSyllabus));
		tabSyllabus.click();	
	}
	
	public void ProfileTabQualification() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(tabQualification));
		tabQualification.click();
	}
		
	
}
