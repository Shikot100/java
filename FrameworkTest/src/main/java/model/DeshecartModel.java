package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.ModelBase;

public class DeshecartModel extends ModelBase{

	public DeshecartModel(WebDriver driver) {
		super (driver);
	}
	
	WebElement loginButton = null;
	WebElement uid = null;
	WebElement password = null;
	WebElement submitButton = null;
	
	public WebElement loginButton() {
		loginButton = driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));
		return loginButton;
	}
	
	 public WebElement uid() {
		 uid = driver.findElement(By.xpath("//input[@id='email']"));
		 return uid;
	 }
	
	 public WebElement password() {
		 password = driver.findElement(By.xpath("//input[@id='password-login']"));
		 return password;
	 }
	 
	 public WebElement submitButton() {
		 submitButton = driver.findElement(By.xpath("//button[@id='']"));
		 return submitButton;
	 }
}
