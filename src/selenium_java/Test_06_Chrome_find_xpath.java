package selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebElement;
//import java.util.list;


public class Test_06_Chrome_find_xpath {
	
	static WebDriver driver=new ChromeDriver();

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "//Users//Shared//SeleniumWebDriver//chromedriver");
		
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("ABC");
		
		driver.findElement(By.name("pass")).sendKeys("123456");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")).click();

//		driver.quit();
	}

}
