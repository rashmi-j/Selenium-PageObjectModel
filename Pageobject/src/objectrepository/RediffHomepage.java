package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//only thing all the new page class require is constructor i.e define constructor use the driver method and assign test case driver to local driver with this keyword

public class RediffHomepage {
	
	WebDriver driver;
	
	public RediffHomepage(WebDriver driver) //creating constructor with driver argument,
	
	{
		this.driver = driver;  //local driver refering to this.driver using this KW i.e passing test case driver to rediff login page
	}

	
	By searchfield = By.id("srchword");
	By searchicon = By.xpath("//input[@type='submit']");

	public WebElement clickSearchfiled()
	{
		
		return driver.findElement(searchfield);
	}
	
	public WebElement clickSearchicon()
	{
		
		return driver.findElement(searchicon);
	}
	
}

