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

public class DashboardAdminPage {

	private WebDriver driver;

	public DashboardAdminPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div:nth-child(2) > div > div.col-xl-4.col-lg-12.xl-50.calendar-sec.box-col-6 > div > div > div.default-datepicker > div > div > div > div > div.datepicker--days.datepicker--body.active > div.datepicker--cells.datepicker--cells-days > div:nth-child(18)")
	private WebElement date;

	@FindBy(xpath = "//*[@id=\"simple-bar\"]/div[1]/div[2]/div/div/div/li[4]")
	private List<WebElement> logoAdminJc;
	// TOOGLE BAR
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.sidebar-wrapper > div > div.logo-wrapper > div.toggle-sidebar")
	private WebElement menu_toogleeBar;
	// DASHBOARD
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(2) > a")
	private WebElement menu_dashboard;
	// HOME
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(4) > a")
	private WebElement menu_HomeJc;
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(4) > ul > li > a")
	private WebElement menu_HomeTestimonial;
	// LEARNING JC
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(5)")
	private WebElement menu_LearningJc;
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(5) > ul > li:nth-child(1) > a")
	private WebElement menu_LearningLms;
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(5) > ul > li:nth-child(2) > a")
	private WebElement menu_LearningBoothcamp;
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(5) > ul > li:nth-child(3) > a")
	private WebElement menu_LearningClass;
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(5) > ul > li:nth-child(4) > a")
	private WebElement menu_LearningSyllabus;
	// BLOG JC
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(6) > a")
	private WebElement menu_Blog;
	// CONTACT MASSAGE
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(7) > a")
	private WebElement menu_CtcMassage;
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(8) > a")
	private WebElement menu_Transaction;
	// USER
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(10) > a")
	private WebElement menu_User;
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(10) > ul > li:nth-child(1) > a")
	private WebElement menu_UserBilling;
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(10) > ul > li:nth-child(2) > a")
	private WebElement menu_UserPending;
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(10) > ul > li:nth-child(3) > a")
	private WebElement menu_UserComplete;
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-header > h3")
	private WebElement DataSiswa_usercompletepage;
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(10) > ul > li:nth-child(4) > a")
	private WebElement menu_UserClose;
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(10) > ul > li:nth-child(5) > a")
	private WebElement menu_Usersubs;
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(10) > ul > li:nth-child(6) > a")
	private WebElement menu_UserAccesEmployee;
	// PROGRAM
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(11) > a")
	private WebElement menu_program;
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(11) > ul > li:nth-child(1) > a")
	private WebElement menu_programboothcamp;
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(11) > ul > li:nth-child(2) > a")
	private WebElement menu_programboothcampbatch;
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(11) > ul > li:nth-child(3) > a")
	private WebElement menu_programboothcampharga;
	// GALERI
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(12) > a")
	private WebElement menu_Gallery;
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div:nth-child(5) > div > div > div > div.card-header > h3")
	private WebElement listgalery_text;
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div")
	private WebElement menusidebar_container;

	public String getListgalery_text() {
		return listgalery_text.getText();
	}

	// Setting
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(13) > a")
	private WebElement menu_Setting;
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(13) > ul > li > a")
	private WebElement menu_Settingtemplateemail;

	@FindBy(css = "#greeting")
	private WebElement welcometoDashboard;

	public String getWelcometoDashboard() {
		return welcometoDashboard.getText();
	}

	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div")
	private WebElement sideBarContainer;

	public void callendar() {
		date.click();
	}

	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div:nth-child(2) > div > div.col-xl-4.col-lg-12.xl-50.morning-sec.box-col-12 > div > div > div.greeting-user.text-center > div.whatsnew-btn > a")
	private WebElement whatnew;

	public WebElement getWhatnewdashboard() {
		return whatnew;
	}

