package com.juaracoding.magang.web.juaracoding.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.magang.web.juaracoding.driver.DriverSingleton;

public class GalleryAdminPage {
	private WebDriver driver;

	public GalleryAdminPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.sidebar-wrapper > div > div.logo-wrapper > div.toggle-sidebar")
	private WebElement menu_toogleeBar;
	// GALERI
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(12) > a")
	private WebElement menu_Gallery;
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div:nth-child(5) > div > div > div > div.card-header > h3")
	private WebElement listgalery_text;
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div")
	private WebElement menusidebar_container;

	public void galleryAdd() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);

		js.executeScript("window.scrollBy(0,50)");
		wait.until(ExpectedConditions.elementToBeClickable(menu_Gallery));
		actions.moveToElement(menu_Gallery).perform();
		menu_Gallery.click();

	}
	public void galleryEdit() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);

//		js.executeScript("window.scrollBy(0,50)");
//		wait.until(ExpectedConditions.elementToBeClickable(menu_Gallery));
//		actions.moveToElement(menu_Gallery).perform();
//		menu_Gallery.click();

	}
}
