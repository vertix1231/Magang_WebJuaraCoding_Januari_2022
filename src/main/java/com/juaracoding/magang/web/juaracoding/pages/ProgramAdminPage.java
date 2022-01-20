package com.juaracoding.magang.web.juaracoding.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.magang.web.juaracoding.driver.DriverSingleton;

public class ProgramAdminPage {
	private WebDriver driver;

	public ProgramAdminPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	// PROGRAM
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(11) > a")
	private WebElement menu_program;
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(11) > ul > li:nth-child(1) > a")
	private WebElement menu_programboothcamp;
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(11) > ul > li:nth-child(2) > a")
	private WebElement menu_programboothcampbatch;
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(11) > ul > li:nth-child(3) > a")
	private WebElement menu_programboothcampharga;

	public void programBoothcamp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		wait.until(ExpectedConditions.elementToBeClickable(menu_program));
		actions.moveToElement(menu_program).perform();
		menu_program.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_programboothcamp));
		actions.moveToElement(menu_programboothcamp).perform();
		menu_programboothcamp.click();
		menu_program.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_programboothcampbatch));
		actions.moveToElement(menu_programboothcampbatch).perform();
		menu_programboothcampbatch.click();
		menu_program.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_programboothcampharga));
		actions.moveToElement(menu_programboothcampharga).perform();
		menu_programboothcampharga.click();
	}

	public void programBoothcampBatch() {

	}

	public void programBoothcampPrice() {

	}
}
