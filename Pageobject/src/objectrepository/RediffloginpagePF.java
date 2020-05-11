package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



//page obj class can be written in other style called page obj factory

public class RediffloginpagePF {
	
	WebDriver driver;
	
	public RediffloginpagePF(WebDriver driver) //creating constructor with driver argument,
	
	{
		this.driver = driver;  //local driver refering to this.driver using this KW i.e passing test case driver to rediff login page
		PageFactory.initElements(driver, this); //initialising page factory after writing find-by annotations and passing driver and local this arg
	}
	
	
	
	@FindBy(xpath = ".//*[@id='login1']" )  //using find by annotation withinbracket explaining how we have find the element here its by xpath
	WebElement username;
	
	@FindBy(id = "password")   //here its by id
	WebElement password;
	
	@FindBy(name = "proceed")  //here its by name
	WebElement submit;
	
	@FindBy(linkText = "rediff.com")  //here its by linkText
	WebElement home;
	
	
	public WebElement emailId()
	{
		return username;   //returning driver.findelement hence instead of public void emailId() its public Webelement emailId()
	}
	
	
	public WebElement password()
	{
		return password;    //returning driver.findelement hence instead of public void emailId() its public Webelement emailId()
	}
	
	public WebElement submit()
	{
		return submit;    //returning driver.findelement hence instead of public void emailId() its public Webelement emailId()
	}
	
	public WebElement home()
	{
		return home;    //returning driver.findelement hence instead of public void emailId() its public Webelement emailId()
	}
	
	
}

