package com.skillzin.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.skillzin.pages.FaceBookPage;

public class FaceBookTest {
	
	@Test
	public void faceBookLoginTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"G:\\july24\\11.30amst\\software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		FaceBookPage fb=new FaceBookPage(driver);
		fb.getfaceBookUserName().sendKeys("12345");
		Thread.sleep(2000L);
		fb.getfaceBookPassword().sendKeys("54321");
		Thread.sleep(2000L);
		fb.getfaceBookLoginButton().click();
		
	}
	@Test
	public void faceBookForgottenPassword() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"G:\\july24\\11.30amst\\software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		FaceBookPage fb=new FaceBookPage(driver);
		fb.getfaceBookUserName().sendKeys("12345");
		Thread.sleep(2000L);
		fb.getfaceBookForgottenPassword().click();
		
	}

}
