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



public class ContactPage {

	private WebDriver driver;
	
	public ContactPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#navbarsMenu > ul > li")
	private List<WebElement> menuContact;
	
	public void pageContact() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		menuContact.get(4).click();
	}
	
	@FindBy(css ="#frmcontact > div:nth-child(1) > input")
	private WebElement formFullName;
	
	@FindBy(css = "#frmcontact > div:nth-child(2) > input")
	private WebElement formEmail;
	
	@FindBy(css = "#frmcontact > div:nth-child(3) > input")
	private WebElement formPhone;
	
	@FindBy(css = "#frmcontact > div:nth-child(4) > input")
	private WebElement formSubject;
	
	@FindBy(css = "#frmcontact > div:nth-child(5) > textarea")
	private WebElement formMessage;
	
	public void formContact(String name, String email, String phone, String subject, String message) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		formFullName.sendKeys(name);
		formEmail.sendKeys(email);
		formPhone.sendKeys(phone);
		formSubject.sendKeys(subject);
		formMessage.sendKeys(message);
	}
	
	@FindBy(css = "#frmcontact > button")
	private WebElement btnSend;
	
	public void sendMessage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(btnSend));
		btnSend.click();
	}
	
}
