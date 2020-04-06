package selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.list;


public class Test_05_FF_xpath {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "//Users//mikepol//selenium-java-3.141.59//geckodriver");
			
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://login.salesforce.com");
		
		driver.findElement(By.id("username")).sendKeys("ABC");
		
		driver.findElement(By.name("pw")).sendKeys("123456");
		
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		
		
		System.out.print(driver.findElement(By.xpath("//*[@id='error']")).getText());

		driver.quit();
	}

}
