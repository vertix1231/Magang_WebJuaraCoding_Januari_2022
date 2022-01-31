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

	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-block.row > div > div > table > tbody > tr:nth-child(1) > td:nth-child(8) > a")
	private WebElement programboothcampbatchitemSelected;
	@FindBy(css = "#exampleFormControlSelect9")
	private WebElement liststatusprogramboothcampitemSelected;

	@FindBy(css = "#frmregister > div.card-footer.text-end > input")
	private WebElement btnsave_editprogramboothcampitemSelected;
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-header > a")
	private WebElement btnaddprogramboothcamp;
	@FindBy(css = "#fname")
	private WebElement inputnamaprogramboothcamp;
	// awal
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-block.row > form > div > div.col-md-2 > select")
	private WebElement lissortirprogrambootcamp;

	// program batch
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(11) > ul > li:nth-child(2) > a")
	private WebElement menu_programboothcampbatch;
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-header > a")
	private WebElement btnaddprogramboothcampbatch;
	@FindBy(css = "#fname")
	private WebElement inputnamaprogramboothcampbatch;
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/form/div[2]/div/div[1]/div/select")
	private WebElement listnamaprogrambatch;
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/form/div[2]/div/div[5]/div/select")
	private WebElement liststatusprogrambatch;
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/form/div[2]/div/div[3]/div/div/input")
	private WebElement inputtglawalprogrambatch;
	@FindBy(xpath = "/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/form/div[2]/div/div[4]/div/div/input")
	private WebElement inputtglakhirprogrambatch;
	@FindBy(css = "#frmregister > div.card-footer.text-end > input")
	private WebElement btnsave_addprogramboothcampbatch;
//	@FindBy

	// program harga
	@FindBy(css = "#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(11) > ul > li:nth-child(3) > a")
	private WebElement menu_programboothcampharga;
	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-block.row > form > div > div.col-md-4 > div > input")
	private WebElement search_programboothcamp;

	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-block.row > div > div > table > tbody > tr:nth-child(1) > td:nth-child(5) > a")
	private WebElement programboothcampNamaProgramitemselected;

	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-block.row > div > div > table > tbody > tr:nth-child(1) > td:nth-child(5) > a")
	private WebElement programboothcampidProgramitemselected;

	@FindBy(css = "#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-block.row > div > div > table > tbody > tr:nth-child(2) > td:nth-child(5) > a")
	private WebElement programboothcampstatusProgramitemselected;
	
	
	
	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-block.row > div > div > table > tbody > tr:nth-child(1) > td:nth-child(6) > a")
	private WebElement programboothcamppriceitemselected;
	
	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-header > a")
	private WebElement addprogramboothcamppriceitemselected;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/form/div[2]/div/div[1]/div/select")
	private WebElement listdetailmetodeprice;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/form/div[2]/div/div[6]/div/select")
	private WebElement listdetailstatusprice;
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/form/div[2]/div/div[2]/div/input")
	private WebElement detailmetodeharga;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/form/div[2]/div/div[3]/div/div/div[1]/input")
	private WebElement detailmetodediskon;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/form/div[2]/div/div[4]/div/input")
	private WebElement detailmetodefee;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/form/div[2]/div/div[5]/div/input")
	private WebElement detailmetoderemark;
	@FindBy(xpath="/html/body/div[2]/div[2]/div[2]/div[2]/div/div/div/form/div[3]/input")
	private WebElement btndetailmetodesimpan;
	
	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.page-body > div > div:nth-child(2) > div > div > div > div.card-block.row > div > div > table > tbody > tr > td:nth-child(7) > a")
	private WebElement detaildesctmetodebayaritemselected;

	public void addprogramBoothcamp() {

		// add
		programBoothcamphome();
		save_addprogramBoothcamp();
	}

	public void initpageprogramBoothcamp() {
		// awal
		programBoothcamphome();
	}

	public void initsearchbasePage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);

		// edit
		wait.until(ExpectedConditions.elementToBeClickable(programboothcampitemSelected));
		actions.moveToElement(programboothcampitemSelected).perform();
		programboothcampitemSelected.click();
		save_editprogramBoothcamp();
		programBoothcamphome();
		
		// search and edit id prpgram item
		lssortirprogrambootcamp(1);
		wait.until(ExpectedConditions.elementToBeClickable(search_programboothcamp));
		actions.moveToElement(search_programboothcamp).perform();
		search_programboothcamp.sendKeys("bahasa web jccoding :)");
		search_programboothcamp.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(programboothcampNamaProgramitemselected));
		actions.moveToElement(programboothcampNamaProgramitemselected).perform();
		programboothcampNamaProgramitemselected.click();
		save_editprogramBoothcamp();
		programBoothcamphome();
		// search and edit nama program item
		lssortirprogrambootcamp(0);
		wait.until(ExpectedConditions.elementToBeClickable(search_programboothcamp));
		actions.moveToElement(search_programboothcamp).perform();
		search_programboothcamp.sendKeys("6");
		search_programboothcamp.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(programboothcampidProgramitemselected));
		actions.moveToElement(programboothcampidProgramitemselected).perform();
		programboothcampidProgramitemselected.click();
		save_editprogramBoothcamp();
		programBoothcamphome();
		// search and edit status item
		lssortirprogrambootcamp(2);
		wait.until(ExpectedConditions.elementToBeClickable(search_programboothcamp));
		actions.moveToElement(search_programboothcamp).perform();
		search_programboothcamp.sendKeys("active");
		search_programboothcamp.sendKeys(Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(programboothcampstatusProgramitemselected));
		actions.moveToElement(programboothcampstatusProgramitemselected).perform();
		programboothcampstatusProgramitemselected.click();
		save_editprogramBoothcampInactive();
		programBoothcamphome();
	}

	public void searchprogramBoothcamp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);

