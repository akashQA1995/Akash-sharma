package POM_NewPackage2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_NewPackage1.GoogleSearchPage;    //import first package class

public class GoogleSearchTest {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		//URL open
		driver.get("https://google.com");
		
		//enter text in the text-box field
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation Step By Step ");  //test case 1
		
		GoogleSearchPage.textbox_search(driver).sendKeys(Keys.ENTER);
		//GoogleSearchPage.button_search(driver).sendKeys(Keys.ENTER);  //test case 2
		
		
		
	}

}
