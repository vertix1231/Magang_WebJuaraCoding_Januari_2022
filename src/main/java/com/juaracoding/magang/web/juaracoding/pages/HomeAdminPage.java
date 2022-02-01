package com.juaracoding.magang.web.juaracoding.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

public class HomeAdminPage {
	
	private WebDriver driver;

	public HomeAdminPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

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
	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.page-body > div:nth-child(3) > div > div > div > div.my-gallery.card-body.row.gallery-with-description")
	private List<WebElement> card_testi_item;
	               
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div:nth-child(3) > div > div > div > div.my-gallery.card-body.row.gallery-with-description > figure:nth-child(10) > a")
	private WebElement cardone;
	
	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.page-body > div:nth-child(3) > div > div > div > div.card-header > a")
	private WebElement addTestiBtn;
	
	@FindBy(css="#frmadd > div.card-body > div > div.col-md-6.col-md-12 > div > input")
	private WebElement uploadTestPhotoBtn;
	
	@FindBy(css="#frmadd > div.card-body > div > div:nth-child(2) > div > input")
	private WebElement inputnametesti;
	
	@FindBy(css="#exampleFormControlSelect9")
	private WebElement listpublish;
	
	@FindBy(css="#frmadd > div.card-body > div > div:nth-child(4) > div > textarea")
	private WebElement inputMainTesti;
	
	@FindBy(css="#rating")
	private WebElement listrating;
	
	@FindBy(css="#frmadd > div.card-footer.text-end > input")
	private WebElement submittestbtn;
	
	//edit
				
	@FindBy(css="#uploadedFile")
	private WebElement uploadagainEditBtn;
	
	@FindBy(css="#nama")
	private WebElement editnama;
	
	@FindBy(css="#exampleFormControlSelect9")
	private WebElement listeditpublis;
	
	@FindBy(css="#summernote")
	private WebElement editTestiMain;
	
	@FindBy(css="#rating")
	private WebElement listeditrating;
	
	
	
	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.page-body > div:nth-child(2) > div > div > div > form > div.card-footer.text-end > input")
	private WebElement submitedittestiBtn;
	
	
	//search testimonial
	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.page-body > div:nth-child(3) > div > div > div > div.faq-form > form > input")
	private WebElement search_testimonial;
	
	//page
	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.page-body > div:nth-child(3) > div > div > div > div.my-gallery.card-body.row.gallery-with-description > div > nav > ul > li > a")
	private WebElement page_testi;

//	private void editimg() {
//		
//	}
	public void search_testimonial_item() {
		search_testimonial.sendKeys("Ahmad Saifur");
		
	}
	public void perPage_testimonial() {
		page_testi.click();
	}
	public void edit_item_testimonial() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		wait.until(ExpectedConditions.elementToBeClickable(cardone));
		cardone.click();
		uploadagainEditBtn.sendKeys("D:/ChromeDriver/penguinlinux.png");
		editnama.sendKeys("ibnu-kemal");
		lsPublish(1);
		editTestiMain.sendKeys("ibnu kemal cobain blog juara coding");
		lsRating(4);
		submitedittestiBtn.click();

	}
	public void add_item_testimonial() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		wait.until(ExpectedConditions.elementToBeClickable(menu_HomeJc));
		menu_HomeJc.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_HomeTestimonial));
		menu_HomeTestimonial.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_toogleeBar));
		menu_toogleeBar.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_toogleeBar));
		menu_toogleeBar.click();
		wait.until(ExpectedConditions.elementToBeClickable(addTestiBtn));
		addTestiBtn.click();
		formAddTesti();
		
	}
	private void formAddTesti() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		inputnametesti.sendKeys("Ibnu KemalL");
//		uploadTestPhotoBtn.click();
		uploadTestPhotoBtn.sendKeys("D:/ChromeDriver/34168.jpg");
		lsPublish(0);
		inputMainTesti.sendKeys("testimonial isiI");
		lsRating(5);
		wait.until(ExpectedConditions.elementToBeClickable(submitedittestiBtn));
		submittestbtn.click();
	}
	
	private void lsPublish(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(listpublish));

		listpublish.click();

		this.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();

	}
	
	private void lsRating(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(listrating));

		listrating.click();

		this.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();

	}
	
	
}
