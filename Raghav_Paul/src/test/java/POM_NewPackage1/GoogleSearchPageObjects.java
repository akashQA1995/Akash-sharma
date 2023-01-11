package POM_NewPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
	WebDriver driver = null;

	By textbox_search = By.id("lst-ib");    // "By" is a class in java and this is used to declare objects
	
	By button_search = By.name("btnk");
	
	//creating constructor same name as class
	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver = driver;
		
	}
	
	
//Now adding methods for performing actions on objects 
	
	public void setTextInSearchBox(String text) {     //adding arguments to the function
		driver.findElement(textbox_search).sendKeys(text);
		}
	
	public void clickSearchButton() {
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	}
	}

//https://prnt.sc/kJEPDZvPQQmu
/* Benefits of POM 
* objects stored seperately
* https://prnt.sc/uY7T_xrmcMRI
*/

