package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	@BeforeSuite
	public void bsConfig() {
		System.out.println("Data Connection has been Stablised");
		
	}
	@BeforeClass
	public void bcConfig() {
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.google.com");
		
	}
	@BeforeMethod
	public void bmConfig() {
		
	}
	@AfterMethod
	public void amConfig() {
		
	}
	@AfterClass
	public void acConfig() {
		
	}
	@AfterSuite
	public void asConfig() {
		
	}

}
