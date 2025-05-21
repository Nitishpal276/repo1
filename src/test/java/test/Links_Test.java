package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Links_Page;

public class Links_Test extends BaseLibrary {
	
	Links_Page ob;
	@BeforeTest
	public void launcher()
	{
		launchUrl();
		 ob = new Links_Page();
	}
	@Test(priority=1)
	public void clickAtClose()
	{
		ob.clickClose();
	}
	@Test(priority=2)
	public void clickAtPractice()
	{
		ob.clickOnPractice();
	}
	@Test(priority=3)
	public void clickAtElements()
	{
		ob.clickOnElements();
	}
	@Test(priority=4)
	public void clickAtLinks()
	{
		ob.clickOnLinks();
	}
	@Test(priority=5)
	public void clickAtDemoPage()
	{
		ob.demoPage();
	}
	@Test(priority=6)
	public void clickNextClose()
	{

		ob.closeNextWindowCloseButton();	
	}
	@Test(priority=7)
	public void backToPreviousWindow()
	{
		ob.backToPrevWindow();
	}
	@Test(priority=8)
	public void clickAtCreated()
	{
		ob.clickOnCreated();
	}
	@Test(priority=9)
	public void clickAtNoContant()
	{
		ob.clickOnNoContent();
	}
	@Test(priority=10)
	public void clickAtMoved()
	{
		ob.clickOnMoved();
	}
	@Test(priority=11)
	public void clickAtRequest()
	{
		ob.clickOnRequest();
	}
	@Test(priority=12)
	public void clickAtUnauthorized()
	{
		ob.clickOnUnauthorize();
	}
}
