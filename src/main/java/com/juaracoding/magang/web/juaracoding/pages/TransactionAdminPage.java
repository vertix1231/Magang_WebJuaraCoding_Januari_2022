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

public class TransactionAdminPage {
	private WebDriver driver;

	public TransactionAdminPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(8) > a")
	private WebElement menu_Transaction;
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(2) > a")
	private WebElement menu_dashboard;
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-header > h3")
	private WebElement listtransaction;
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-block.row > form > div > div.col-md-4 > div > input")
	private WebElement searchTransaction;
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-block.row > div > div > table > tbody > tr:nth-child(1) > td:nth-child(8) > a")
	private WebElement listtrasanctionitemSelected;
	@FindBy(css = "#frmregister > div.card-footer.text-end > input")
	private WebElement approbeverifivationEditTranssationBtn;
	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div:nth-child(3) > nav > ul > li.active.page-item > a")
	private WebElement lissortirTransaction;
	
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.sidebar-wrapper > div > div.logo-wrapper > div.toggle-sidebar")
	private WebElement menu_toogleeBar;
	
	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div:nth-child(3) > nav > ul")
	private List<WebElement> pageTrasntion;


	public WebElement getListtransaction() {
		return listtransaction;
	}

	public String getListtransactionText() {
		return listtransaction.getText();
	}

	public void pageTransation() {
//		pageTrasntion.get(0).click();
//		pageTrasntion.get(2).click();
//		pageTrasntion.get(1).click();
	}

	public void ListSearchTransactionData() {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(menu_Transaction));
		menu_Transaction.click();
		lssortirTransaksi(0);
		searchTransaction.sendKeys("P004007");
		searchTransaction.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(listtrasanctionitemSelected));
		listtrasanctionitemSelected.click();

	}

	public void detailTransationForVerification() {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(approbeverifivationEditTranssationBtn));
		approbeverifivationEditTranssationBtn.click();
	}
	public void sortirmenuTransaction() {
		lssortirTransaksi(0);
		lssortirTransaksi(1);
		lssortirTransaksi(2);
		lssortirTransaksi(3);
		lssortirTransaksi(4);
		lssortirTransaksi(5);
	}
	private void lssortirTransaksi(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(lissortirTransaction));

		lissortirTransaction.click();

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
	
	public void trasactioninitpage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		// Transaction
		wait.until(ExpectedConditions.elementToBeClickable(menu_Transaction));
		menu_Transaction.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_dashboard));
		menu_dashboard.click();
		
		
	}
}
