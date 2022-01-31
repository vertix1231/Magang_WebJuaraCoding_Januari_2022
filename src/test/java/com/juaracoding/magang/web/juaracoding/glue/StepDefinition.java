package com.juaracoding.magang.web.juaracoding.glue;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.juaracoding.magang.web.juaracoding.config.AutomationFrameworkConfiguration;
import com.juaracoding.magang.web.juaracoding.driver.DriverSingleton;
import com.juaracoding.magang.web.juaracoding.pages.AboutPage;
import com.juaracoding.magang.web.juaracoding.pages.BlogAdminPage;
import com.juaracoding.magang.web.juaracoding.pages.BlogPage;
import com.juaracoding.magang.web.juaracoding.pages.BootcampPage;
import com.juaracoding.magang.web.juaracoding.pages.ContactMassageAdminPage;
import com.juaracoding.magang.web.juaracoding.pages.ContactPage;
import com.juaracoding.magang.web.juaracoding.pages.CoursePage;
import com.juaracoding.magang.web.juaracoding.pages.DashboardAdminPage;
import com.juaracoding.magang.web.juaracoding.pages.DashboardPage;
import com.juaracoding.magang.web.juaracoding.pages.GalleryAdminPage;
import com.juaracoding.magang.web.juaracoding.pages.HomeAdminPage;
import com.juaracoding.magang.web.juaracoding.pages.LearningAdminPage;
import com.juaracoding.magang.web.juaracoding.pages.LoginAdminPage;
import com.juaracoding.magang.web.juaracoding.pages.ProgramAdminPage;
import com.juaracoding.magang.web.juaracoding.pages.RegisterPage;
import com.juaracoding.magang.web.juaracoding.pages.SettingAdminPage;
import com.juaracoding.magang.web.juaracoding.pages.SyllabusPage;
import com.juaracoding.magang.web.juaracoding.pages.TransactionAdminPage;
import com.juaracoding.magang.web.juaracoding.pages.UserAdminPage;
import com.juaracoding.magang.web.juaracoding.utils.ConfigurationProperties;
import com.juaracoding.magang.web.juaracoding.utils.ConstantsDriver;
import com.juaracoding.magang.web.juaracoding.utils.Log;
import com.juaracoding.magang.web.juaracoding.utils.TestCase;
import com.juaracoding.magang.web.juaracoding.utils.Utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)
public class StepDefinition {
	private static WebDriver driver;
	private LoginAdminPage login;
	private DashboardAdminPage dashboardAdminPage;
	private HomeAdminPage homeAdminPage;
	private LearningAdminPage learningAdminPage;
	private BlogAdminPage blogAdminPage;
	private ContactMassageAdminPage contactMassageAdminPage;
	private TransactionAdminPage transactionAdminPage;
	private UserAdminPage userAdminPage;
	private ProgramAdminPage programAdminPage;
	private GalleryAdminPage galleryAdminPage;
	private SettingAdminPage settingAdminPage;
	private DashboardPage dashboard;
	private BootcampPage bootcamp;
	private SyllabusPage syllabus;
	private CoursePage course;
	private AboutPage about;
	private BlogPage blog;
	private ContactPage contact;
	private RegisterPage regist;
	private ExtentTest extentTest;
	static ExtentReports extentReports = new ExtentReports();
	static ExtentSparkReporter htmlreporter = new ExtentSparkReporter(
			"src/main/resources/reporttest_Magang_WebJCCODING.html");

//start WEB JCODING---------------------------------------------------------------------------------------------------------------------

//MULAI TESTSTING ADMIN WEB JCODING-------------------------------------------------------------------------------------------------------------------
	@Autowired
	ConfigurationProperties configurationProperties;

	@Before
	public void initializeObject() {
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		login = new LoginAdminPage();
		dashboardAdminPage = new DashboardAdminPage();
		homeAdminPage = new HomeAdminPage();
		learningAdminPage = new LearningAdminPage();
		blogAdminPage = new BlogAdminPage();
		contactMassageAdminPage = new ContactMassageAdminPage();
		transactionAdminPage = new TransactionAdminPage();
		userAdminPage = new UserAdminPage();
		programAdminPage = new ProgramAdminPage();
		galleryAdminPage = new GalleryAdminPage();
		settingAdminPage = new SettingAdminPage();
		dashboard = new DashboardPage();
		about = new AboutPage();
//		learning = new LearningPage();
		bootcamp = new BootcampPage();
		syllabus = new SyllabusPage();
		course = new CoursePage();
		blog = new BlogPage();
		contact = new ContactPage();
		regist = new RegisterPage();
//		bucket = new BucketPage();
		TestCase[] tests = TestCase.values();
		extentTest = extentReports.createTest(tests[Utils.testcount].getTestNama());
		Log.getLogData(Log.class.getName()); // log4j
		Log.startTest(tests[Utils.testcount].getTestNama()); // log4j
		Utils.testcount++;
	}

//1---------------------------------------------------------------------------------------------------------------------	
	@Given("^User masuk ke website Admin JuaraCoding")
	public void formLogin() {
		driver = DriverSingleton.getDriver();
		driver.get(ConstantsDriver.URL_ADMIN);
		Log.info("INFO: Navigating to " + ConstantsDriver.URL_ADMIN); // log4j
		extentTest.log(Status.PASS, "Navigation to : " + ConstantsDriver.URL_ADMIN);
	}

	@When("^User input username dan password")
	public void User_input_username_and_password() {
		login.loginForm(configurationProperties.getMyusername_admin(), configurationProperties.getPassword_admin());

		System.out.println("scenario User input username dan password passed");
		extentTest.pass("User input username dan password");
	}

