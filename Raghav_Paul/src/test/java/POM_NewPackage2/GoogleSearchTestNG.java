package POM_NewPackage2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM_NewPackage1.GoogleSearchPage;    //import first package class

public class GoogleSearchTestNG {
	
	private static WebDriver driver = null;
	
	
	@BeforeTest
	public void setUpTest() {         //First function doing the setup  before running the test
		
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void googleSearch() {     //Second function is actual test 
		
		//URL open
		driver.get("https://google.com");
		
		//enter text in the text-box field
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation Step By Step ");  //test case 1
		
		GoogleSearchPage.textbox_search(driver).sendKeys(Keys.ENTER);
		//GoogleSearchPage.button_search(driver).sendKeys(Keys.ENTER);  //test case 2
		
		}

	  @AfterTest
      public void tearDownTest() {    // Third function runs at the end of test 
    	  
    	  driver.close();
  		  driver.quit();
  		System.out.println("Test completed successfully");
     
      }
	
}
