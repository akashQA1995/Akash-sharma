import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Desired_Capabilities {

	static WebDriver driver = null;
	
	public static void main(String[] args) {
		

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("ignoreProtectedModeSettings", true);
		
		driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("ABCD");
		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		

		driver.close();
		driver.quit();
		
	}

}
