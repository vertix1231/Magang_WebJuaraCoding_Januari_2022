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

public class ContactMassageAdminPage {

	private WebDriver driver;

	public ContactMassageAdminPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	// CONTACT MASSAGE
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(7) > a")
	private WebElement menu_CtcMassage;
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(8) > a")
	private WebElement menu_Transaction;
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-block.row > form > div > div.col-md-2 > select")
	private WebElement listSortContactData;
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-block.row > form > div > div.col-md-4 > div > input")
	private WebElement seacrhContact;
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div:nth-child(3) > nav > ul  > li")
	private List<WebElement> pageContactList;

	public void pageContactMassage() {
		System.out.println("berhasil contact massage");
	}
	public void contactDataMassage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		wait.until(ExpectedConditions.elementToBeClickable(menu_CtcMassage));
		menu_CtcMassage.click();
		seacrhContact.sendKeys("Firman Aji");
		seacrhContact.sendKeys(Keys.ENTER);
		
//		lssorttabelContact(2);
//		lssorttabelContact(0);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		seacrhContact.sendKeys("Firman Aji");
//		seacrhContact.sendKeys(Keys.ENTER);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		lssorttabelContact(1);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		seacrhContact.sendKeys("andri@gmail.com");
//		seacrhContact.sendKeys(Keys.ENTER);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		lssorttabelContact(2);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		seacrhContact.sendKeys("2147483647");
//		seacrhContact.sendKeys(Keys.ENTER);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		lssorttabelContact(3);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		seacrhContact.sendKeys("zaza");
//		seacrhContact.sendKeys(Keys.ENTER);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		lssorttabelContact(4);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		seacrhContact.sendKeys("malam makna");
//		seacrhContact.sendKeys(Keys.ENTER);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		
		
//		pageContactList.get(0).click();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		pageContactList.get(1).click();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		pageContactList.get(0).click();
	}

	private void lssorttabelContact(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(listSortContactData));

		listSortContactData.click();

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
