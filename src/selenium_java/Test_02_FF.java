package selenium_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_02_FF {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "//Users//mikepol//selenium-java-3.141.59//geckodriver");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://google.com");
		System.out.print(driver.getTitle());
		
		driver.get("http://facebook.com");
		System.out.print(driver.getTitle());

		driver.quit();

	}

}
