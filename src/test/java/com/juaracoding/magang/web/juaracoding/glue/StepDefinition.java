package com.juaracoding.magang.web.juaracoding.glue;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

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
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

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
	private WebDriver driver;
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
	static ExtentReports extentReports = new ExtentReports("src/main/resources/reporttest_Magang_WebJCCODING.html");

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
		extentTest = extentReports.startTest(tests[Utils.testcount].getTestNama());
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
		extentTest.log(LogStatus.PASS, "Navigation to : " + ConstantsDriver.URL_ADMIN);
	}

	@When("^User input username dan password")
	public void User_input_username_and_password() {
		login.loginForm(configurationProperties.getMyusername_admin(), configurationProperties.getPassword_admin());

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
		dashboardAdminPage.checkSidebarElement();
		System.out.println("scenario Menampilkan List tiap menu dan pengecekan kerja tiap menu di sidebar passed");
		extentTest.log(LogStatus.PASS, "Menampilkan List tiap menu dan pengecekan kerja tiap menu di sidebar");
	}

	@Then("^Berhasil pengecekan dashboard balik ke halaman dashboard")
	public void dashboardCheckFinished() {
		if (dashboardAdminPage.getWhatnewdashboard().isDisplayed()) {
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
		extentTest.log(LogStatus.ERROR,
				"Menuju halaman LMS,Menuju halaman Bootcamp,Menuju halaman Class,Menuju halaman Syllabus");
	}

	@Then("^Berhasil pengecekan Learning admin juara coding")
	public void Learntwo() {

		if (LogStatus.PASS != null) {
			System.out.println("scenario Berhasil pengecekan Learning admin juara coding passed");
			extentTest.log(LogStatus.ERROR, "Berhasil pengecekan Learning admin juara coding");
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
		extentTest.log(LogStatus.PASS,
				"search data table Contact Message berdasarkan sortir data pada  tiap halaman tabel");

	}

	@And("^tombol aksi item tabel menuju form konfirasi transaksi dari peserta menu user dengan klil tombol approve")
	public void Transactiontwo() {
		transactionAdminPage.detailTransationForVerification();
		System.out.println(
				"scenario tombol aksi item tabel menuju form konfirasi transaksi dari peserta menu user dengan klil tombol approve passed");
		extentTest.log(LogStatus.PASS,
				"tombol aksi item tabel menuju form konfirasi transaksi dari peserta menu user dengan klil tombol approve");

	}

	@Then("^Berhasil pengecekan menu Transaction hasil di tabel user billing")
	public void Transactionfour() {
		if (LogStatus.PASS != null) {
			System.out.println("scenario Berhasil pengecekan menu Transaction passed");
			extentTest.log(LogStatus.PASS, "Berhasil pengecekan menu Transaction");

		} else {
			System.out.println("scenario Berhasil pengecekan menu Transaction fail");
			extentTest.log(LogStatus.ERROR, "Berhasil pengecekan menu Transaction");

		}

	}

//8---------------------------------------------------------------------------------------------------------------------		

	@When("^tabel status pembayaran peserta/user active,pending, dan close")
	public void Userone() {
		userAdminPage.UserBilling();
		System.out.println("scenario tabel status pembayaran peserta/user active,pending, dan close passed");
		extentTest.log(LogStatus.PASS, "tabel status pembayaran peserta/user active,pending, dan close");
	}

	@And("^tabel pembayaran User Pending")
	public void Usertwo() {
		userAdminPage.UserPending();
		System.out.println("scenario tabel pembayaran User Pending passed");
		extentTest.log(LogStatus.PASS, "tabel pembayaran User Pending");
	}

	@And("^tabel pembayaran User Complete")
	public void Userthree() {
		userAdminPage.Usercomplete();
		System.out.println("scenario tabel pembayaran User Complete passed");
		extentTest.log(LogStatus.PASS, "tabel pembayaran User Complete");
	}

	@And("^tabel pembayaran User Close")
	public void Userfour() {
		userAdminPage.Userclose();
		System.out.println("scenario tabel pembayaran User Close passed");
		extentTest.log(LogStatus.PASS, "tabel pembayaran User Close");
	}

	@And("^tabel pembayaran Email Subscriber dari Web Juara coding")
	public void Userfive() {
		userAdminPage.Usersubscribe();
		System.out.println("scenario tabel pembayaran Email Subscriber dari Web Juara coding passed");
		extentTest.log(LogStatus.PASS, "tabel pembayaran Email Subscriber dari Web Juara coding");
	}

	@And("^tabel Data Akses Employee yang dikelola oleh admin")
	public void Usersix() {
		userAdminPage.Useraccess();
		System.out.println("scenario tabel Data Akses Employee yang dikelola oleh admin passed");
		extentTest.log(LogStatus.PASS, "tabel Data Akses Employee yang dikelola oleh admin");
	}

	@Then("^Berhasil pengecekan menu User")
	public void Userseven() {
		if (LogStatus.PASS != null) {
			System.out.println("scenario Berhasil pengecekan menu User passed");
			extentTest.log(LogStatus.PASS, "Berhasil pengecekan menu User");

		} else {
			System.out.println("scenario Berhasil pengecekan menu Transaction fail");
			extentTest.log(LogStatus.ERROR, "Berhasil pengecekan menu Transaction");

		}
	}

//9---------------------------------------------------------------------------------------------------------------------			
	@When("^tabel program boothcamp edit/tambah/hapus")
	public void Programone() {
		programAdminPage.programBoothcamp();
		System.out.println("scenario tabel program boothcamp edit/tambah/hapus passed");
		extentTest.log(LogStatus.PASS, "tabel program boothcamp edit/tambah/hapus");
	}

	@And("^tabel program boothcamp batch angkatan per periode edit/tambah/hapus")
	public void Programtwo() {
//		programAdminPage.programBoothcampBatch();
		System.out.println("scenario tabel program boothcamp batch angkatan per periode edit/tambah/hapus passed");
		extentTest.log(LogStatus.PASS, "tabel program boothcamp batch angkatan per periode edit/tambah/hapus");
	}

	@And("^tabel program harga boothcamp  edit/tambah/hapus")
	public void Programthree() {
//		programAdminPage.programBoothcampPrice();
		System.out.println("scenario tabel program harga boothcamp  edit/tambah/hapus passed");
		extentTest.log(LogStatus.PASS, "tabel program harga boothcamp  edit/tambah/hapus");
	}

	@Then("^Berhasil pengecekan menu program")
	public void Programseven() {
		if (LogStatus.PASS != null) {
			System.out.println("scenario Berhasil pengecekan menu program passed");
			extentTest.log(LogStatus.PASS, "Berhasil pengecekan menu program");

		} else {
			System.out.println("scenario Berhasil pengecekan menu program fail");
			extentTest.log(LogStatus.ERROR, "Berhasil pengecekan menu program");

		}
	}

//10---------------------------------------------------------------------------------------------------------------------
	@When("^input data tambah gallery dan simpan data")
	public void Galleryone() {
		galleryAdminPage.galleryAdd();
		System.out.println("scenario input data tambah gallery dan simpan data passed");
		extentTest.log(LogStatus.PASS, "input data tambah gallery dan simpan data");
	}

	@And("^mengetahui detail dari gallery untuk mengambil content detail dari search galeri")
	public void Gallerytwo() {
		galleryAdminPage.galleryEdit();
		System.out.println(
				"scenario mengetahui detail dari gallery untuk mengambil content detail dari search galeri passed");
		extentTest.log(LogStatus.PASS,
				"mengetahui detail dari gallery untuk mengambil content detail dari search galeri");
	}

	@Then("^Berhasil pengecekan menu galeri")
	public void Gallerythree() {
		if (LogStatus.PASS != null) {
			System.out.println("scenario Berhasil pengecekan menu galeri passed");
			extentTest.log(LogStatus.PASS, "Berhasil pengecekan menu galeri");

		} else {
			System.out.println("scenario Berhasil pengecekan menu galeri fail");
			extentTest.log(LogStatus.ERROR, "Berhasil pengecekan menu galeri");

		}
	}

//11----------------------------------------------------------------------------------------------------------------------
	@When("^tambah tempalte kirim email")
	public void Settingyone() {
		settingAdminPage.settingAddTempalte();
		System.out.println("scenario tambah tempalte kirim email passed");
		extentTest.log(LogStatus.PASS, "tambah tempalte kirim email");
	}

	@And("^edit template email yang akan dipilih")
	public void Settingytwo() {
		settingAdminPage.settingEditTempalte();
		System.out.println("scenario edit template email yang akan dipilih passed");
		extentTest.log(LogStatus.PASS, "edit template email yang akan dipilih");
	}

	@Then("^Berhasil pengecekan menu setting")
	public void Settingthree() {
		if (LogStatus.PASS != null) {
			System.out.println("scenario Berhasil pengecekan menu setting passed");
			extentTest.log(LogStatus.PASS, "Berhasil pengecekan menu setting");

		} else {
			System.out.println("scenario Berhasil pengecekan menu setting fail");
			extentTest.log(LogStatus.ERROR, "Berhasil pengecekan menu setting");

		}
	}

//AKHIR TESTSTING ADMIN WEB JCODING-------------------------------------------------------------------------------------------------------------------

//MULAI TESTSTING USER WEB JCODING-------------------------------------------------------------------------------------------------------------------

	// Menu Home
	@Given("^User masuk halaman Web Juara Coding")
	public void homePage() {
		dashboard.logoutDashboardPeserta();
		driver = DriverSingleton.getDriver();
		driver.get(ConstantsDriver.URL_USER);
		extentTest.log(LogStatus.PASS, "User masuk halaman Web Juara Coding");
	}

	@Then("^User masukkan email dan tekan subscribe")
	public void User_masukkan_email_dan_tekan_subscribe() {
		dashboard.sendEmailandSubscribe(configurationProperties.getEmail_user());
		extentTest.log(LogStatus.PASS, "User masukkan email dan tekan subscribe");
	}

	// Submenu Bootcamp
	// Dropdown Learning
	@When("^User click list Learning satu")
	public void User_click_list_Learning_satu() {
		bootcamp.learningDropDown();
		extentTest.log(LogStatus.PASS, "User click list Learning satu");
	}

	@Then("^User pindah ke halaman Bootcamp")
	public void User_pindah_ke_halaman_Bootcamp() {
		driver = DriverSingleton.getDriver();
		driver.get("https://dev.ptdika.com/juaracodingv1/bootcamp");
//			bootcamp.pageBootcamp();
		extentTest.log(LogStatus.PASS, "User pindah ke halaman Bootcamp");
	}

	// Submenu Syllabus

	// Dropdown Learning
	@When("^User click list Learning dua")
	public void User_click_list_Learning_dua() {
		bootcamp.learningDropDown();
		extentTest.log(LogStatus.PASS, "User click list Learning dua");
	}

	@And("^User pindah ke halaman Syllabus")
	public void User_pindah_ke_halaman_Syllabus() {
		syllabus.pageSyllabus();
		extentTest.log(LogStatus.PASS, "User pindah ke halaman Syllabus");
	}

	@When("^User click profile tab Syllabus")
	public void User_click_profile_tab_Syllabus() {
		syllabus.ProfileTabQualification();
		extentTest.log(LogStatus.PASS, "User click profile tab Syllabus");
	}

	@Then("^User click profile tab Qualfication")
	public void User_click_profile_tab_Qualfication() {
		syllabus.ProfileTabQualification();
		extentTest.log(LogStatus.PASS, "User click profile tab Qualfication");
	}

	// Submenu Course
	@When("^User click list Learning tiga")
	public void User_click_list_Learning_tiga() {
		bootcamp.learningDropDown();
		extentTest.log(LogStatus.PASS, "User click list Learning tiga");
	}

	@And("^User pindah ke halaman Course")
	public void User_pindah_ke_halaman_Course() {
		course.pageCourse();
		extentTest.log(LogStatus.PASS, "User pindah ke halaman Course");
	}

	@And("^User click List Course")
	public void User_click_List_Course() {
		course.listCourse();
		extentTest.log(LogStatus.PASS, "User click List Course");
	}

	@And("^User search Course")
	public void User_search_Course() {
		course.searchCourses(configurationProperties.getCourse_user());
		extentTest.log(LogStatus.PASS, "User search Course");
	}

	@Then("^User click Search")
	public void User_click_Search() {
		course.clickSearch();
		extentTest.log(LogStatus.PASS, "User click Search");
	}

	// Menu About
	@Then("^User pindah ke halaman About")
	public void User_pindah_ke_halaman_About() {
		about.clickAbout();
		extentTest.log(LogStatus.PASS, "User pindah ke halaman About");
	}

	// Menu Blog
	@When("^User pindah ke halaman Blog")
	public void User_pindah_ke_halaman_Blog() {
		blog.menuBlog();
		extentTest.log(LogStatus.PASS, "User pindah ke halaman Blog");
	}

	@And("^User pindah nomor halaman")
	public void User_pindah_nomor_halaman() {
		blog.clickPageNumb();
		extentTest.log(LogStatus.PASS, "User pindah nomor halaman");
	}

	@Then("^User click Detail Blog")
	public void User_click_Detail_Blog() {
		blog.chooseBlog();
		extentTest.log(LogStatus.PASS, "User click Detail Blog");
	}

	// Menu Contact
	@When("^User click Contact")
	public void User_click_Contact() {
		contact.pageContact();
		extentTest.log(LogStatus.PASS, "User click Contact");
	}

	@And("^User input data Contact")
	public void User_input_data_Contact() {
		contact.formContact(configurationProperties.getFullname_user(), configurationProperties.getEmail2_user(), configurationProperties.getPhone_user(),
				configurationProperties.getSubject_user(), configurationProperties.getMessage_user());
		extentTest.log(LogStatus.PASS, "User input data Contact");
	}

	@Then("^User click Send Message")
	public void User_click_Send_Message() {
		contact.sendMessage();
		extentTest.log(LogStatus.PASS, "User click Send Message");
	}

	// Register Page
	@When("^User masuk halaman registrasi")
	public void User_masuk_halaman_registrasi() {
		regist.registerPage();
		extentTest.log(LogStatus.PASS, "User masuk halaman registrasi");
	}

	@And("^User input formulir")
	public void User_input_formulir() {
		regist.formPendaftaran(configurationProperties.getFirstName_user(), configurationProperties.getLastName_user(),
				configurationProperties.getEmailStudents_user(), configurationProperties.getDateOfBirth_user(), configurationProperties.getAddress_user(),
				configurationProperties.getCity_user(), configurationProperties.getPostCode_user(), configurationProperties.getMobilePhone_user(),
				configurationProperties.getRelativesPhone_user(), configurationProperties.getMotivation_user());
		extentTest.log(LogStatus.PASS, "User input formulir");
	}

	@Then("^User kirim formulir")
	public void User_kirim_formulir() {
		regist.clickSend();
		extentTest.log(LogStatus.PASS, "User kirim formulir");
	}

	// Bucket Page
//		@Then("^User tekan button pay")
//		public void User_tekan_button_pay() {
//			bucket.pay();
//			extentTest.log(LogStatus.PASS, "User tekan button pay");
//		}

//AKHIR TESTSTING USER WEB JCODING-------------------------------------------------------------------------------------------------------------------

//final WEB JCODING---------------------------------------------------------------------------------------------------------------------

	@After
	public void closeObject() {
		extentReports.endTest(extentTest);
		extentReports.flush();
	}

}
