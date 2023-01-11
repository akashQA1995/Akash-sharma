import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class webDriverManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		/*
		 WebDriverManager makes it easy and convert the manual stuff into automation.
		 It verifies the version of the browser(eg chrome, firefox, Edge etc.)
		  installed in your local machine by its own. 
		  It also uses the latest version of the driver(chromedriver, geckodriver etc.
		
		*/
		WebDriver driver = new ChromeDriver();
		driver.get("https://tbsecoms.wpengine.com/");
		
		//driver.close();
		driver.quit();
		
		
	}

}
