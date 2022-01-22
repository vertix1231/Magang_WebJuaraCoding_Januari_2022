package com.juaracoding.magang.web.juaracoding.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		blog.get(3).click();
	}
	
	public void clickPageNumb() {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		pageNumb.click();
	}
	
	public void chooseBlog() {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		detailBlog.click();
	}
	
}
