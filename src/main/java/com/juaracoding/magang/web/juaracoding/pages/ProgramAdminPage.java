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

public class ProgramAdminPage {
	private WebDriver driver;

	public ProgramAdminPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.sidebar-wrapper > div > div.logo-wrapper > div.toggle-sidebar")
	private WebElement menu_toogleeBar;
	// PROGRAM
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(11) > a")
	private WebElement menu_program;
	// program boothcamp
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(11) > ul > li:nth-child(1) > a")
	private WebElement menu_programboothcamp;
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-block.row > div > div > table > tbody > tr:nth-child(1) > td:nth-child(5) > a")
	private WebElement programboothcampitemSelected;
	@FindBy(css = "#exampleFormControlSelect9")
	private WebElement liststatusprogramboothcampitemSelected;
	@FindBy(css = "#frmregister > div.card-footer.text-end > input")
	private WebElement btnsave_editprogramboothcampitemSelected;
	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-header > a")
	private WebElement btnaddprogramboothcamp;
	@FindBy(css="#fname")
	private WebElement inputnamaprogramboothcamp;
	
	// program batch
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(11) > ul > li:nth-child(2) > a")
	private WebElement menu_programboothcampbatch;
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-header > a")
	private WebElement btnaddprogramboothcampbatch;
	@FindBy(css = "#fname")
	private WebElement inputnamaprogramboothcampbatch;
	@FindBy(css="#exampleFormControlSelect9")
	private WebElement listnamaprogrambatch;
	@FindBy(css="#exampleFormControlSelect9")
	private WebElement liststatusprogrambatch;
	@FindBy(css="#datepicker-autoClose")
	private WebElement inputtglawalprogrambatch;
	@FindBy(css="#datepicker-autoClose")
	private WebElement inputtglakhirprogrambatch;
	@FindBy(css="#frmregister > div.card-footer.text-end > input")
	private WebElement btnsave_addprogramboothcampbatch;
//	@FindBy
	
	// program harga
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(11) > ul > li:nth-child(3) > a")
	private WebElement menu_programboothcampharga;
	

	
	public void programBoothcamp() {
		programBoothcamphome();
		save_addprogramBoothcamp();
		programBoothcamphome();
		save_editprogramBoothcamp();
		programBoothcamphome();
	}
	private void programBoothcamphome() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);

		menu_toogleeBar.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_program));
		actions.moveToElement(menu_program).perform();
		menu_program.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_programboothcamp));
		actions.moveToElement(menu_programboothcamp).perform();
		menu_programboothcamp.click();
	}

	private void save_addprogramBoothcamp() {
		btnaddprogramboothcamp.click();
		inputnamaprogramboothcamp.sendKeys("bahasa web jccoding tingkat medium :)");
		lsprogram(1);
		btnsave_addprogramboothcampbatch.click();
	}

	private void save_editprogramBoothcamp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);

		wait.until(ExpectedConditions.elementToBeClickable(programboothcampitemSelected));
		actions.moveToElement(programboothcampitemSelected).perform();
		programboothcampitemSelected.click();
		wait.until(ExpectedConditions.elementToBeClickable(liststatusprogramboothcampitemSelected));
		actions.moveToElement(liststatusprogramboothcampitemSelected).perform();
		lsprogram(0);
		wait.until(ExpectedConditions.elementToBeClickable(btnsave_editprogramboothcampitemSelected));
		actions.moveToElement(btnsave_editprogramboothcampitemSelected).perform();
		btnsave_editprogramboothcampitemSelected.click();
	}

	public void programBoothcampBatch() {
		programBoothcamphomeBatch();
		save_addprogramBoothcampBatch();
		programBoothcamphomeBatch();
		save_editprogramBoothcampBatch();
		programBoothcamphomeBatch();

	}
	private void programBoothcamphomeBatch() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);

		menu_toogleeBar.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_program));
		actions.moveToElement(menu_program).perform();
		menu_program.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_programboothcampbatch));
		actions.moveToElement(menu_programboothcampbatch).perform();
		menu_programboothcampbatch.click();
	}

	private void save_addprogramBoothcampBatch() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		btnaddprogramboothcampbatch.click();
		lsnamaprogrambatch(15);
		inputnamaprogramboothcampbatch.sendKeys("wj jdcoding batch januari 2022 test lagi");
		wait.until(ExpectedConditions.elementToBeClickable(inputtglawalprogrambatch));
		actions.moveToElement(inputtglawalprogrambatch).perform();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputtglawalprogrambatch.sendKeys("12122021");
		wait.until(ExpectedConditions.elementToBeClickable(inputtglakhirprogrambatch));
		actions.moveToElement(inputtglakhirprogrambatch).perform();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputtglakhirprogrambatch.sendKeys("12252021");
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lsstatusprogrambatch(1);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnsave_addprogramboothcampbatch.click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void save_editprogramBoothcampBatch() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);

//		wait.until(ExpectedConditions.elementToBeClickable(programboothcampitemSelected));
//		actions.moveToElement(programboothcampitemSelected).perform();
//		programboothcampitemSelected.click();
//		wait.until(ExpectedConditions.elementToBeClickable(liststatusprogramboothcampitemSelected));
//		actions.moveToElement(liststatusprogramboothcampitemSelected).perform();
//		lsprogramBoothcamp(2);
//		wait.until(ExpectedConditions.elementToBeClickable(btnsave_editprogramboothcampitemSelected));
//		actions.moveToElement(btnsave_editprogramboothcampitemSelected).perform();
//		btnsave_editprogramboothcampitemSelected.click();
	}
	private void lsnamaprogrambatch(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(listnamaprogrambatch));

		listnamaprogrambatch.click();

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
	private void lsstatusprogrambatch(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(listnamaprogrambatch));

		listnamaprogrambatch.click();

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

	public void programBoothcampPrice() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		menu_toogleeBar.click();

		wait.until(ExpectedConditions.elementToBeClickable(menu_program));
		actions.moveToElement(menu_program).perform();
		menu_program.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_programboothcampharga));
		actions.moveToElement(menu_programboothcampharga).perform();
		menu_programboothcampharga.click();

	}
	
	private void lsprogram(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(liststatusprogramboothcampitemSelected));

		liststatusprogramboothcampitemSelected.click();

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
}
