package selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebElement;
//import java.util.list;


public class Test_04_find_className {
	
	static WebDriver driver=new ChromeDriver();

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "//Users//mikepol//selenium-java-3.141.59//chromedriver");
		
		driver.get("http://facebook.com");
		
		driver.findElement(By.className("_8esa")).click();

		driver.quit();
	}

}
