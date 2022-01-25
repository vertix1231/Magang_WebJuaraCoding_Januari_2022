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



public class DashboardPage {

	private WebDriver driver;
	
	public DashboardPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#frmsubrek > div > input.form-control.jc-newslette-form")
	private WebElement txtEmail;
	
	@FindBy(id = "button-addon2")
	private WebElement subscribe;
	
	@FindBy(css="#navbarsMenu > a")
	private WebElement logoutWebPeserta;
	
	@FindBy(css="#username")
	private WebElement userlogin;
	
	@FindBy(css="#password")
	private WebElement userpassword;
	
	public void logoutDashboardPeserta() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		wait.until(ExpectedConditions.elementToBeClickable(logoutWebPeserta));
		logoutWebPeserta.click();
		
		userlogin.sendKeys("");
		userpassword.sendKeys("");
	}
	public void sendEmailandSubscribe(String email) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		txtEmail.sendKeys(email);
		subscribe.click();
	}
	
	
}
