package com.juaracoding.magang.web.juaracoding.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.magang.web.juaracoding.driver.DriverSingleton;

public class LoginAdminPage {

	private WebDriver driver;
	
	public LoginAdminPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(css="#frmlogin > div:nth-child(3) > input")
	private WebElement btnLogin;
	
	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.page-body > div:nth-child(2) > div > div.col-xl-4.col-lg-12.xl-50.morning-sec.box-col-12 > div > div > div.greeting-user.text-center > div.whatsnew-btn > a")
	private WebElement whatnew;
	
	public WebElement getWhatnewlogin() {
		return whatnew;
	}

	public void loginForm(String username, String password) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(txtUserName));
		txtUserName.sendKeys(username);
		wait.until(ExpectedConditions.elementToBeClickable(txtPassword));
		txtPassword.sendKeys(password);
	}
	
	public void clickLogin() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
		btnLogin.click();
	}
}
