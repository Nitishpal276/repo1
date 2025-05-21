package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.NestedFramePage;

public class NestedFrameTest extends BaseLibrary{
	
	NestedFramePage ob;
	@BeforeTest(groups= {"sanity","smoke","regression"})
	public void launcher()
	{
		launchUrl();
		ob = new NestedFramePage();
	}
	@Test( priority=1 )
	public void clickAtClose()
	{
		ob.clickOnClose();
	}
	@Test( priority=2)
	public void clickAtPractice()
	{
		ob.clickOnPractice();
	}
	@Test( priority=3)
	public void clickAtAlertFrameWindow()
	{
		ob.clickOnAlertFrameWindow();
	}
	@Test( priority=4)
	public void clickAtNestedFrame()
	{
		ob.clickOnNestedFrame();
	}
	@Test( priority=5)
	public void clickAtParent()
	{
		ob.clickOnParent();
	}
}
