package com.MavenFaceBook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pojo.com.LoginDetails;

public class MiniProjectForFacebook extends BaseClassFacebook {
      public static WebDriver driver;
	public static void main(String[] args) {
		   
	       driver = browserLaunch("chrome");
	       LoginDetails l= new LoginDetails(driver);
	       getUrl("https://www.facebook.com/");
	       inputValue(l.getEmail(),"email");
	       inputValue(l.getPassword(), "9876543210");            
	       clickIt(l.getLoginBtn());
	}

}