	public void checkSidebarElement() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);

		// toogle
		wait.until(ExpectedConditions.elementToBeClickable(menu_toogleeBar));
		menu_toogleeBar.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_toogleeBar));
		menu_toogleeBar.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_toogleeBar));
		menu_toogleeBar.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_toogleeBar));
		menu_toogleeBar.click();
		// galeri
		wait.until(ExpectedConditions.elementToBeClickable(menu_Gallery));
		menu_Gallery.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_dashboard));
		menu_dashboard.click();
		// HOME JC
		wait.until(ExpectedConditions.elementToBeClickable(menu_HomeJc));
		menu_HomeJc.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_HomeTestimonial));
		menu_HomeTestimonial.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_dashboard));
		menu_dashboard.click();
		// LEARNING JC
		
		wait.until(ExpectedConditions.elementToBeClickable(menu_dashboard));
		menu_dashboard.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_LearningJc));
		menu_LearningJc.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_LearningLms));
		menu_LearningLms.click();// ini ngaco cuk malah ke halaman awal
		wait.until(ExpectedConditions.elementToBeClickable(menu_dashboard));
		menu_dashboard.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_LearningJc));
		menu_LearningJc.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_LearningBoothcamp));
		menu_LearningBoothcamp.click();// ini ngaco cuk malah ke halaman awal
		wait.until(ExpectedConditions.elementToBeClickable(menu_dashboard));
		menu_dashboard.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_LearningJc));
		menu_LearningJc.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_LearningClass));
		menu_LearningClass.click();// ini ngaco cuk malah ke halaman awal
		wait.until(ExpectedConditions.elementToBeClickable(menu_dashboard));
		menu_dashboard.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_LearningJc));
		menu_LearningJc.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_LearningSyllabus));
		menu_LearningSyllabus.click();// ini ngaco cuk malah ke halaman awal
		wait.until(ExpectedConditions.elementToBeClickable(menu_dashboard));
		menu_dashboard.click();
		
		// BLOG JC
		wait.until(ExpectedConditions.elementToBeClickable(menu_Blog));
		menu_Blog.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_dashboard));
		menu_dashboard.click();
		
		// Contact Massage
		wait.until(ExpectedConditions.elementToBeClickable(menu_CtcMassage));
		menu_CtcMassage.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_dashboard));
		menu_dashboard.click();
		
		// Transaction
		wait.until(ExpectedConditions.elementToBeClickable(menu_Transaction));
		menu_Transaction.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_dashboard));
		menu_dashboard.click();
	
		// USER
		wait.until(ExpectedConditions.elementToBeClickable(menu_User));
		actions.moveToElement(menu_User).perform();
		menu_User.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_UserBilling));
		actions.moveToElement(menu_UserBilling).perform();
		menu_UserBilling.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_User));
		actions.moveToElement(menu_User).perform();
		menu_User.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_UserPending));
		actions.moveToElement(menu_UserPending).perform();
		menu_UserPending.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_User));
		actions.moveToElement(menu_User).perform();
		menu_User.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_UserComplete));
		actions.moveToElement(menu_UserComplete).perform();
		menu_UserComplete.click();
		
		js.executeScript("arguments[0].scrollIntoView();", menu_User);
		wait.until(ExpectedConditions.elementToBeClickable(menu_User));
		actions.moveToElement(menu_User).perform();
		menu_User.click();
		js.executeScript("arguments[0].scrollIntoView();", menu_UserClose);
		wait.until(ExpectedConditions.elementToBeClickable(menu_UserClose));
		actions.moveToElement(menu_UserClose).perform();
		menu_UserClose.click();
		js.executeScript("arguments[0].scrollIntoView();", menu_User);
		wait.until(ExpectedConditions.elementToBeClickable(menu_User));
		actions.moveToElement(menu_User).perform();
		menu_User.click();
		js.executeScript("arguments[0].scrollIntoView();", menu_Usersubs);
		wait.until(ExpectedConditions.elementToBeClickable(menu_Usersubs));
		actions.moveToElement(menu_Usersubs).perform();
		menu_Usersubs.click();
		js.executeScript("arguments[0].scrollIntoView();", menu_User);
		wait.until(ExpectedConditions.elementToBeClickable(menu_User));
		actions.moveToElement(menu_User).perform();
		menu_User.click();
		js.executeScript("arguments[0].scrollIntoView();", menu_UserAccesEmployee);
		wait.until(ExpectedConditions.elementToBeClickable(menu_UserAccesEmployee));
		actions.moveToElement(menu_UserAccesEmployee).perform();
		menu_UserAccesEmployee.click();

//		//PROGRAM
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
		wait.until(ExpectedConditions.elementToBeClickable(menu_program));
		actions.moveToElement(menu_program).perform();
		menu_program.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_programboothcampharga));
		actions.moveToElement(menu_programboothcampharga).perform();
		menu_programboothcampharga.click();
		
//		//GALERI
		js.executeScript("window.scrollBy(0,50)");
		wait.until(ExpectedConditions.elementToBeClickable(menu_Gallery));
		actions.moveToElement(menu_Gallery).perform();
		menu_Gallery.click();
		// Setting
		wait.until(ExpectedConditions.elementToBeClickable(menu_toogleeBar));
		actions.moveToElement(menu_toogleeBar).perform();
		menu_toogleeBar.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_Setting));
		actions.moveToElement(menu_Setting).perform();
		menu_Setting.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_Settingtemplateemail));
		actions.moveToElement(menu_Settingtemplateemail).perform();
		menu_Settingtemplateemail.click();

		// balik ke dashboard karna udah cek semua menu nya
		wait.until(ExpectedConditions.elementToBeClickable(menu_dashboard));
		actions.moveToElement(menu_dashboard).perform();
		menu_dashboard.click();

	}
}
