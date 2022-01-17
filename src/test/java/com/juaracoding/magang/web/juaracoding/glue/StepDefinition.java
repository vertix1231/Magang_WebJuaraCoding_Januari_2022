package com.juaracoding.magang.web.juaracoding.glue;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.magang.web.juaracoding.config.AutomationFrameworkConfiguration;
import com.juaracoding.magang.web.juaracoding.driver.DriverSingleton;
import com.juaracoding.magang.web.juaracoding.pages.DashboardAdminPage;
import com.juaracoding.magang.web.juaracoding.pages.HomeAdminPage;
import com.juaracoding.magang.web.juaracoding.pages.LoginAdminPage;
import com.juaracoding.magang.web.juaracoding.utils.ConfigurationProperties;
import com.juaracoding.magang.web.juaracoding.utils.ConstantsDriver;
import com.juaracoding.magang.web.juaracoding.utils.Log;
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
	LoginAdminPage login;
	DashboardAdminPage dashboard;
	HomeAdminPage homeAdminPage;
	ExtentTest extentTest;
	static ExtentReports extentReports = new ExtentReports("src/main/resources/reporttest_Magang_WebJCCODING.html");

//start---------------------------------------------------------------------------------------------------------------------	
	@Autowired
	ConfigurationProperties configuration;

	@Before
	public void initializeObject() {
		DriverSingleton.getInstance(configuration.getBrowser());
		login = new LoginAdminPage();
		dashboard = new DashboardAdminPage();
		homeAdminPage = new HomeAdminPage();
		TestCase[] tests = TestCase.values();
		extentTest = extentReports.startTest(tests[Utils.testcount].getTestNama());
		Log.getLogData(Log.class.getName()); // log4j
		Log.startTest(tests[Utils.testcount].getTestNama()); // log4j
		Utils.testcount++;
	}

//1---------------------------------------------------------------------------------------------------------------------	
	@Given("^User masuk ke website Admin JuaraCoding")
	public void formLogin() {
		driver = DriverSingleton.getDriver();
		driver.get(ConstantsDriver.URL);
		Log.info("INFO: Navigating to " + ConstantsDriver.URL); // log4j
		extentTest.log(LogStatus.PASS, "Navigation to : " + ConstantsDriver.URL);
	}

	@When("^User input username dan password")
	public void User_input_username_and_password() {
		login.loginForm(configuration.getMyusername(), configuration.getPassword());
		extentTest.log(LogStatus.PASS, "User input username and password");
	}

	@Then("^User klik button Login")
	public void User_click_button_Login() {
		login.clickLogin();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		assertEquals("Good Night", dashboard.getWelcometoDashboard());// ini btw tulisannya bener2 berubah sesuai waktunya 
//		driver.get("https://dev.ptdika.com/juaracodingv1/admin/gallery");
		if (login.getWhatnewlogin().isDisplayed()) {
			System.out.println("scenario User klik button Login passed");
			extentTest.log(LogStatus.PASS, "User klik button Login");
		} else {
			System.out.println("scenario User klik button Login fail");
			extentTest.log(LogStatus.ERROR, "User klik button Login");
		}
	}

//2---------------------------------------------------------------------------------------------------------------------	
	@When("^Menampilkan List tiap menu dan pengecekan kerja tiap menu di sidebar")
	public void checkAllSidebarMenu() {
		dashboard.checkSidebarElement();
	}

	@Then("^Berhasil pengecekan dashboard balik ke halaman dashboard")
	public void dashboardCheckFinished() {
		if (dashboard.getWhatnewdashboard().isDisplayed()) {
			System.out.println("scenario Berhasil pengecekan dashboard balik ke halaman dashboard passed");
			extentTest.log(LogStatus.PASS, "Berhasil pengecekan dashboard balik ke halaman dashboard");
		} else {
			System.out.println("scenario Berhasil pengecekan dashboard balik ke halaman dashboard fail");
			extentTest.log(LogStatus.ERROR, "Berhasil pengecekan dashboard balik ke halaman dashboard");
		}
	}
//3---------------------------------------------------------------------------------------------------------------------

	@When("^Menuju form untuk menambah data profile testimonial lalu submit pertambahan tertambah di halaman awal Home")
	public void Homeone() {
		homeAdminPage.add_item_testimonial();
		System.out.println("asa");
	}

	@And("^Menuju form untuk mengubah data profile item testimonial lalu submit perubahan dari hasil search sortir")
	public void Hometwo() {
		homeAdminPage.edit_item_testimonial();
//		homePage.edit_item_testimonial();
		System.out.println("asa");
	}

	@Then("^Berhasil pengecekan menu home")
	public void Homethree() {
		System.out.println("asa");
	}

//final-----------------------------------------------------------------------------------------------------------------	

	@After
	public void closeObject() {
		extentReports.endTest(extentTest);
		extentReports.flush();
	}

}
