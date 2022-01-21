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

public class UserAdminPage {
	private WebDriver driver;

	public UserAdminPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.sidebar-wrapper > div > div.logo-wrapper > div.toggle-sidebar")
	private WebElement menu_toogleeBar;
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
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-block.row > div > div > table > tbody > tr:nth-child(10) > td:nth-child(9) > a")
	private WebElement userbillingitemselected;
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-block.row > div > div > table > tbody > tr:nth-child(1) > td:nth-child(9) > a")
	private WebElement userbillingUpfront;
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-block.row > form > div > div.col-md-2 > select")
	private WebElement sortirStatusbilling;
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-block.row > div > div > table > tbody > tr:nth-child(5) > td:nth-child(7) > a")
	private WebElement userbillingUpfrontDetailPayperStudent;
//	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.page-body > div.page-body-wrapper > div:nth-child(2) > div > div > div > div.card-block.row > div > div > table > tbody > tr:nth-child(3) > td:nth-child(8) > a")
//	private WebElement editcicilLunastakLunas; ga bisa
	// user pending
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-block.row > div > div > table > tbody > tr:nth-child(1) > td:nth-child(8) > a")
	private WebElement userpendingitemselected;
	@FindBy(css = "#frmregister > div.card-footer.text-end > input")
	private WebElement btnsimpanedituserpending;
	@FindBy(css = "#frmregister > div.card-header > h4 > div > a > button")
	private WebElement btnpendingbilling;
	// user complete
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-block.row > div > div > table > tbody > tr:nth-child(1) > td:nth-child(8) > a")
	private WebElement usercompleteitemselected;
	@FindBy(css = "#frmregister > div.card-footer.text-end > input")
	private WebElement btnsimpaneditusercomplete;
	@FindBy(css = "#frmregister > div.card-header > h4 > div > a > button")
	private WebElement btncompletebilling;
	// user close
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-block.row > div > div > table > tbody > tr:nth-child(1) > td:nth-child(8) > a")
	private WebElement usercloseitemselected;
	@FindBy(css = "#frmregister > div.card-footer.text-end > input")
	private WebElement btnsimpanedituserclose;
	@FindBy(css = "#frmregister > div.card-header > h4 > div > a > button")
	private WebElement btnclosebilling;
	// user subs
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-header > a")
	private WebElement btnsendemailsubs;
	@FindBy(css = "#frmregister > div.card-body > div > div.col-md-6.col-md-12 > div > select")
	private WebElement listTosendSubs;
	@FindBy(css = "#exampleFormControlSelect9")
	private WebElement listTemplateSubs;
	@FindBy(css = "#frmregister > div.card-footer.text-end > input")
	private WebElement btnsaveEmailSendSubs;
	@FindBy(css = "#frmregister > alert")
	private WebElement cekKonfirmasiEmailText;
	//user data akses web dari admin
	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.page-body > div.page-body-wrapper > div:nth-child(2) > div > div > div > div.card-block.row > div > div > table > tbody > tr:nth-child(1) > td:nth-child(7) > a")
	private WebElement userAccesSelectededititem;
	@FindBy(css="#frmregister > div.card-footer.text-end > input")
	private WebElement btnsaveuserAccesSelectededititem;

	public WebElement getCekKonfirmasiEmailText() {
		return cekKonfirmasiEmailText;
	}

	public String getCekKonfirmasiEmailTextString() {
		return cekKonfirmasiEmailText.getText();
	}

	public void UserBilling() {
		// upfront
		menu_User.click();
		menu_UserBilling.click();
		userbillingitemselected.click();
//		lssortirStatusbilling(1);
//		lssortirStatusbilling(2);
		userbillingUpfront.click();
		userbillingUpfrontDetailPayperStudent.click();
		// isa

	}

	private void lssortirStatusbilling(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(sortirStatusbilling));

		sortirStatusbilling.click();

		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();

	}

	public void UserPending() {
		menu_User.click();
		menu_UserPending.click();
		userpendingitemselected.click();
		inputeditformpending();// nanti cek lagi
		btnsimpanedituserpending.click();
		btnpendingbilling.click();
	}

	private void inputeditformpending() {

	}

	public void Usercomplete() {
		menu_User.click();
		menu_UserComplete.click();
		usercompleteitemselected.click();
		inputeditformcomplete();// nanti cek lagi
		btnsimpaneditusercomplete.click();
		btncompletebilling.click();
	}

	private void inputeditformcomplete() {

	}

	public void Userclose() {
		menu_toogleeBar.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);

		menu_User.click();
		js.executeScript("arguments[0].scrollIntoView();", menu_UserClose);
		actions.moveToElement(menu_UserClose).perform();
		menu_UserClose.click();
//		usercloseitemselected.click();
//		inputeditformclose();// nanti cek lagi
//		btnsimpanedituserclose.click();
//		btnclosebilling.click();

	}

	private void inputeditformclose() {

	}

	public void Usersubscribe() {
		menu_toogleeBar.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);

		menu_User.click();
		js.executeScript("arguments[0].scrollIntoView();", menu_Usersubs);
		actions.moveToElement(menu_Usersubs).perform();
		menu_Usersubs.click();
		sendEmailSubs();
	}

	private void sendEmailSubs() {
		btnsendemailsubs.click();
//		lstoSendSubs(1);
//		lstemplatesubs(1);
		btnsaveEmailSendSubs.click();

	}

	private void lstoSendSubs(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(listTosendSubs));

		listTosendSubs.click();

		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();

	}

	private void lstemplatesubs(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(listTemplateSubs));

		listTemplateSubs.click();

		this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();

	}

	public void Useraccess() {
		menu_toogleeBar.click();
		menu_User.click();
		menu_UserAccesEmployee.click();
		saveAccess();

	}
	
	private void saveAccess() {
		WebDriverWait wait = new WebDriverWait(driver,30);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		userAccesSelectededititem.click();
		js.executeScript("arguments[0].scrollIntoView();", btnsaveuserAccesSelectededititem);
		btnsaveuserAccesSelectededititem.click();
	}
}