//		// search and edit id prpgram item
//		lssortirprogrambootcamp(1);
//		wait.until(ExpectedConditions.elementToBeClickable(search_programboothcamp));
//		actions.moveToElement(search_programboothcamp).perform();
//		search_programboothcamp.sendKeys("bahasa web jccoding :)");
//		search_programboothcamp.sendKeys(Keys.ENTER);
//		wait.until(ExpectedConditions.elementToBeClickable(programboothcampNamaProgramitemselected));
//		actions.moveToElement(programboothcampNamaProgramitemselected).perform();
//		programboothcampNamaProgramitemselected.click();
//		save_editprogramBoothcamp();
//		programBoothcamphome();
//		// search and edit nama program item
//		lssortirprogrambootcamp(0);
//		wait.until(ExpectedConditions.elementToBeClickable(search_programboothcamp));
//		actions.moveToElement(search_programboothcamp).perform();
//		search_programboothcamp.sendKeys("6");
//		search_programboothcamp.sendKeys(Keys.ENTER);
//		wait.until(ExpectedConditions.elementToBeClickable(programboothcampidProgramitemselected));
//		actions.moveToElement(programboothcampidProgramitemselected).perform();
//		programboothcampidProgramitemselected.click();
//		save_editprogramBoothcamp();
//		programBoothcamphome();
//		// search and edit status item
//		lssortirprogrambootcamp(2);
//		wait.until(ExpectedConditions.elementToBeClickable(search_programboothcamp));
//		actions.moveToElement(search_programboothcamp).perform();
//		search_programboothcamp.sendKeys("active");
//		search_programboothcamp.sendKeys(Keys.ENTER);
//		wait.until(ExpectedConditions.elementToBeClickable(programboothcampstatusProgramitemselected));
//		actions.moveToElement(programboothcampstatusProgramitemselected).perform();
//		programboothcampstatusProgramitemselected.click();
//		save_editprogramBoothcampInactive();
//		programBoothcamphome();

	}

	private void lssortirprogrambootcamp(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000)");

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(lissortirprogrambootcamp));

		lissortirprogrambootcamp.click();

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

	private void programBoothcamphome() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);

		wait.until(ExpectedConditions.elementToBeClickable(menu_toogleeBar));
		actions.moveToElement(menu_toogleeBar).perform();
		menu_toogleeBar.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_program));
		actions.moveToElement(menu_program).perform();
		menu_program.click();
		wait.until(ExpectedConditions.elementToBeClickable(menu_programboothcamp));
		actions.moveToElement(menu_programboothcamp).perform();
		menu_programboothcamp.click();
	}

	private void save_addprogramBoothcamp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		btnaddprogramboothcamp.click();
		inputnamaprogramboothcamp.sendKeys("sqa juara coding magang 1 2022 :)");
		lsprogram(1);
		btnsave_addprogramboothcampbatch.click();
	}

	private void save_editprogramBoothcamp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);

		wait.until(ExpectedConditions.elementToBeClickable(liststatusprogramboothcampitemSelected));
		actions.moveToElement(liststatusprogramboothcampitemSelected).perform();
		lsprogram(0);
		wait.until(ExpectedConditions.elementToBeClickable(btnsave_editprogramboothcampitemSelected));
		actions.moveToElement(btnsave_editprogramboothcampitemSelected).perform();
		btnsave_editprogramboothcampitemSelected.click();
	}

	private void save_editprogramBoothcampInactive() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);

		wait.until(ExpectedConditions.elementToBeClickable(liststatusprogramboothcampitemSelected));
		actions.moveToElement(liststatusprogramboothcampitemSelected).perform();
		lsprogram(1);
		wait.until(ExpectedConditions.elementToBeClickable(btnsave_editprogramboothcampitemSelected));
		actions.moveToElement(btnsave_editprogramboothcampitemSelected).perform();
		btnsave_editprogramboothcampitemSelected.click();
	}

	public void addprogramBoothcampbatch() {

		// add
		save_addprogramBoothcampBatch();
		programBoothcamphomeBatch();
	}

	public void initpageprogramBoothcampbatch() {
		// awal
		programBoothcamphomeBatch();
	}

	public void initsearchbasePagebatch() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);

		// edit
		wait.until(ExpectedConditions.elementToBeClickable(programboothcampbatchitemSelected));
		actions.moveToElement(programboothcampbatchitemSelected).perform();
		programboothcampbatchitemSelected.click();
		save_editprogramBoothcampBatch();
		programBoothcamphomeBatch();
	}

	public void searchprogramBoothcampbatch() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);

