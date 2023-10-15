package seleniumFirstClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.HTMLReporter;

public class seleniumFirstClass {

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
	public void testNGTest() {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Browser\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); 
		  driver.get("https://www.google.com/"); 
		  driver.manage().window().maximize(); 
		  driver.get("https://deshecart.com//");
		  driver.get("https://deshecart.com/sign-up");
		  //Finding Element BY name "firstName";
		  WebElement txtbx_firstName = 
		  driver.findElement(By.name("firstName"));
		  txtbx_firstName.sendKeys("Shikot");
		  WebElement txtbx_lastName = driver.findElement(By.name("lastName"));
		  txtbx_lastName.sendKeys("MD");
		  WebElement txtbx_dob = driver.findElement(By.name("dob"));
		  txtbx_dob.sendKeys("01/01/1994");
		  WebElement txtbx_customers_gender = driver.findElement(By.name("customers_gender"));
		  txtbx_customers_gender.sendKeys("Male");
		  WebElement txtbx_phone = driver.findElement(By.name("phone"));
		  txtbx_phone.sendKeys("7167040062");
		  WebElement txtbx_email = driver.findElement(By.name("email"));
		  txtbx_email.sendKeys("shikot201@gmail.com");
		  WebElement txtbx_entry_city = driver.findElement(By.name("entry_city"));
		  txtbx_entry_city.sendKeys("Dhaka");
		  WebElement txtbx_entry_street_address = driver.findElement(By.name("entry_street_address"));
		  txtbx_entry_street_address.sendKeys("123 E Tazturi bazar, Dhaka");
		  
		  WebElement txtbx_entry_postcode = driver.findElement(By.name("entry_postcode"));
		  txtbx_entry_postcode.sendKeys("12015");
		  WebElement txtbx_password = driver.findElement(By.name("password"));
		  txtbx_password.sendKeys("India420@@");
		  WebElement txtbx_re_password = driver.findElement(By.id("re_password"));
		  txtbx_re_password.sendKeys("India420@@");
		//driver.close(); 
	}
		

}
