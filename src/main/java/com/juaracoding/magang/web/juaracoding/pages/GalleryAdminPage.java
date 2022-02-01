package com.juaracoding.magang.web.juaracoding.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div:nth-child(5) > div > div > div > div.faq-form > form > input")
	private WebElement search_gallery;

	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.page-body > div:nth-child(5) > div > div > div > div.card-header > a")
	private WebElement btnaddgaleri;
	
	@FindBy(css="#judul")
	private WebElement judulgambar;
	
	@FindBy(css="#frmregister > div.card-body > div > div.col-md-6.col-md-12 > div > input")
	private WebElement gambarselected;
	
	@FindBy(css="#frmregister > div.card-footer.text-end > input")
	private WebElement btnsaveGambar;
	             
	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.page-body > div:nth-child(5) > div > div > div > div.my-gallery.card-body.row.gallery-with-description > figure:nth-child(1) > a > img")
	private WebElement detailitemgambarselected;
	@FindBy(css="body > div.swal2-container.swal2-center.swal2-backdrop-show > div > div.swal2-actions > button.swal2-confirm.swal2-styled")
	private WebElement okdetailitemgambar;

	public void galleryAdd() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
//		driver.switchTo().frame(admincontainer);
//		//GALERI
//		js.executeScript("window.scrollBy(0,50)");
		wait.until(ExpectedConditions.elementToBeClickable(btnaddgaleri));
		actions.moveToElement(btnaddgaleri).perform();
		btnaddgaleri.click();
		wait.until(ExpectedConditions.elementToBeClickable(judulgambar));
		actions.moveToElement(judulgambar).perform();
		judulgambar.sendKeys("Halo Juara Coding 24");
		wait.until(ExpectedConditions.elementToBeClickable(gambarselected));
		actions.moveToElement(gambarselected).perform();
		gambarselected.sendKeys("D:\\ChromeDriver\\penguinlinux.png");
		wait.until(ExpectedConditions.elementToBeClickable(btnsaveGambar));
		actions.moveToElement(btnsaveGambar).perform();
		btnsaveGambar.click();
		
	}
	public void initgaleri() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);

//		//GALERI
		js.executeScript("window.scrollBy(0,50)");
		wait.until(ExpectedConditions.elementToBeClickable(menu_Gallery));
		actions.moveToElement(menu_Gallery).perform();
		menu_Gallery.click();
	}

	public void galleryEdit() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		wait.until(ExpectedConditions.elementToBeClickable(detailitemgambarselected));
		actions.moveToElement(detailitemgambarselected).perform();
		detailitemgambarselected.click();
		wait.until(ExpectedConditions.elementToBeClickable(okdetailitemgambar));
		actions.moveToElement(okdetailitemgambar).perform();
		okdetailitemgambar.click();
		

//		js.executeScript("window.scrollBy(0,50)");
//		wait.until(ExpectedConditions.elementToBeClickable(menu_Gallery));
//		actions.moveToElement(menu_Gallery).perform();
//		menu_Gallery.click();

	}

	public void gallerySearch() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);

		wait.until(ExpectedConditions.elementToBeClickable(search_gallery));
		actions.moveToElement(search_gallery).perform();
		search_gallery.sendKeys("mobil");
		search_gallery.sendKeys(Keys.ENTER);

//		js.executeScript("window.scrollBy(0,50)");
//		wait.until(ExpectedConditions.elementToBeClickable(menu_Gallery));
//		actions.moveToElement(menu_Gallery).perform();
//		menu_Gallery.click();

	}
}