//		//search
		lssortirprogrambootcamp(1);
		lssortirprogrambootcamp(2);
		lssortirprogrambootcamp(3);
		lssortirprogrambootcamp(4);

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

		wait.until(ExpectedConditions.elementToBeClickable(btnaddprogramboothcampbatch));
		actions.moveToElement(btnaddprogramboothcampbatch).perform();
		btnaddprogramboothcampbatch.click();
		lsnamaprogrambatch(15);
		inputnamaprogramboothcampbatch.sendKeys("batch 1 sqa magang");
		wait.until(ExpectedConditions.elementToBeClickable(inputtglawalprogrambatch));
		actions.moveToElement(inputtglawalprogrambatch).perform();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputtglawalprogrambatch.sendKeys("01012022");
		wait.until(ExpectedConditions.elementToBeClickable(inputtglakhirprogrambatch));
		actions.moveToElement(inputtglakhirprogrambatch).perform();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		inputtglakhirprogrambatch.sendKeys("02022022");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lsstatusprogrambatch(1);
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnsave_addprogramboothcampbatch.click();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void save_editprogramBoothcampBatch() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);

		wait.until(ExpectedConditions.elementToBeClickable(liststatusprogramboothcampitemSelected));
		actions.moveToElement(liststatusprogramboothcampitemSelected).perform();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lsstatusprogrambatch(0);
		wait.until(ExpectedConditions.elementToBeClickable(btnsave_editprogramboothcampitemSelected));
		actions.moveToElement(btnsave_editprogramboothcampitemSelected).perform();
		btnsave_editprogramboothcampitemSelected.click();
	}

	private void lsnamaprogrambatch(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(listnamaprogrambatch));

		listnamaprogrambatch.click();

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

	private void lsstatusprogrambatch(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(liststatusprogrambatch));

		liststatusprogrambatch.click();

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
	public void programpriceitemeselected() {
		programboothcamppriceitemselected.click();
	}
	public void addprogrampriceitemselected() {
		addprogramboothcamppriceitemselected.click();
		lsmetodprice(1);
		lsmetodprice(0);
		lsmetodprice(2);
		detailmetodeharga.sendKeys("500000");
		detailmetodediskon.sendKeys("10");
		detailmetodefee.sendKeys("450000");
		detailmetoderemark.sendKeys("remark");
		lsstatusprice(1);
		lsstatusprice(0);
		lsstatusprice(1);
		
		btndetailmetodesimpan.click();
		
		
	
	}
	public void detailDescMetodeBayar() {
		detaildesctmetodebayaritemselected.click();
	}
	private void lsmetodprice(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;


		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(listdetailmetodeprice));

		listdetailmetodeprice.click();

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
	private void lsstatusprice(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;


		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(listdetailstatusprice));

		listdetailstatusprice.click();

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

	private void lsprogram(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(liststatusprogramboothcampitemSelected));

		liststatusprogramboothcampitemSelected.click();

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

}
