package com.juaracoding.magang.web.juaracoding.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.magang.web.juaracoding.driver.DriverSingleton;



public class CoursePage {
	
	private WebDriver driver;
	
	public CoursePage() {
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
	
	@FindBy(css = "#navbarsMenu > ul > li.nav-item.dropdown.show > div > a:nth-child(3)")
	private WebElement menuCourse;
	
	public void pageCourse() {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		menuCourse.click();
	}
	
	@FindBy(css = "#accordion-menu > div:nth-child(3) > div.card-header > a")
	private WebElement lstCourse;
	
	public void listCourse() {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		lstCourse.click();
	}

	@FindBy(id = "myInput")
	private WebElement txtSearch;
	
	public void searchCourses(String course) {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		txtSearch.sendKeys(course);
	}
	
	@FindBy(id = "button-addon2")
	private WebElement btnSearch;
	
	public void clickSearch() {
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		btnSearch.click();
	}
	

}
