package seleniumFirstClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.HTMLReporter;

public class Class1Homework {

	/*
	 * public static void main(String[] args) {
	 * 
	 * 
	 * System.setProperty("webdriver.chrome.driver", "C:\\Browser\\chromedriver.exee"); 
	 * driver = new ChromeDriver(); driver.get("https://www.google.com/");
	 * driver.manage().window().maximize();
	 * 
	 * }
	 */
	public void setUp() {
		HTMLReporter htmlReprt = new HTMLReporter("extend.html");
	}
	
	@Test
	public void testNGTest() throws InterruptedException {
		

		  System.setProperty("webdriver.chrome.driver", "C:\\Browser\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); 
		  driver.get("https://www.google.com/"); 
		  driver.get("https://deshecart.com");
		  driver.manage().window().maximize(); 
		  String country = "Angola";
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
		  driver.findElement(By.xpath("//*[@id=\"gender\"]//following::option[text() 'Male']")).click();
		  driver.findElement(By.xpath("//*[@id=\"entry_country_id\"]//following::option[contains(text(),'"+country+"')]")).click();
	}
		

}