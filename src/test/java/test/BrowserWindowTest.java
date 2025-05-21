package test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.BrowserWindowPage;


public class BrowserWindowTest  extends BaseLibrary{
	BrowserWindowPage ob ;
	   
	@BeforeTest
	public void launcher()
	{
		launchUrl();
		ob= new BrowserWindowPage ();
		}
	@Test(priority=1)
	public void cllickAtClose()
	{
		ob.clickOnClose();
	}
	@Test(priority=2)
	public void cllickAtPractice()
	{
		ob.clickOnPractice();
	}
	@Test(priority=3)
	public void cllickAtAlertsFrameWindow()
	{
		ob.clickOnAlertsFrameWindow();
	}
	@Test(priority=4)
	public void cllickAtBrowserWindows()
	{
		ob.clickOnBrowserWindows();
	}
	@Test(priority=5)
	public void cllickAtNewTab()
	{
		ob.clickOnNewTab();
	}
	@Test(priority=6)
	public void clickAtNewWindow()
	{
		ob.clickOnNewWindow();
		driver.getTitle();
		
	}
	@Test(priority=7)
	public void clickAtNewWindowMsg()
	{
		ob.clickOnNewWindowMsg();
	}
	

}
