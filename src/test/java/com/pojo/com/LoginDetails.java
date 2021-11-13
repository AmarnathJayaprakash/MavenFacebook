package com.pojo.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginDetails {

	public WebDriver driver;
	@FindBy(id="email")
	private WebElement email;
	@FindBy(name="pass")
	private WebElement password;
	@FindBy(xpath="//button[@value='1']")
	private WebElement loginBtn;

	public LoginDetails(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}


}
