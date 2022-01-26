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



public class BlogPage {

private WebDriver driver;
	
	public BlogPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#navbarsMenu > ul > li")
	private List<WebElement> blog;
	
	@FindBy(css = "body > div.jc-section-contact > div > div.row.justify-content-center.align-items-center > nav > ul > li:nth-child(2) > a")
	private WebElement pageNumb;
	
	@FindBy(css = "body > div.jc-section-contact > div > div:nth-child(1) > div:nth-child(2) > a.fc-red.mt-2.d-block")
	private WebElement detailBlog;
	
	public void menuBlog() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		blog.get(3).click();
	}
	
	public void clickPageNumb() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(pageNumb));
		pageNumb.click();
	}
	
	public void chooseBlog() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(detailBlog));
		detailBlog.click();
	}
	
}