	@Then("^User klik button Login")
	public void User_click_button_Login() {
		login.clickLogin();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		assertEquals("Good Night", dashboard.getWelcometoDashboard());// ini btw tulisannya bener2 berubah sesuai waktunya 
//		driver.get("https://dev.ptdika.com/juaracodingv1/admin/gallery");
		if (login.getWhatnewlogin().isDisplayed()) {
			System.out.println("scenario User klik button Login passed");
			extentTest.log(Status.PASS, "User klik button Login");
		} else {
			System.out.println("scenario User klik button Login fail");
			extentTest.log(Status.FAIL, "User klik button Login");
			try {
				extentTest.fail("User klik button Login",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

//2---------------------------------------------------------------------------------------------------------------------	
	@When("^cek home admin")
	public void checkhome() {
		dashboardAdminPage.home();
		System.out.println("scenario cek home admin passed");
		extentTest.log(Status.PASS, "cek home admin");
	}

	@When("^cek learning admin")
	public void learning() {
		dashboardAdminPage.learning();
		System.out.println("scenario cek learning admin passed");
		extentTest.log(Status.PASS, "cek learning admin");
	}

	@When("^cek blog admin")
	public void checkblog() {
		dashboardAdminPage.blog();
		System.out.println("scenario cek blog admin passed");
		extentTest.log(Status.PASS, "cek blog admin");
	}

	@When("^cek contact massage admin")
	public void checkcontact() {
		dashboardAdminPage.contactmasg();
		System.out.println("scenario cek contact massage admin passed");
		extentTest.log(Status.PASS, "cek contact massage admin");
	}

	@When("^cek transaction admin")
	public void checktransaction() {
		dashboardAdminPage.transaction();
		System.out.println("scenario cek transaction admin passed");
		extentTest.log(Status.PASS, "cek transaction admin");
	}

	@When("^cek user admin")
	public void user() {
		dashboardAdminPage.user();
		System.out.println("scenario Menampilkan List tiap menu dan pengecekan kerja tiap menu di sidebar passed");
		extentTest.log(Status.PASS, "Menampilkan List tiap menu dan pengecekan kerja tiap menu di sidebar");
	}

	@When("^cek program admin")
	public void checkprogram() {
		dashboardAdminPage.program();
		System.out.println("scenario cek program admin passed");
		extentTest.log(Status.PASS, "cek program admin");
	}

	@When("^cek galeri admin")
	public void checkgaleri() {
		dashboardAdminPage.galeri();
		System.out.println("scenario cek galeri admin passed");
		extentTest.log(Status.PASS, "cek galeri admin");
	}

	@When("^cek setting admin")
	public void checkAllSidebarMenu() {
		dashboardAdminPage.setting();
		System.out.println("scenario cek setting admin passed");
		extentTest.log(Status.PASS, "cek setting admin");
	}

	@Then("^Berhasil pengecekan dashboard balik ke halaman dashboard")
	public void dashboardCheckFinished() {
		if (dashboardAdminPage.getWhatnewdashboard().isDisplayed()) {
			System.out.println("scenario Berhasil pengecekan dashboard balik ke halaman dashboard passed");
			extentTest.log(Status.PASS, "Berhasil pengecekan dashboard balik ke halaman dashboard");
		} else {
			System.out.println("scenario Berhasil pengecekan dashboard balik ke halaman dashboard fail");
			extentTest.log(Status.FAIL, "Berhasil pengecekan dashboard balik ke halaman dashboard");
			try {
				extentTest.fail("Berhasil pengecekan dashboard balik ke halaman dashboard",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
//3---------------------------------------------------------------------------------------------------------------------

	@When("^Menuju form untuk menambah data profile testimonial lalu submit pertambahan tertambah di halaman awal Home")
	public void Homeone() {
		homeAdminPage.add_item_testimonial();
		System.out.println(
				"scenario Menuju form untuk menambah data profile testimonial lalu submit pertambahan tertambah di halaman awal Home passed");
		extentTest.log(Status.PASS,
				"Menuju form untuk menambah data profile testimonial lalu submit pertambahan tertambah di halaman awal Home");
		System.out.println("Mengisi data form Testimonial");
		extentTest.log(Status.PASS, "Mengisi data form Testimonial");
	}

	@And("^Mengisi data form Testimonial")
	public void Hometwo() {
		System.out.println("Mengisi data form Testimonial");
		extentTest.log(Status.PASS, "Mengisi data form Testimonial");
	}

	@And("^Menuju form untuk mengubah data profile item testimonial lalu submit perubahan dari hasil search sortir")
	public void Homethree() {
		homeAdminPage.edit_item_testimonial();
		System.out.println(
				"scenario Menuju form untuk mengubah data profile item testimonial lalu submit perubahan dari hasil search sortir passed");
		extentTest.log(Status.PASS,
				"Menuju form untuk mengubah data profile item testimonial lalu submit perubahan dari hasil search sortir");
		System.out.println("scenario Mengisi data form yang mau di ubah lalu simpan passed");
		extentTest.log(Status.PASS, "Mengisi data form yang mau di ubah lalu simpan");

	}

	@And("^Mengisi data form yang mau di ubah lalu simpan")
	public void Homefour() {

		System.out.println("scenario Mengisi data form yang mau di ubah lalu simpan passed");
		extentTest.log(Status.PASS, "Mengisi data form yang mau di ubah lalu simpan");

	}

	@And("^Mencari data item testimonial dengan search")
	public void Homefive() {
		homeAdminPage.search_testimonial_item();
		System.out.println("scenario Mencari data item testimonial dengan search passed");
		extentTest.log(Status.PASS, "Mencari data item testimonial dengan search");

	}

	@And("^Halaman data testimonial")
	public void Homesix() {

		System.out.println("scenario Halaman data testimonial passed");
		extentTest.log(Status.PASS, "Halaman data testimonial");

	}

	@Then("^Berhasil pengecekan menu home")
	public void Homeseven() {
		if (Status.PASS != null) {
			System.out.println("scenario Berhasil pengecekan menu home passed");
			extentTest.log(Status.PASS, "Berhasil pengecekan menu home");

		} else {
			System.out.println("scenario Berhasil pengecekan menu home fail");
			extentTest.log(Status.FAIL, "Berhasil pengecekan menu home");
			try {
				extentTest.fail("Berhasil pengecekan menu home",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

//4---------------------------------------------------------------------------------------------------------------------
	@When("^Menuju halaman LMS")
	public void Learnone() {

		System.out.println("scenario Menuju halaman LMS passed");
		extentTest.log(Status.FAIL, "Menuju halaman LMS");

	}

	@And("^Menuju halaman Bootcamp")
	public void Learntwo() {
		System.out.println("scenario Menuju halaman LMS passed");
		extentTest.log(Status.FAIL, "Menuju halaman LMS");

	}

	@And("^Menuju halaman Class")
	public void Learnthree() {
		System.out.println("scenario Menuju halaman Class passed");
		extentTest.log(Status.FAIL, "Menuju halaman Class");

	}

	@And("^Menuju halaman Syllabus")
	public void Learnfour() {
		System.out.println("scenario Menuju halaman Syllabus passed");
		extentTest.log(Status.FAIL, "Menuju halaman Syllabus");
	}

	@Then("^Berhasil pengecekan Learning admin juara coding")
	public void Learnfive() {

		if (Status.PASS != null) {
			System.out.println("scenario Berhasil pengecekan Learning admin juara coding passed");
			extentTest.log(Status.FAIL, "Berhasil pengecekan Learning admin juara coding");
			try {
				extentTest.fail("Berhasil pengecekan Learning admin juara coding",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("scenario Berhasil pengecekan Learning admin juara coding fail");
			extentTest.log(Status.FAIL, "Berhasil pengecekan Learning admin juara coding");
			try {
				extentTest.fail("Berhasil pengecekan Learning admin juara coding",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

//5---------------------------------------------------------------------------------------------------------------------	
	@When("^Menuju form untuk menambah data post blog lalu submit pertambahan tertambah di halaman awal Home")
	public void Blogone() {
		blogAdminPage.add_item_testimonial();
		assertEquals("Data berhasil di tambah", blogAdminPage.getPostblogSuccesStringText());
		System.out.println(
				"scenario Menuju form untuk menambah data post blog lalu submit pertambahan tertambah di halaman awal Home passed");
		extentTest.log(Status.PASS,
				"Menuju form untuk menambah data post blog lalu submit pertambahan tertambah di halaman awal Home");
		System.out.println("scenario Mengisi data form blog passed");
		extentTest.log(Status.PASS, "Mengisi data form blog");

	}

	@And("^Mengisi data form blog")
	public void Blogtwo() {
		System.out.println("scenario Mengisi data form yang mau di ubah lalu simpan passed");
		extentTest.log(Status.PASS, "Mengisi data form yang mau di ubah lalu simpan");

	}

	@And("^Menuju form untuk mengubah data post blog item lalu submit perubahan dari hasil search sortir")
	public void Blogthree() {
		blogAdminPage.edit_item_testimonial();

		System.out.println(
				"scenario Menuju form untuk mengubah data post blog item lalu submit perubahan dari hasil search sortir passed");
		extentTest.log(Status.PASS,
				"Menuju form untuk mengubah data post blog item lalu submit perubahan dari hasil search sortir");
		System.out.println("scenario Mengisi data form yang mau di ubah lalu simpan passed");
		extentTest.log(Status.PASS, "Mengisi data form yang mau di ubah lalu simpan");

	}

	@And("^Mengisi data form yang mau di ubah lalu simpann")
	public void Blogfour() {

		System.out.println("scenario Mengisi data form yang mau di ubah lalu simpan passed");
		extentTest.log(Status.PASS, "Mengisi data form yang mau di ubah lalu simpan");

	}

	@And("^Mencari data blog")
	public void Blogfive() {
		blogAdminPage.search_item_blog();

		System.out.println("scenario Mencari data blog passed");
		extentTest.log(Status.PASS, "Mencari data blog");

	}

	@And("^Halaman data blog")
	public void Blogsix() {

		System.out.println("scenario Halaman data blog passed");
		extentTest.log(Status.PASS, "Halaman data blog");

	}

	@Then("^Berhasil pengecekan menu blog")
	public void Blogseven() {

		if (Status.PASS != null) {
			System.out.println("scenario Berhasil pengecekan menu blog passed");
			extentTest.log(Status.PASS, "Berhasil pengecekan menu blog");
		} else {
			System.out.println("scenario Berhasil pengecekan menu blog fail");
			extentTest.log(Status.FAIL, "Berhasil pengecekan menu blog");
			try {
				extentTest.fail("Berhasil pengecekan menu blog",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

//6---------------------------------------------------------------------------------------------------------------------	
	@When("^search data table Contact Message berdasarkan sortir data tiap halaman tabel")
	public void Contactone() {
		contactMassageAdminPage.contactDataMassage();

		System.out.println(
				"scenario search data table Contact Message berdasarkan sortir data tiap halaman tabel passed");
		extentTest.log(Status.PASS, "search data table Contact Message berdasarkan sortir data tiap halaman tabel");

	}

	@When("^Halaman data contact message")
	public void Contacttwo() {
		contactMassageAdminPage.pageContactMassage();

		System.out.println("scenario Halaman data contact message passed");
		extentTest.log(Status.PASS, "Halaman data contact message");

	}

	@Then("^Berhasil pengecekan menu Contact Massage")
	public void Contactthree() {
		if (Status.PASS != null) {
			System.out.println("scenario Berhasil pengecekan menu Contact Massage passed");
			extentTest.log(Status.PASS, "Berhasil pengecekan menu Contact Massage");
		} else {
			System.out.println("scenario Berhasil pengecekan menu Contact Massage fail");
			extentTest.log(Status.FAIL, "Berhasil pengecekan menu Contact Massage");
			try {
				extentTest.fail("Berhasil pengecekan menu Contact Massage",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

//7---------------------------------------------------------------------------------------------------------------------	
	@When("^search data table Contact Message berdasarkan sortir data pada  tiap halaman tabel")
	public void Transactionone() {
		transactionAdminPage.ListSearchTransactionData();
		System.out.println(
				"scenario search data table Contact Message berdasarkan sortir data pada  tiap halaman tabel passed");
		extentTest.log(Status.PASS,
				"search data table Contact Message berdasarkan sortir data pada  tiap halaman tabel");

	}

	@And("^Sorting data berdasarkan kategori yang ada")
	public void Transactiontwo() {

		System.out.println("scenario Sorting data berdasarkan kategori yang ada passed");
		extentTest.log(Status.PASS, "Sorting data berdasarkan kategori yang ada");

	}

	@And("^tombol aksi item tabel menuju form konfirasi transaksi dari peserta menu user dengan klil tombol approve")
	public void Transactionthree() {

		System.out.println(
				"scenario tombol aksi item tabel menuju form konfirasi transaksi dari peserta menu user dengan klil tombol approve passed");
		extentTest.log(Status.PASS,
				"tombol aksi item tabel menuju form konfirasi transaksi dari peserta menu user dengan klil tombol approve");

	}

	@And("^Approve transaction ke user billing")
	public void Transactionfour() {
		transactionAdminPage.detailTransationForVerification();
		System.out.println("scenario Approve transaction ke user billing passed");
		extentTest.log(Status.PASS, "Approve transaction ke user billing");

	}

	@And("^Halaman data tabel transaksi")
	public void Transactionfive() {
		transactionAdminPage.trasactioninitpage();
		transactionAdminPage.pageTransation();
		System.out.println("scenario Halaman data tabel transaksi passed");
		extentTest.log(Status.PASS, "Halaman data tabel transaksi");

	}

	@Then("^Berhasil pengecekan menu Transaction hasil di tabel user billing")
	public void Transactionsix() {
		if (Status.PASS != null) {
			System.out.println("scenario Berhasil pengecekan menu Transaction passed");
			extentTest.log(Status.PASS, "Berhasil pengecekan menu Transaction");

		} else {
			System.out.println("scenario Berhasil pengecekan menu Transaction fail");
			extentTest.log(Status.FAIL, "Berhasil pengecekan menu Transaction");
			try {
				extentTest.fail("Berhasil pengecekan menu Transaction hasil di tabel user billing",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

//8---------------------------------------------------------------------------------------------------------------------		

	@When("^tabel status pembayaran peserta/user active,pending, dan close")
	public void Userone() {
		userAdminPage.UserBilling();
		System.out.println("scenario tabel status pembayaran peserta/user active,pending, dan close passed");
		extentTest.log(Status.PASS, "tabel status pembayaran peserta/user active,pending, dan close");
	}

	@And("^tabel pembayaran User Pending")
	public void Usertwo() {
		userAdminPage.UserPending();
		System.out.println("scenario tabel pembayaran User Pending passed");
		extentTest.log(Status.PASS, "tabel pembayaran User Pending");
	}

	@And("^tabel pembayaran User Complete")
	public void Userthree() {
		userAdminPage.Usercomplete();
		System.out.println("scenario tabel pembayaran User Complete passed");
		extentTest.log(Status.PASS, "tabel pembayaran User Complete");
	}

	@And("^tabel pembayaran User Close")
	public void Userfour() {
		userAdminPage.Userclose();
		System.out.println("scenario tabel pembayaran User Close passed");
		extentTest.log(Status.PASS, "tabel pembayaran User Close");
	}

	@And("^tabel pembayaran Email Subscriber dari Web Juara coding")
	public void Userfive() {
		userAdminPage.Usersubscribe();
		System.out.println("scenario tabel pembayaran Email Subscriber dari Web Juara coding passed");
		extentTest.log(Status.PASS, "tabel pembayaran Email Subscriber dari Web Juara coding");
	}

	@And("^tabel Data Akses Employee yang dikelola oleh admin")
	public void Usersix() {
		userAdminPage.Useraccess();
		System.out.println("scenario tabel Data Akses Employee yang dikelola oleh admin passed");
		extentTest.log(Status.PASS, "tabel Data Akses Employee yang dikelola oleh admin");
	}

	@Then("^Berhasil pengecekan menu User")
	public void Userseven() {
		if (Status.PASS != null) {
			System.out.println("scenario Berhasil pengecekan menu User passed");
			extentTest.log(Status.PASS, "Berhasil pengecekan menu User");

		} else {
			System.out.println("scenario Berhasil pengecekan menu Transaction fail");
			extentTest.log(Status.FAIL, "Berhasil pengecekan menu Transaction");
			try {
				extentTest.fail("Berhasil pengecekan menu User",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

//9---------------------------------------------------------------------------------------------------------------------			
	@When("^tabel program boothcamp edit/tambah/hapus  berdasarkan sort status")
	public void Programone() {
		programAdminPage.addprogramBoothcamp();
		System.out.println("scenario tabel program boothcamp edit/tambah/hapus passed");
		extentTest.log(Status.PASS, "tabel program boothcamp edit/tambah/hapus");
	}
	@And("^Halaman awal boothcamp ke halaman tambah data boothcamp")
	public void Programtwo() {
		programAdminPage.initpageprogramBoothcamp();
		System.out.println("scenario Halaman awal boothcamp ke halaman tambah data boothcamp passed");
		extentTest.log(Status.PASS, "Halaman awal boothcamp ke halaman tambah data boothcamp");
	}
	@And("^input data tambah program boothcamp dan simpan data")
	public void Programthree() {
		programAdminPage.initsearchbasePage();
		System.out.println("scenario input data tambah program boothcamp dan simpan data passed");
		extentTest.log(Status.PASS, "input data tambah program boothcamp dan simpan data");
	}
	@And("^kembali ke halaman awal  program boothcamp melalui menu side bar program boothcamp")
	public void Programfour() {
		programAdminPage.initpageprogramBoothcamp();
		System.out.println("scenario kembali ke halaman awal  program boothcamp melalui menu side bar program boothcamp passed");
		extentTest.log(Status.PASS, "kembali ke halaman awal  program boothcamp melalui menu side bar program boothcamp");
	}
	@And("^search tabel berdasarkan nama lengkap berdasarkan drop down menu")
	public void Programfive() {
		programAdminPage.searchprogramBoothcamp();;
		System.out.println("scenario search tabel berdasarkan nama lengkap berdasarkan drop down menu passed");
		extentTest.log(Status.PASS, "search tabel berdasarkan nama lengkap berdasarkan drop down menu");
	}
	@And("^menu pengelompokan data berdasarkan semua drop down menu untuk fitur search")
	public void Programsix() {
		System.out.println("scenario menu pengelompokan data berdasarkan menu untuk fitur search passed");
		extentTest.log(Status.PASS, "menu pengelompokan data berdasarkan menu untuk fitur search");
	}
	@And("^Halaman data program bootcamp")
	public void Programseven() {
		System.out.println("scenario Halaman data program bootcamp passed");
		extentTest.log(Status.PASS, "Halaman data program bootcamp");
	}
	@And("^Halaman awal boothcamp ke halaman edit form data boothcamp")
	public void Programeight() {
		System.out.println("scenario Halaman awal boothcamp ke halaman edit form data boothcamp passed");
		extentTest.log(Status.PASS, "Halaman awal boothcamp ke halaman edit form data boothcamp");
	}
	@And("^input data perubahan nama dan status program bootcamp")
	public void Programnine() {
		System.out.println("scenario input data perubahan nama dan status program bootcamp passed");
		extentTest.log(Status.PASS, "input data perubahan nama dan status program bootcamp");
	}
	@And("^kembali ke halaman awal  program boothcamp melalui menu side bar program boothcamp dari perubahan data")
	public void Programten() {
//		programAdminPage.initpageprogramBoothcamp();
		System.out.println("scenario kembali ke halaman awal  program boothcamp melalui menu side bar program boothcamp passed");
		extentTest.log(Status.PASS, "kembali ke halaman awal  program boothcamp melalui menu side bar program boothcamp");
	}
	

	@Then("^Berhasil pengecekan menu program boothcamp")
	public void Programeleven() {
		if (Status.PASS != null) {
			System.out.println("scenario Berhasil pengecekan menu program passed");
			extentTest.log(Status.PASS, "Berhasil pengecekan menu program");

		} else {
			System.out.println("scenario Berhasil pengecekan menu program fail");
			extentTest.log(Status.FAIL, "Berhasil pengecekan menu program");
			try {
				extentTest.fail("Berhasil pengecekan menu program",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	//program batch
	@When("^tabel program boothcamp batch angkatan per periode edit/tambah/hapus")
	public void Programtwelve() {
		programAdminPage.initpageprogramBoothcampbatch();
		programAdminPage.addprogramBoothcampbatch();
		System.out.println("scenario tabel program boothcamp batch angkatan per periode edit/tambah/hapus  passed");
		extentTest.log(Status.PASS, "tabel program boothcamp batch angkatan per periode edit/tambah/hapus ");
	}
	@And("^Halaman awal boothcamp batch ke halaman tambah data boothcamp batch")
	public void Programthirteen() {
		programAdminPage.initpageprogramBoothcampbatch();
		System.out.println("scenario Halaman awal boothcamp batch ke halaman tambah data boothcamp batch passed");
		extentTest.log(Status.PASS, "Halaman awal boothcamp batch ke halaman tambah data boothcamp batch");
	}
	@And("^input data tambah program boothcamp  batch dan simpan data")
	public void Programfourteen() {
		programAdminPage.initsearchbasePagebatch();
		System.out.println("scenario input data tambah program boothcamp  batch dan simpan data passed");
		extentTest.log(Status.PASS, "input data tambah program boothcamp  batch dan simpan data");
	}
	@And("^kembali ke halaman awal  program boothcamp batch melalui menu side bar program boothcamp")
	public void Programfifteen() {
		programAdminPage.initpageprogramBoothcampbatch();
		System.out.println("scenario kembali ke halaman awal  program boothcamp melalui menu side bar program boothcamp passed");
		extentTest.log(Status.PASS, "kembali ke halaman awal  program boothcamp melalui menu side bar program boothcamp");
	}
	@And("^search tabel batch berdasarkan nama lengkap berdasarkan drop down menu")
	public void Programsixteen() {
		programAdminPage.searchprogramBoothcampbatch();;
		System.out.println("scenario search tabel batch berdasarkan nama lengkap berdasarkan drop down menu passed");
		extentTest.log(Status.PASS, "search tabel batch berdasarkan nama lengkap berdasarkan drop down menu");
	}
	@And("^menu pengelompokan data berdasarkan menu untuk fitur search batch")
	public void Programseventeen() {
		System.out.println("scenario menu pengelompokan data berdasarkan menu untuk fitur search batch passed");
		extentTest.log(Status.PASS, "menu pengelompokan data berdasarkan menu untuk fitur search batch");
	}
	@And("^Halaman data program batch")
	public void Programeightteen() {
		System.out.println("scenario Halaman data program bootcamp passed");
		extentTest.log(Status.PASS, "Halaman data program bootcamp");
	}
	@And("^Halaman awal boothcamp batch ke halaman edit data boothcamp batch")
	public void Programninthteen() {
		System.out.println("scenario Halaman awal boothcamp ke halaman edit form data boothcamp passed");
		extentTest.log(Status.PASS, "Halaman awal boothcamp ke halaman edit form data boothcamp");
	}
	@And("^input data perubahan program boothcamp batch dan simpan data")
	public void Programtwenty() {
		System.out.println("scenario input data perubahan nama dan status program bootcamp passed");
		extentTest.log(Status.PASS, "input data perubahan nama dan status program bootcamp");
	}
	@And("^kembali ke halaman awal  program boothcamp batch melalui menu side bar program boothcamp batch dari perubahan data")
	public void Programtwentytwo() {
		programAdminPage.initpageprogramBoothcampbatch();
		System.out.println("scenario kembali ke halaman awal  program boothcamp melalui menu side bar program boothcamp passed");
		extentTest.log(Status.PASS, "kembali ke halaman awal  program boothcamp melalui menu side bar program boothcamp");
	}
	@Then("^Berhasil pengecekan menu program batch")
	public void Programtwentythree() {
		if (Status.PASS != null) {
			System.out.println("scenario Berhasil pengecekan menu program passed");
			extentTest.log(Status.PASS, "Berhasil pengecekan menu program");

		} else {
			System.out.println("scenario Berhasil pengecekan menu program fail");
			extentTest.log(Status.FAIL, "Berhasil pengecekan menu program");
			try {
				extentTest.fail("Berhasil pengecekan menu program",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
	//program harga
	@When("^tabel harga paket program")
	public void Programtwentyfour() {
		programAdminPage.programBoothcampPrice();
		System.out.println("scenario tabel harga paket program passed");
		extentTest.log(Status.PASS, "tabel harga paket program");
	}
	@And("^Dari halaman awal promo harga menuju halaman detail pembayaran")
	public void Programtwentyfive() {
		programAdminPage.programpriceitemeselected();
		System.out.println("scenario Dari halaman awal promo harga menuju halaman detail pembayaran passed");
		extentTest.log(Status.PASS, "Dari halaman awal promo harga menuju halaman detail pembayaran");
	}
	@And("^dari halaman tabel detail pembayaran ke form tambah metode pembayaran detail lalu simpan form")
	public void Programtwentysix() {
		programAdminPage.addprogrampriceitemselected();
		System.out.println("scenario dari halaman tabel detail pembayaran ke form tambah metode pembayaran detail lalu simpan form passed");
		extentTest.log(Status.PASS, "dari halaman tabel detail pembayaran ke form tambah metode pembayaran detail lalu simpan form");
	}
	@And("^Halaman awal detail metode pembayaran ke halaman edit item detail metode deskripsi pembayaran")
	public void Programtwentyseven() {
//		programAdminPage.detailDescMetodeBayar();
		System.out.println("scenario Halaman awal detail metode pembayaran ke halaman edit item detail metode deskripsi pembayaran passed");
		extentTest.log(Status.PASS, "Halaman awal detail metode pembayaran ke halaman edit item detail metode deskripsi pembayaran");
	}
	@And("^input data perubahan detail pembayaran dan simpan data lalu cek tabel detail pembayaran")
	public void Programtwentyeight() {
		
		System.out.println("scenario input data perubahan detail pembayaran dan simpan data lalu cek tabel detail pembayaran passed");
		extentTest.log(Status.PASS, "input data perubahan detail pembayaran dan simpan data lalu cek tabel detail pembayaran");
	}
	@And("^halaman harga paket")
	public void Programtwentynine() {
		
		System.out.println("scenario halaman harga paket passed");
		extentTest.log(Status.PASS, "halaman harga paket");
	}
	@Then("^Berhasil pengecekan menu harga boothcamp")
	public void Programthirty() {
		if (Status.PASS != null) {
			System.out.println("scenario Berhasil pengecekan menu program passed");
			extentTest.log(Status.PASS, "Berhasil pengecekan menu program");

		} else {
			System.out.println("scenario Berhasil pengecekan menu program fail");
			extentTest.log(Status.FAIL, "Berhasil pengecekan menu program");
			try {
				extentTest.fail("Berhasil pengecekan menu program",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
	

//10---------------------------------------------------------------------------------------------------------------------
	@When("^input data tambah gallery dan simpan data")
	public void Galleryone() {
		driver = DriverSingleton.getDriver();
		driver.get("https://dev.ptdika.com/juaracodingv1/admin/gallery");
		galleryAdminPage.galleryAdd();
		galleryAdminPage.initgaleri();
		System.out.println("scenario input data tambah gallery dan simpan data passed");
		extentTest.log(Status.PASS, "input data tambah gallery dan simpan data");
	}

	@And("^mengetahui detail dari gallery untuk mengambil content detail dari search galeri")
	public void Gallerytwo() {
		galleryAdminPage.galleryEdit();
		System.out.println(
				"scenario mengetahui detail dari gallery untuk mengambil content detail dari search galeri passed");
		extentTest.log(Status.PASS, "mengetahui detail dari gallery untuk mengambil content detail dari search galeri");
	}

	@And("^Melakukan pencarian pada gallery")
	public void Gallerythree() {
		galleryAdminPage.gallerySearch();
		System.out.println(
				"scenario mengetahui detail dari gallery untuk mengambil content detail dari search galeri fail");
		extentTest.log(Status.FAIL, "mengetahui detail dari gallery untuk mengambil content detail dari search galeri");
	}

	@Then("^Berhasil pengecekan menu galeri")
	public void Galleryfour() {
		if (Status.PASS != null) {
			System.out.println("scenario Berhasil pengecekan menu galeri passed");
			extentTest.log(Status.PASS, "Berhasil pengecekan menu galeri");

		} else {
			System.out.println("scenario Berhasil pengecekan menu galeri fail");
			extentTest.log(Status.FAIL, "Berhasil pengecekan menu galeri");
			try {
				extentTest.fail("Berhasil pengecekan menu galeri",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

//11----------------------------------------------------------------------------------------------------------------------
	@When("^tambah tempalte kirim email")
	public void Settingyone() {
		settingAdminPage.settingAddTempalte();
		System.out.println("scenario tambah tempalte kirim email passed");
		extentTest.log(Status.PASS, "tambah tempalte kirim email");
	}

	@And("^edit template email yang akan dipilih")
	public void Settingytwo() {
		settingAdminPage.settingEditTempalte();
		System.out.println("scenario edit template email yang akan dipilih passed");
		extentTest.log(Status.PASS, "edit template email yang akan dipilih");
	}

	@Then("^Berhasil pengecekan menu setting")
	public void Settingthree() {
		if (Status.PASS != null) {
			System.out.println("scenario Berhasil pengecekan menu setting passed");
			extentTest.log(Status.PASS, "Berhasil pengecekan menu setting");

		} else {
			System.out.println("scenario Berhasil pengecekan menu setting fail");
			extentTest.log(Status.FAIL, "Berhasil pengecekan menu setting");
			try {
				extentTest.fail("Berhasil pengecekan menu setting",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

//AKHIR TESTSTING ADMIN WEB JCODING-------------------------------------------------------------------------------------------------------------------

//MULAI TESTSTING USER WEB JCODING-------------------------------------------------------------------------------------------------------------------

	// Menu Home
	@Given("^User masuk halaman Web Juara Coding")
	public void homePage() {

		driver = DriverSingleton.getDriver();
		driver.get(ConstantsDriver.URL_USER);
		dashboard.logoutDashboardPeserta();
		driver.get(ConstantsDriver.URL_USER);
		extentTest.log(Status.PASS, "User masuk halaman Web Juara Coding");
	}

	@Then("^User masukkan email dan tekan subscribe")
	public void User_masukkan_email_dan_tekan_subscribe() {
		dashboard.sendEmailandSubscribe(configurationProperties.getEmail_user());

		if (Status.PASS != null) {
			System.out.println("scenario User masukkan email dan tekan subscribe passed");
			extentTest.log(Status.PASS, "User masukkan email dan tekan subscribe");

		} else {
			System.out.println("scenario User masukkan email dan tekan subscribe fail");
			extentTest.log(Status.FAIL, "User masukkan email dan tekan subscribe");
			try {
				extentTest.fail("User masukkan email dan tekan subscribe",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	// Submenu Bootcamp
	// Dropdown Learning
	@When("^User click list Learning satu")
	public void User_click_list_Learning_satu() {
		bootcamp.learningDropDown();
		extentTest.log(Status.PASS, "User click list Learning satu");
	}

	@Then("^User pindah ke halaman Bootcamp")
	public void User_pindah_ke_halaman_Bootcamp() {
		driver = DriverSingleton.getDriver();
		driver.get("https://dev.ptdika.com/juaracodingv1/bootcamp");

		if (Status.PASS != null) {
			System.out.println("scenario User pindah ke halaman Bootcamp passed");
			extentTest.log(Status.PASS, "User pindah ke halaman Bootcamp");

		} else {
			System.out.println("scenario User pindah ke halaman Bootcamp fail");
			extentTest.log(Status.FAIL, "User pindah ke halaman Bootcamp");
			try {
				extentTest.fail("User pindah ke halaman Bootcamp",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	// Submenu Syllabus

	// Dropdown Learning
	@When("^User click list Learning dua")
	public void User_click_list_Learning_dua() {
		bootcamp.learningDropDown();
		extentTest.log(Status.PASS, "User click list Learning dua");
	}

	@And("^User pindah ke halaman Syllabus")
	public void User_pindah_ke_halaman_Syllabus() {
		syllabus.pageSyllabus();
		extentTest.log(Status.PASS, "User pindah ke halaman Syllabus");
	}

	@When("^User click profile tab Syllabus")
	public void User_click_profile_tab_Syllabus() {
		syllabus.ProfileTabQualification();
		extentTest.log(Status.PASS, "User click profile tab Syllabus");
	}

	@Then("^User click profile tab Qualfication")
	public void User_click_profile_tab_Qualfication() {
		syllabus.ProfileTabQualification();

		if (Status.PASS != null) {
			System.out.println("scenario User click profile tab Qualfication passed");
			extentTest.log(Status.PASS, "User click profile tab Qualfication");

		} else {
			System.out.println("scenario User click profile tab Qualfication fail");
			extentTest.log(Status.FAIL, "User click profile tab Qualfication");
			try {
				extentTest.fail("User click profile tab Qualfication",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	// Submenu Course
	@When("^User click list Learning tiga")
	public void User_click_list_Learning_tiga() {
		bootcamp.learningDropDown();
		extentTest.log(Status.PASS, "User click list Learning tiga");
	}

	@And("^User pindah ke halaman Course")
	public void User_pindah_ke_halaman_Course() {
		course.pageCourse();
		extentTest.log(Status.PASS, "User pindah ke halaman Course");
	}

	@And("^User click List Course")
	public void User_click_List_Course() {
		course.listCourse();
		extentTest.log(Status.PASS, "User click List Course");
	}

	@And("^User search Course")
	public void User_search_Course() {
		course.searchCourses(configurationProperties.getCourse_user());
		extentTest.log(Status.PASS, "User search Course");
	}

	@Then("^User click Search")
	public void User_click_Search() {
		course.clickSearch();

		if (Status.PASS != null) {
			System.out.println("scenario User click profile tab Qualfication passed");
			extentTest.log(Status.PASS, "User click Search");

		} else {
			System.out.println("scenario User click Search fail");
			extentTest.log(Status.FAIL, "User click Search");
			try {
				extentTest.fail("User click Search",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	// Menu About
	@Then("^User pindah ke halaman About")
	public void User_pindah_ke_halaman_About() {
		about.clickAbout();

		if (Status.PASS != null) {
			System.out.println("scenario User click profile tab Qualfication passed");
			extentTest.log(Status.PASS, "User pindah ke halaman About");

		} else {
			System.out.println("scenario User pindah ke halaman About fail");
			extentTest.log(Status.FAIL, "User pindah ke halaman About");
			try {
				extentTest.fail("User pindah ke halaman About",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	// Menu Blog
	@When("^User pindah ke halaman Blog")
	public void User_pindah_ke_halaman_Blog() {
		blog.menuBlog();
		extentTest.log(Status.PASS, "User pindah ke halaman Blog");
	}

	@And("^User pindah nomor halaman")
	public void User_pindah_nomor_halaman() {
		blog.clickPageNumb();
		extentTest.log(Status.PASS, "User pindah nomor halaman");
	}

	@Then("^User click Detail Blog")
	public void User_click_Detail_Blog() {
		blog.chooseBlog();

		if (Status.PASS != null) {
			System.out.println("scenario User click Detail Blog passed");
			extentTest.log(Status.PASS, "User click Detail Blog");

		} else {
			System.out.println("scenario User click Detail Blog fail");
			extentTest.log(Status.FAIL, "User click Detail Blog");
			try {
				extentTest.fail("User click Detail Blog",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	// Menu Contact
	@When("^User click Contact")
	public void User_click_Contact() {
		contact.pageContact();
		extentTest.log(Status.PASS, "User click Contact");
	}

	@And("^User input data Contact")
	public void User_input_data_Contact() {
		contact.formContact(configurationProperties.getFullname_user(), configurationProperties.getEmail2_user(), configurationProperties.getPhone_user(),
				configurationProperties.getSubject_user(), configurationProperties.getMessage_user());
		extentTest.log(Status.PASS, "User input data Contact");
	}

	@Then("^User click Send Message")
	public void User_click_Send_Message() {
		contact.sendMessage();

		if (Status.PASS != null) {
			System.out.println("scenario User click Send Message passed");
			extentTest.log(Status.PASS, "User click Send Message");

		} else {
			System.out.println("scenario User click Send Message fail");
			extentTest.log(Status.FAIL, "User click Send Message");
			try {
				extentTest.fail("User click Send Message",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	// Register Page
	@When("^User masuk halaman registrasi")
	public void User_masuk_halaman_registrasi() {
		regist.registerPage();

		if (Status.PASS != null) {
			System.out.println("scenario User masuk halaman registrasi passed");
			extentTest.log(Status.PASS, "User masuk halaman registrasi");

		} else {
			System.out.println("scenario User masuk halaman registrasi fail");
			extentTest.log(Status.FAIL, "User masuk halaman registrasi");
			try {
				extentTest.fail("User masuk halaman registrasi",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	@And("^User input formulir")
	public void User_input_formulir() {
		regist.formPendaftaran(configurationProperties.getFirstName_user(), configurationProperties.getLastName_user(),
				configurationProperties.getEmailStudents_user(), configurationProperties.getDateOfBirth_user(), configurationProperties.getAddress_user(),
				configurationProperties.getCity_user(), configurationProperties.getPostCode_user(), configurationProperties.getMobilePhone_user(),
				configurationProperties.getRelativesPhone_user(), configurationProperties.getMotivation_user());
		extentTest.log(Status.PASS, "User input formulir");

	}

	@Then("^User kirim formulir")
	public void User_kirim_formulir() {
		regist.clickSend();
		extentTest.log(Status.PASS, "User kirim formulir");
		try {
			extentTest.fail("User kirim formulir",
					MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//AKHIR TESTSTING USER WEB JCODING-------------------------------------------------------------------------------------------------------------------

//final WEB JCODING---------------------------------------------------------------------------------------------------------------------

	@After
	public void closeObject() {
		extentReports.flush();
	}

//CAPTURE PHOTO TESTING

	public static String captureScreen() throws IOException {
		TakesScreenshot screen = (TakesScreenshot) driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		String dest = "D:\\ChromeDriver\\SS ERROR TESTING\\" + getcurrentdateandtime() + ".png";
		File target = new File(dest);
		FileUtils.copyFile(src, target);
		return dest;
	}

	public static String getcurrentdateandtime() {
		String str = null;
		try {
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
			Date date = new Date();
			str = dateFormat.format(date);
			str = str.replace(" ", "-").replaceAll("/", "").replaceAll(":", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
	}

}
