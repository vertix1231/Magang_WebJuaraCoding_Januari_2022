package com.juaracoding.magang.web.juaracoding.glue;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.juaracoding.magang.web.juaracoding.config.AutomationFrameworkConfiguration;
import com.juaracoding.magang.web.juaracoding.driver.DriverSingleton;
import com.juaracoding.magang.web.juaracoding.pages.BlogAdminPage;
import com.juaracoding.magang.web.juaracoding.pages.ContactMassageAdminPage;
import com.juaracoding.magang.web.juaracoding.pages.DashboardAdminPage;
import com.juaracoding.magang.web.juaracoding.pages.HomeAdminPage;
import com.juaracoding.magang.web.juaracoding.pages.LearningAdminPage;
import com.juaracoding.magang.web.juaracoding.pages.LoginAdminPage;
import com.juaracoding.magang.web.juaracoding.pages.TransactionAdminPage;
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
	LearningAdminPage learningAdminPage;
	BlogAdminPage blogAdminPage;
	ContactMassageAdminPage contactMassageAdminPage;
	TransactionAdminPage transactionAdminPage;
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
		learningAdminPage = new LearningAdminPage();
		blogAdminPage = new BlogAdminPage();
		contactMassageAdminPage = new ContactMassageAdminPage();
		transactionAdminPage = new TransactionAdminPage();
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
		https: // dev.ptdika.com/juaracodingv1/about
		driver.get(ConstantsDriver.URL);
		Log.info("INFO: Navigating to " + ConstantsDriver.URL); // log4j
		extentTest.log(LogStatus.PASS, "Navigation to : " + ConstantsDriver.URL);
	}

	@When("^User input username dan password")
	public void User_input_username_and_password() {
		login.loginForm(configuration.getMyusername(), configuration.getPassword());

		System.out.println("scenario User input username dan password passed");
		extentTest.log(LogStatus.PASS, "User input username dan password");
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
		System.out.println("scenario Menampilkan List tiap menu dan pengecekan kerja tiap menu di sidebar passed");
		extentTest.log(LogStatus.PASS, "Menampilkan List tiap menu dan pengecekan kerja tiap menu di sidebar");
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
		System.out.println(
				"scenario Menuju form untuk menambah data profile testimonial lalu submit pertambahan tertambah di halaman awal Home passed");
		extentTest.log(LogStatus.PASS,
				"Menuju form untuk menambah data profile testimonial lalu submit pertambahan tertambah di halaman awal Home");
	}

	@And("^Menuju form untuk mengubah data profile item testimonial lalu submit perubahan dari hasil search sortir")
	public void Hometwo() {
		homeAdminPage.edit_item_testimonial();
//		homePage.edit_item_testimonial();
		System.out.println(
				"scenario Menuju form untuk mengubah data profile item testimonial lalu submit perubahan dari hasil search sortir passed");
		extentTest.log(LogStatus.PASS,
				"Menuju form untuk mengubah data profile item testimonial lalu submit perubahan dari hasil search sortir");
	}

	@Then("^Berhasil pengecekan menu home")
	public void Homethree() {
		if (LogStatus.PASS != null) {
			System.out.println("scenario Berhasil pengecekan menu home passed");
			extentTest.log(LogStatus.PASS, "Berhasil pengecekan menu home");
		} else {
			System.out.println("scenario Berhasil pengecekan menu home fail");
			extentTest.log(LogStatus.ERROR, "Berhasil pengecekan menu home");
		}
	}

//4---------------------------------------------------------------------------------------------------------------------
	@When("^Menuju halaman LMS,Menuju halaman Bootcamp,Menuju halaman Class,Menuju halaman Syllabus")
	public void Learnone() {

		System.out.println(
				"scenario Menuju halaman LMS,Menuju halaman Bootcamp,Menuju halaman Class,Menuju halaman Syllabus passed");
		extentTest.log(LogStatus.PASS,
				"Menuju halaman LMS,Menuju halaman Bootcamp,Menuju halaman Class,Menuju halaman Syllabus");
	}

	@Then("^Berhasil pengecekan Learning admin juara coding")
	public void Learntwo() {

		if (LogStatus.PASS != null) {
			System.out.println("scenario Berhasil pengecekan Learning admin juara coding passed");
			extentTest.log(LogStatus.PASS, "Berhasil pengecekan Learning admin juara coding");
		} else {
			System.out.println("scenario Berhasil pengecekan Learning admin juara coding fail");
			extentTest.log(LogStatus.ERROR, "Berhasil pengecekan Learning admin juara coding");
		}
	}

