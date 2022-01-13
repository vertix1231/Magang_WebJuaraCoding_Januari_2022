package com.juaracoding.magang.web.juaracoding.glue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.magang.web.juaracoding.config.AutomationFrameworkConfiguration;
import com.juaracoding.magang.web.juaracoding.driver.DriverSingleton;
import com.juaracoding.magang.web.juaracoding.pages.LoginPage;
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
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)
public class StepDefinition {
	private WebDriver driver;
	LoginPage login;
	ExtentTest test;
	static ExtentReports report = new ExtentReports("src/main/resources/reporttest.html");
	
	@Autowired
	ConfigurationProperties configuration;
	
	@Before
	public void initializeObject() {
		DriverSingleton.getInstance(configuration.getBrowser());
		login = new LoginPage();
		TestCase[] tests = TestCase.values();
		test = report.startTest(tests[Utils.testcount].getTestNama());
		Utils.testcount++;
	}
	
	@Given("^User enter to website Admin JuaraCoding")
	public void formLogin() {
		driver = DriverSingleton.getDriver();
		driver.get(ConstantsDriver.URL);
		test.log(LogStatus.PASS, "Navigation to : "+ConstantsDriver.URL);
	}
	
	@When("^User input username and password")
	public void User_input_username_and_password() {
		login.loginForm(configuration.getMyusername(), configuration.getPassword());
		test.log(LogStatus.PASS, "User input username and password");
	}
	
	@Then ("^User click button Login")
	public void User_click_button_Login() {
		login.clickLogin();
		test.log(LogStatus.PASS, "User click button Login");
	}
	
}
