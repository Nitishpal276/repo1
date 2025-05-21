 
 package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.LoginPage;

public class LoginTest extends BaseLibrary {
	
	LoginPage ob;

	@BeforeTest
	public void launcher()
	{ 
		launchUrl();
		ob= new LoginPage();
		
	}
	@Test
	public void clickonclose()
	{
		ob.clickonclose();

//		getScreenshot("passed", "clickonclose");
	}
	@Test
	public void getUrl()// printing current page url
	{
		ob.geturl();
	
	}
	@Test
	public void gettitle() // printing page title
	{
		ob.getTitle();
	}

}