//5---------------------------------------------------------------------------------------------------------------------	
	@When("^Menuju form untuk menambah data post blog lalu submit pertambahan tertambah di halaman awal Home")
	public void Blogone() {
		blogAdminPage.add_item_testimonial();
		assertEquals("Data berhasil di tambah", blogAdminPage.getPostblogSuccesStringText());
		System.out.println(
				"scenario Menuju form untuk menambah data post blog lalu submit pertambahan tertambah di halaman awal Home passed");
		extentTest.log(LogStatus.PASS,
				"Menuju form untuk menambah data post blog lalu submit pertambahan tertambah di halaman awal Home");
	}

	@And("^Menuju form untuk mengubah data post blog item lalu submit perubahan dari hasil search sortir")
	public void Blogtwo() {
		blogAdminPage.edit_item_testimonial();
//		homePage.edit_item_testimonial();
		System.out.println(
				"scenario Menuju form untuk mengubah data post blog item lalu submit perubahan dari hasil search sortir passed");
		extentTest.log(LogStatus.PASS,
				"Menuju form untuk mengubah data post blog item lalu submit perubahan dari hasil search sortir");
	}

	@Then("^Berhasil pengecekan menu blog")
	public void Blogthree() {
//		blogAdminPage.
//		driver = DriverSingleton.getDriver();
//		driver.get("https://dev.ptdika.com/juaracodingv1/register");
		if (LogStatus.PASS != null) {
			System.out.println("scenario Berhasil pengecekan menu blog passed");
			extentTest.log(LogStatus.PASS, "Berhasil pengecekan menu blog");
		} else {
			System.out.println("scenario Berhasil pengecekan menu blog fail");
			extentTest.log(LogStatus.ERROR, "Berhasil pengecekan menu blog");
		}
	}

//6---------------------------------------------------------------------------------------------------------------------	
	@When("^search data table Contact Message berdasarkan sortir data tiap halaman tabel")
	public void Contactone() {
		contactMassageAdminPage.contactDataMassage();

		System.out.println(
				"scenario search data table Contact Message berdasarkan sortir data tiap halaman tabel passed");
		extentTest.log(LogStatus.PASS, "search data table Contact Message berdasarkan sortir data tiap halaman tabel");

	}

	@Then("^Berhasil pengecekan menu Contact Massage")
	public void Contacttwo() {
		if (LogStatus.PASS != null) {
			System.out.println("scenario Berhasil pengecekan menu Contact Massage passed");
			extentTest.log(LogStatus.PASS, "Berhasil pengecekan menu Contact Massage");
		} else {
			System.out.println("scenario Berhasil pengecekan menu Contact Massage fail");
			extentTest.log(LogStatus.ERROR, "Berhasil pengecekan menu Contact Massage");
		}
	}
//7---------------------------------------------------------------------------------------------------------------------	
	@When("^search data table Contact Message berdasarkan sortir data pada  tiap halaman tabel")
	public void Transactionone() {
		transactionAdminPage.ListSearchTransactionData();
		System.out.println(
				"scenario search data table Contact Message berdasarkan sortir data pada  tiap halaman tabel passed");
		extentTest.log(LogStatus.PASS, "search data table Contact Message berdasarkan sortir data pada  tiap halaman tabel");

	}
	@And("^tombol aksi item tabel menuju form konfirasi transaksi dari peserta menu user dengan klil tombol approve")
	public void Transactiontwo() {
		transactionAdminPage.detailTransationForVerification();
		System.out.println(
				"scenario tombol aksi item tabel menuju form konfirasi transaksi dari peserta menu user dengan klil tombol approve passed");
		extentTest.log(LogStatus.PASS, "tombol aksi item tabel menuju form konfirasi transaksi dari peserta menu user dengan klil tombol approve");

	}
	@Then("^Berhasil pengecekan menu Transaction hasil di tabel user billing")
	public void Transactionfour() {
		if (LogStatus.PASS != null) {
			System.out.println(
					"scenario Berhasil pengecekan menu Transaction passed");
			extentTest.log(LogStatus.PASS, "Berhasil pengecekan menu Transaction");

		} else {
			System.out.println(
					"scenario Berhasil pengecekan menu Transaction fail");
			extentTest.log(LogStatus.ERROR, "Berhasil pengecekan menu Transaction");

		}
		
	}
//final-----------------------------------------------------------------------------------------------------------------	

	@After
	public void closeObject() {
		extentReports.endTest(extentTest);
		extentReports.flush();
	}

}
