package com.viraj.RadioButtonsAndCheckBoxes;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	WebDriver driver;
	String baseURL = "https://letskodeit.teachable.com/p/practice";
	
	@Before
	public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Viraj\\Desktop\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	}
	
	@Test
	public void test() {
		driver.get(baseURL);
		WebElement element1 = driver.findElement(By.id("bmwradio"));
		element1.click();
		
		WebElement element2 = driver.findElement(By.id("benzradio"));
		element2.click();
		
		WebElement element3 = driver.findElement(By.id("bmwcheck"));
		element3.click();
		
		WebElement element4 = driver.findElement(By.id("benzcheck"));
		element4.click();
		
		System.out.println("element1 selected : " + element1.isSelected());
		System.out.println("element2 selected : " + element2.isSelected());
		System.out.println("element3 selected : " + element3.isSelected());
		System.out.println("element4 selected : " + element4.isSelected());
		
	}

	@After
	public void tearDown() throws Exception {
	}

	

}
