package POM_NewPackage2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_NewPackage1.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		googleSearchTest();//calling function from main method
		
	}
    
	public static void googleSearchTest() {
		
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects searchPageObj = new GoogleSearchPageObjects(driver);
		
		driver.get("https://google.com");
		
		searchPageObj.setTextInSearchBox("ABCD");
		
		searchPageObj.clickSearchButton();
		
		driver.close();
		
	}
}
