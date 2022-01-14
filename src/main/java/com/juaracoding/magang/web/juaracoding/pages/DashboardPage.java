package com.juaracoding.magang.web.juaracoding.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.magang.web.juaracoding.driver.DriverSingleton;

public class DashboardPage {

private WebDriver driver;
	
	public DashboardPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div:nth-child(2) > div > div.col-xl-4.col-lg-12.xl-50.calendar-sec.box-col-6 > div > div > div.default-datepicker > div > div > div > div > div.datepicker--days.datepicker--body.active > div.datepicker--cells.datepicker--cells-days > div:nth-child(18)")
	private WebElement date;
	
	public void callendar() {
		date.click();
	}
}
