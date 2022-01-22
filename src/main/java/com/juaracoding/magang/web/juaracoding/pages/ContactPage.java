package com.juaracoding.magang.web.juaracoding.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
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
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		formFullName.sendKeys(name);
		formEmail.sendKeys(email);
		formPhone.sendKeys(phone);
		formSubject.sendKeys(subject);
		formMessage.sendKeys(message);
	}
	
	@FindBy(css = "#frmcontact > button")
	private WebElement btnSend;
	
	public void sendMessage() {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		btnSend.click();
	}
	
}
