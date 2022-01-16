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

public class DashboardPage {

private WebDriver driver;
	
	public DashboardPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="#pageWrapper > div.page-body-wrapper > div.page-body > div:nth-child(2) > div > div.col-xl-4.col-lg-12.xl-50.calendar-sec.box-col-6 > div > div > div.default-datepicker > div > div > div > div > div.datepicker--days.datepicker--body.active > div.datepicker--cells.datepicker--cells-days > div:nth-child(18)")
	private WebElement date;

	@FindBy(xpath="//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[4]")
	private List<WebElement> logoAdminJc;
	//TOOGLE BAR
	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.sidebar-wrapper > div > div.logo-wrapper > div.toggle-sidebar")
	private WebElement menu_toogleeBar;
	//DASHBOARD
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(2) > a")
	private WebElement menu_dashboard;
	//HOME
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(4) > a")
	private WebElement menu_HomeJc;
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(4) > ul > li > a")
	private WebElement menu_HomeTestimonial;
	//LEARNING JC
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(5)")
	private WebElement menu_LearningJc;
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(5) > ul > li:nth-child(1) > a")
	private WebElement menu_LearningLms;
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(5) > ul > li:nth-child(2) > a")
	private WebElement menu_LearningBoothcamp;
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(5) > ul > li:nth-child(3) > a")
	private WebElement menu_LearningClass;
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(5) > ul > li:nth-child(4) > a")
	private WebElement menu_LearningSyllabus;
	//BLOG JC
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(6) > a")
	private WebElement menu_Blog;
	//CONTACT MASSAGE
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(7) > a")
	private WebElement menu_CtcMassage;
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(8) > a")
	private WebElement menu_Transaction;
	//USER
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(10) > a")
	private WebElement menu_User;
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(10) > ul > li:nth-child(1) > a")
	private WebElement menu_UserBilling;
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(10) > ul > li:nth-child(2) > a")
	private WebElement menu_UserPending;
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(10) > ul > li:nth-child(3) > a")
	private WebElement menu_UserComplete;
	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-header > h3")
	private WebElement DataSiswa_usercompletepage;
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(10) > ul > li:nth-child(4) > a")
	private WebElement menu_UserClose;
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(10) > ul > li:nth-child(5) > a")
	private WebElement menu_Usersubs;
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(10) > ul > li:nth-child(6) > a")
	private WebElement menu_UserAccesEmployee;
	//PROGRAM
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(11) > a")
	private WebElement menu_program;
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(11) > ul > li:nth-child(1) > a")
	private WebElement menu_programboothcamp;
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(11) > ul > li:nth-child(2) > a")
	private WebElement menu_programboothcampbatch;
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(11) > ul > li:nth-child(3) > a")
	private WebElement menu_programboothcampharga;
	//GALERI
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(12) > a")
	private WebElement menu_Gallery;
	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.page-body > div:nth-child(5) > div > div > div > div.card-header > h3")
	private WebElement listgalery_text;
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div")
	private WebElement menusidebar_container;
	
	public String getListgalery_text() {
		return listgalery_text.getText();
	}

	//Setting
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(13) > a")
	private WebElement menu_Setting;
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(13) > ul > li > a")
	private WebElement menu_Settingtemplateemail;
	
	@FindBy(css="#greeting")
	private WebElement welcometoDashboard;
	
	public String getWelcometoDashboard() {
		return welcometoDashboard.getText();
	}

	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div")
	private WebElement sideBarContainer;
	
	public void callendar() {
		date.click();
	}
	
	public void checkSidebarElement() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		//toogle
		menu_toogleeBar.click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		menu_toogleeBar.click();
		menu_toogleeBar.click();
		menu_toogleeBar.click();
		//galeri
		menu_Gallery.click();
		menu_dashboard.click();
		//HOME JC
		menu_HomeJc.click();
		menu_HomeTestimonial.click();
		menu_dashboard.click();
		//LEARNING JC
		menu_dashboard.click();
		menu_LearningJc.click();
		menu_LearningLms.click();// ini ngaco cuk malah ke halaman awal
		menu_dashboard.click();
		menu_LearningJc.click();
		menu_LearningBoothcamp.click();// ini ngaco cuk malah ke halaman awal
		menu_dashboard.click();
		menu_LearningJc.click();
		menu_LearningClass.click();// ini ngaco cuk malah ke halaman awal
		menu_dashboard.click();
		menu_LearningJc.click();
		menu_LearningSyllabus.click();// ini ngaco cuk malah ke halaman awal
		menu_dashboard.click();
		//BLOG JC
		menu_Blog.click();
		menu_dashboard.click();
		//Contact Massage
		menu_CtcMassage.click();
		menu_dashboard.click();
		//Transaction
		menu_Transaction.click();
		menu_dashboard.click();
		//USER
		menu_User.click();
		menu_UserBilling.click();
		menu_User.click();
		menu_UserPending.click();
		menu_User.click();
		menu_UserComplete.click();
		menu_User.click();
		actions.moveToElement(menu_UserClose).perform();
		menu_UserClose.click();
		menu_User.click();
		actions.moveToElement(menu_Usersubs).perform();
		menu_Usersubs.click();
		menu_User.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_UserAccesEmployee));
//		js.executeScript("window.scrollBy(0,10)");
		actions.moveToElement(menu_UserAccesEmployee).perform();
		menu_UserAccesEmployee.click();
//		//PROGRAM
//		menu_User.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_program));
		actions.moveToElement(menu_program).perform();
		menu_program.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_programboothcamp));
		actions.moveToElement(menu_programboothcamp).perform();
		menu_programboothcamp.click();
		menu_program.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_programboothcampbatch));
		actions.moveToElement(menu_programboothcampbatch).perform();
		menu_programboothcampbatch.click();
		menu_program.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_programboothcampharga));
		actions.moveToElement(menu_programboothcampharga).perform();
		menu_programboothcampharga.click();
//		//GALERI
//		wait.until(ExpectedConditions.elementToBeClickable(menu_Gallery));
		js.executeScript("window.scrollBy(0,50)");
		wait.until(ExpectedConditions.elementToBeClickable(menu_Gallery));
		actions.moveToElement(menu_Gallery).perform();
		menu_Gallery.click();
		//Setting
		actions.dragAndDrop(listgalery_text, menusidebar_container).build().perform();
		menu_toogleeBar.click();
//		menusidebar_container.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_Setting));
		actions.moveToElement(menu_Setting).perform();
		menu_Setting.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_Settingtemplateemail));
		actions.moveToElement(menu_Settingtemplateemail).perform();
		menu_Settingtemplateemail.click();
//		js.executeScript("window.scrollBy(0,500)");
//		menu_Setting.click();
//		wait.until(ExpectedConditions.elementToBeClickable(menu_Settingtemplateemail));
//		actions.moveToElement(menu_Settingtemplateemail).perform();
//		menu_Settingtemplateemail.click();
		//Setting
//		js.executeScript("window.scrollBy(0,75)");
//		actions.moveToElement(menu_Setting).perform();
//		menu_Setting.click();
//		actions.moveToElement(menu_Settingtemplateemail).perform();
//		menu_Settingtemplateemail.click();
		
	}
}

