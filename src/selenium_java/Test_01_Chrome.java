package selenium_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_01_Chrome {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "//Users//Shared//SeleniumWebDriver//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://google.com");
		
		System.out.print(driver.getTitle());

		driver.quit();
		
		
	}

}
