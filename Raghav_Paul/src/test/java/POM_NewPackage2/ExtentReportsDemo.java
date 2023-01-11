package POM_NewPackage2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemo {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html"); //Initialise extent report

		//now creating an object for extent reports
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		driver = new ChromeDriver();

		//now creating a test case
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


		driver.close();
		driver.quit();
		test1.pass("closed the browser");

		test1.info("Test completed");


		//For Failed test
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


		driver.close();
		driver.quit();
		test2.pass("closed the browser");

		test2.info("Test completed");


		//to write everything in the report you have to use flush() command
		extent.flush();

	}

}
