package com.juaracoding.magang.web.juaracoding.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

	public WebElement getListtransaction() {
		return listtransaction;
	}

	public String getListtransactionText() {
		return listtransaction.getText();
	}

	public void ListSearchTransactionData() {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(menu_Transaction));
		menu_Transaction.click();
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
}
