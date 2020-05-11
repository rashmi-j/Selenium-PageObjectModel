package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rediffloginpage {
	
	WebDriver driver;
	
	public Rediffloginpage(WebDriver driver) //creating constructor with driver argument,
	
	{
		this.driver = driver;  //local driver refering to this.driver using this KW i.e passing test case driver to rediff login page
	}
	
	//page obj class can be written in other style called page obj factory

	
	By username = By.xpath(".//*[@id='login1']");
	By password = By.id("password");
	By submit = By.name("proceed");
	By home = By.linkText("rediff.com");
	
	
	public WebElement emailId()
	{
		return driver.findElement(username);    //returning driver.findelement hence instead of public void emailId() its public Webelement emailId()
	}
	
	
	public WebElement password()
	{
		return driver.findElement(password);    //returning driver.findelement hence instead of public void emailId() its public Webelement emailId()
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);    //returning driver.findelement hence instead of public void emailId() its public Webelement emailId()
	}
	
	public WebElement home()
	{
		return driver.findElement(home);    //returning driver.findelement hence instead of public void emailId() its public Webelement emailId()
	}
	
	
}

