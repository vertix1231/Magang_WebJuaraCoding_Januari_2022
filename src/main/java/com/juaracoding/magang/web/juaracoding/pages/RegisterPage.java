package com.juaracoding.magang.web.juaracoding.pages;

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


public class RegisterPage {

	private WebDriver driver;
	
	public RegisterPage() {
		
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="#navbarsMenu > form > a.btn.btn-red.my-2.my-sm-0")
	private WebElement btnRegister;
	
	public void registerPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(btnRegister));
		btnRegister.click();
	}
	
	//Form Registrasi
	@FindBy(css = "#id_program > option:nth-child(2)")
	private WebElement lstProgram;
	
	@FindBy(css = "#id_batch > option:nth-child(2)")
	private WebElement lstBatch;
	
	@FindBy(css = "#frmregister > div:nth-child(6) > div.switch-field > div > div.col-md-5 > label")
	private WebElement payMethod;
	
	@FindBy(css = "#frmregister > div:nth-child(8) > div > div:nth-child(1) > input")
	private WebElement formFirstName;
	
	@FindBy(css = "#frmregister > div:nth-child(8) > div > div:nth-child(2) > input")
	private WebElement formLastName;
	
	@FindBy(css = "#frmregister > div:nth-child(9) > input")
	private WebElement formEmail;
	
	@FindBy(css = "#frmregister > div:nth-child(10) > div > div:nth-child(1) > select > option:nth-child(2)")
	private WebElement gender;
	
	@FindBy(css = "#frmregister > div:nth-child(10) > div > div:nth-child(2) > input")
	private WebElement formDOB;
	
	@FindBy(css = "#frmregister > div:nth-child(11) > select > option:nth-child(4)")
	private WebElement bustle;
	
	@FindBy(css = "#frmregister > div:nth-child(12) > select > option:nth-child(3)")
	private WebElement education;
	
	@FindBy(css = "#frmregister > div:nth-child(13) > select > option:nth-child(7)")
	private WebElement majoring;
	
	@FindBy(css = "#frmregister > div:nth-child(14) > textarea")
	private WebElement txtAddress;
	
	@FindBy(css = "#frmregister > div:nth-child(15) > div > div:nth-child(1) > input")
	private WebElement txtCity;
	
	@FindBy(css = "#frmregister > div:nth-child(15) > div > div:nth-child(2) > input")
	private WebElement txtPostCode;
	
	@FindBy(css = "#frmregister > div:nth-child(16) > div > div:nth-child(1) > input")
	private WebElement txtMobilePhone;
	
	@FindBy(css = "#frmregister > div:nth-child(16) > div > div:nth-child(2) > input")
	private WebElement txtRelativesPhone;
	
	@FindBy(css = "#frmregister > div:nth-child(17) > select > option:nth-child(6)")
	private WebElement sourceProgram;
	
	@FindBy(css = "#frmregister > div:nth-child(18) > input")
	private WebElement txtMotivation;
	
	@FindBy(css = "#flexCheckChecked")
	private WebElement checkSdanK;
	
	public void formPendaftaran(String firstName, String lastName, String emailStudents, String dob, 
			String address, String city, String postCode, String mobilePhone, String relativesPhone,
			String motivation) {
		lstProgram.click();
		lstBatch.click();
		payMethod.click();
		formFirstName.sendKeys(firstName);
		formLastName.sendKeys(lastName);
		formEmail.sendKeys(emailStudents);
		gender.click();
		formDOB.sendKeys(dob);	
		bustle.click();
		education.click();
		majoring.click();
		txtAddress.sendKeys(address);
		txtCity.sendKeys(city);
		txtPostCode.sendKeys(postCode);
		txtMobilePhone.sendKeys(mobilePhone);
		txtRelativesPhone.sendKeys(relativesPhone);
		sourceProgram.click();
		txtMotivation.sendKeys(motivation);
		checkSdanK.click();
	}
	
	//Btn Send
	@FindBy(css = "#frmregister > button")
	private WebElement btnKirim;
	
	public void clickSend() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(btnKirim));
		btnKirim.click();
	}
	
	
}
