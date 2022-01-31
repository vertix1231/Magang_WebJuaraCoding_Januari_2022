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

public class BlogAdminPage {
	private WebDriver driver;

	public BlogAdminPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	//add
	@FindBy(css="#simple-bar > div.simplebar-wrapper > div.simplebar-mask > div > div > div > li:nth-child(6) > a")
	private WebElement menu_Blog;
	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.page-body > div:nth-child(3) > div > div > div > div.card-header > a")
	private WebElement addBlogbtn;
	@FindBy(css="#frmregister > div.card-body > div > div.col-md-6.col-md-12 > div > input")
	private WebElement uploadBlogBtn;
	@FindBy(css="#judul")
	private WebElement blogtitile;
	@FindBy(xpath="//*[@id=\"exampleFormControlSelect9\"]")
	private WebElement listpublish;
	@FindBy(xpath="//*[@id=\"exampleFormControlSelect9\"]")
	private WebElement listsethome;
	
	@FindBy(css="#frmregister > div.card-body > div > div:nth-child(5) > div > textarea")
	private WebElement blogcontentpreview;
	@FindBy(css="#frmregister > div.card-body > div > div:nth-child(6) > div > div > div.note-editing-area > div.note-editable.card-block")
	private WebElement blogcontent;
	@FindBy(css="#frmregister > div.card-footer.text-end > input")
	private WebElement submitblogadd;
	@FindBy(css="#frmregister > alert")
	private WebElement postblogSucces;
	//edit
	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.page-body > div:nth-child(3) > div > div > div > div.faq-form > form > input")
	private WebElement seacrhBlog;
	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.page-body > div:nth-child(3) > div > div > div > div.my-gallery.card-body.row.gallery-with-description > figure > a")
	private WebElement blogSelectitem;
	@FindBy(css="#filename")
	private WebElement uploadeditBlogImgt;
	@FindBy(css="#exampleFormControlSelect9")
	private WebElement listpublishedit;
	@FindBy(css="#exampleFormControlSelect9")
	private WebElement listsetToHome;
	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.page-body > div:nth-child(2) > div > div > div > form > div.card-body > div > div:nth-child(5) > div > textarea")
	private WebElement blogeditcontentpreview;
	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.page-body > div:nth-child(2) > div > div > div > form > div.card-body > div > div:nth-child(6) > div > div > div.note-editing-area > textarea")
	private WebElement blogeditcontent;
	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.page-body > div:nth-child(2) > div > div > div > form > div.card-footer.text-end > input")
	private WebElement submitblogedit;
	@FindBy(css="#pageWrapper > div.page-body-wrapper > div.page-body > div:nth-child(3) > div > div > div > div.my-gallery.card-body.row.gallery-with-description > div > nav > ul > li:nth-child(2) > a")
	private WebElement perPage_blog;
	

	
	public WebElement getPostblogSuccesElement() {
		return postblogSucces;
	}

	public String getPostblogSuccesStringText() {
		return postblogSucces.getText();
	}

	public void pageBlog() {
		perPage_blog.click();
	}
	public void search_item_blog() {
		seacrhBlog.sendKeys("Apa itu Javascript?");
	}
	public void add_item_testimonial() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		@SuppressWarnings("unused")
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		
		wait.until(ExpectedConditions.elementToBeClickable(menu_Blog));
		menu_Blog.click();
		wait.until(ExpectedConditions.elementToBeClickable(addBlogbtn));
		addBlogbtn.click();
		uploadBlogBtn.sendKeys("D:/ChromeDriver/ibnu2.jpg");
		blogtitile.sendKeys("testing blog 02");
//		lsPublishblog(1);
//		lsSetHomehblog(1);
		blogcontentpreview.sendKeys("blog bagi orang yang ingin coba coba");
		blogcontent.sendKeys("detail adadadad dari blog bagi orang yang ingin coba coba");
		wait.until(ExpectedConditions.elementToBeClickable(submitblogadd));
		submitblogadd.click();
	}
	public void edit_item_testimonial() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
	
		wait.until(ExpectedConditions.elementToBeClickable(menu_Blog));
		menu_Blog.click();
		seacrhBlog.sendKeys("blog coba coba aja5");
		seacrhBlog.sendKeys(Keys.ENTER);
//		js.executeScript("arguments[0].scrollIntoView();", blogSelectitem);
		wait.until(ExpectedConditions.elementToBeClickable(blogSelectitem));
		actions.moveToElement(blogSelectitem).perform();
		blogSelectitem.click();
		wait.until(ExpectedConditions.elementToBeClickable(uploadeditBlogImgt));
		actions.moveToElement(uploadeditBlogImgt).perform();
		uploadeditBlogImgt.sendKeys("D:/ChromeDriver/ibnu.jpg");
		
//		lsPublishblog(1);
//		lsSetHomehblog(1);
//		blogeditcontentpreview.sendKeys("blog edit edit edit bagi orang yang ingin coba coba");
//		blogeditcontent.sendKeys("detail edit edit edit adadadad dari blog bagi orang yang ingin coba coba");
		wait.until(ExpectedConditions.elementToBeClickable(submitblogedit));
		actions.moveToElement(submitblogedit).perform();
//		wait.until(ExpectedConditions.elementToBeClickable(submitblogedit));
		submitblogedit.click();
	}
	
	private void lsPublishblog(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(listpublish));

		listpublish.click();

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
	
	private void lsSetHomehblog(int selection) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(listsethome));

		listsethome.click();

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
