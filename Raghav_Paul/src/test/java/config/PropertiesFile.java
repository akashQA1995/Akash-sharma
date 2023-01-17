package config;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) {
		
		getProperties();

	}

	public static void getProperties() {
		try {
			Properties prop = new Properties();   //creating a object of properties  https://prnt.sc/RvjQ_qgZ0hVt 
			
			String projectPath = System.getProperty("user.dir");
			//now create a object of class InputStream
			InputStream input = new FileInputStream(projectPath+"/src/test/java/config/config.properties");
			
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			
			}
		catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
			
			}
		}
}
