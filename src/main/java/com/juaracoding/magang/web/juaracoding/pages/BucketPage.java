package com.juaracoding.magang.web.juaracoding.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.magang.web.juaracoding.driver.DriverSingleton;

public class BucketPage {
	
	private WebDriver driver;
	
	public BucketPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "pay-button")
	private WebElement btnPay;
	
	@FindBy(xpath = "//*[@id=\"application\"]/div[1]/a")
	private WebElement btnContinue;
	
	@FindBy(xpath = "//*[@id=\"payment-list\"]/div[2]/a")
	private WebElement lstPaymentMethod;
	
	@FindBy(xpath = "//*[@id=\"bank-transfer-list\"]/div[1]/a")
	private WebElement klikBCA;
	
	@FindBy(xpath = "//*[@id=\"application\"]/div[1]/a")
	private WebElement checkAccNumb;
	
	@FindBy(xpath = "//*[@id=\"application\"]/div[1]/a")
	private WebElement btnComplete;
	
	public void clickPay() {
		btnPay.click();
	}
	
//	public void boxPayment() {
//		btnContinue.click();
//		lstPaymentMethod.click();
//		klikBCA.click();
//		checkAccNumb.click();
//	}
	
//	public void goToInvoice() {
//		btnComplete.click();
//	}
}
