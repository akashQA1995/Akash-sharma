package POM_NewPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {

	private static WebElement element = null;
	
	//first test case
	public static WebElement textbox_search(WebDriver driver)
	
	{
		
    element = driver.findElement(By.name("q"));
	return element;

	}
	//second test case
	public static WebElement button_search(WebDriver driver)
	
	{
		
	element = driver.findElement(By.name("btnk"));
	return element;
		
	}

}
//https://prnt.sc/kJEPDZvPQQmu
/* Benefits of POM 
 * objects stored seperately
 * https://prnt.sc/uY7T_xrmcMRI
 */








