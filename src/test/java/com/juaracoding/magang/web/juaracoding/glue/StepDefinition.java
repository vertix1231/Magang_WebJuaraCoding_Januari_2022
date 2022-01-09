package com.juaracoding.magang.web.juaracoding.glue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.magang.web.juaracoding.config.AutomationFrameworkConfiguration;
import com.juaracoding.magang.web.juaracoding.driver.DriverSingleton;
import com.juaracoding.magang.web.juaracoding.utils.ConfigurationProperties;
import com.juaracoding.magang.web.juaracoding.utils.ConstantsDriver;
import com.juaracoding.magang.web.juaracoding.utils.TestCase;
import com.juaracoding.magang.web.juaracoding.utils.Utils;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)
public class StepDefinition {
	private WebDriver driver;
//	private HomePage homepage;
//	private MyAccountPage myaccountpage;
//	private LoginPageWP loginpagewp;
//	private CartPage cartpage;
//	private ShopPage shoppage;
	ExtentTest test;
	static ExtentReports report = new ExtentReports("src/main/resources/reporttest.html");
	
	@Autowired
	ConfigurationProperties configuration;
	
	@Before
	public void initializeObject() {
		DriverSingleton.getInstance(configuration.getBrowser());
//		homepage = new HomePage();
//		myaccountpage = new MyAccountPage();
//		loginpagewp = new LoginPageWP();
//		cartpage = new CartPage();
//		shoppage = new ShopPage();
		TestCase[] tests = TestCase.values();
		test = report.startTest(tests[Utils.testcount].getTestNama());
		Utils.testcount++;
	}
	
	
}
