package com.juaracoding.magang.web.juaracoding.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox implements DriverStrategy {

	public WebDriver setStrategy() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"D:/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
