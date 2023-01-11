package POM_NewPackage2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportTestNG {

	private static WebDriver driver = null;

	//declaring globally available variables
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;


	@BeforeSuite          //@BeforeTest always run in each case  @BeforeSuite runs only once in the beginning of test.
	public void setUp() {

		htmlReporter = new ExtentHtmlReporter("extentReports_WithTestNG.html"); //Initialise extent report

		//now creating an object for extent reports
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		driver = new ChromeDriver();

	}

	@Test
	public void test1() throws IOException {

		///now creating a test case
		ExtentTest test1 = extent.createTest("Google search test 1","this is to validate google search functionality");

		//now creating a log report on test1
		test1.log(Status.INFO, "Starting test case");

		//hitting the URL
		driver.get("https://google.com");
		test1.pass("Navigated to google.com");

		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		test1.pass("Entered text in search box");

		driver.findElement(By.name("q")).click();
		test1.pass("Pressed keyboard enter key");


		// log with snapshot using "throws exception"
		test1.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot1.png").build());

		// test with snapshot
		test1.addScreenCaptureFromPath("screenshot1.png");

	}

	@Test
	public void test2() throws IOException {

		//Secon test case For Failed test
		//now creating a test case
		ExtentTest test2 = extent.createTest("Google search test 2","this is to validate google search functionality");


		driver = new ChromeDriver();

		//now creating a log report on test1
		test2.log(Status.INFO, "Starting test case");

		//hitting the URL
		driver.get("https://google.com");
		test2.pass("Navigated to google.com");

		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		test2.pass("Entered text in search box");

		driver.findElement(By.name("q")).click();
		test2.fail("Pressed keyboard enter key");


		// log with snapshot using "throws exception"
		test2.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot2.png").build());

		// test with snapshot
		test2.addScreenCaptureFromPath("screenshot2.png");

	}

	@AfterSuite
	public void tearDownTest() {    // Third function runs at the end of test 

		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");

	}

}
