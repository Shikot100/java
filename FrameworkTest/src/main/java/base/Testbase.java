package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import action.ActionDeshecartClick;
import action.DesheCartAction;


public class Testbase {
	
	public WebDriver driver;
	@test
	public void beforeMethod(){
		  System.setProperty("webdriver.chrome.driver", "C:\\Browser\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver(); 
		  driver.get("https://www.deshecart.com/"); 
		  driver.manage().window().maximize();
		  driver.quit();
		
	}
	public ActionDeshecartClick getDriver() {
		return new ActionDeshecartClick(driver);
		
	}
}
