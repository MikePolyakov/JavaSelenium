package selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebElement;
//import java.util.list;


public class Test_03_find_id_name_linktext {
	
	static WebDriver driver=new ChromeDriver();

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "//Users//Shared//SeleniumWebDriver//chromedriver");
		
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("ABC");
		
		driver.findElement(By.name("pass")).sendKeys("123456");
		
		driver.findElement(By.linkText("Forgot account?")).click();

		driver.quit();
	}

}
