package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.EnterTimeTrackPage;
import com.actitime.pom.LoginPage;

public class BaseClass {

public static WebDriver driver;
public static Logger logger=LogManager.getLogger("BaseClass"); 

	@BeforeClass
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
		logger.debug("Opening the browser");
		Reporter.log("openBrowser",true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void closeBrowser() {
		logger.info("closing the browser");
		Reporter.log("closeBrowser",true);
		driver.close();
	}
	@BeforeMethod
	public void login() throws IOException {
		logger.info("logging in");
		Reporter.log("login",true);
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pw = f.getPropertyData("password");
		driver.get(url);
		LoginPage l=new LoginPage(driver);
		l.setLogin(un, pw);		
	}
	@AfterMethod
	public void logout() {
		logger.info("logging out");
		Reporter.log("logout",true);
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.setLogout();
	}
	
}









