package com.skillzin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBookPage {
	
	WebDriver driver;

	public FaceBookPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By faceBookUserName=By.id("email");
	By faceBookPassword=By.id("pass");
	By faceBookLoginButton=By.name("login");
	By faceBookForgottenPassword=By.linkText("Forgotten password?");
	
	public WebElement getfaceBookUserName() {
		return driver.findElement(faceBookUserName);
	}
	
	public WebElement getfaceBookPassword() {
		return driver.findElement(faceBookPassword);
	}
	public WebElement getfaceBookLoginButton() {
		return driver.findElement(faceBookLoginButton);
	}

	public WebElement getfaceBookForgottenPassword() {
		return driver.findElement(faceBookForgottenPassword);
	}


}
