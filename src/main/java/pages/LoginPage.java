package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.BaseLibrary;

public class LoginPage extends BaseLibrary  {
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='×']")  //value of WebElement
	private WebElement close;   // variable of WebElement
	
	public void clickonclose()
	{  
		
		close.click();
	}
	//for get the current page Url predefined method
	public void geturl()
	{
		String url=driver.getCurrentUrl();
		System.out.println(url);
//		Assert.assertEquals(true, false);
	}
	
	// for get the page title 
	public void getTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
}
