package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomepage;
import objectrepository.Rediffloginpage;

public class Loginapplicationtests {
	
	//login page implemented using both normal page obj pattern and page obj factor
	
	
	@Test
	public void login()
	{
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//rashmi.j//Downloads//chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Rediffloginpage rd = new Rediffloginpage(driver);  /*creating obj of any class by default constructor will be executed
																driver is the argument we are passing and in obj file we are creating constructor with arg*/
					
		rd.emailId().sendKeys("jahsdja");
		rd.password().sendKeys("ashfgjf");
		//rd.submit().click();       //commenting becuse home button will not be visible 
		rd.home().click();
		
		RediffHomepage rh = new RediffHomepage(driver);
		rh.clickSearchfiled().sendKeys("rediff");
		rh.clickSearchicon().click();
		
		
		
	}
	
	
	
	
	

}
