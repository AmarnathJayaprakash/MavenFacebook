package com.MavenFaceBook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassFacebook {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String str) {
		if (str.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","F:\\Java\\SeleniumOctProject\\driver\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}  

	public static void getUrl(String str) {
		driver.get(str);
	}


	public static void inputValue(WebElement ele,String str) {
		ele.sendKeys(str);
	}
	public static void clickIt(WebElement ele) {
		ele.click();
	}



}
