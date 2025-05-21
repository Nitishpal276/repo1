package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.ButtonsPage;

public class ButtonsTest extends BaseLibrary {
	
	ButtonsPage ob ;
   
	@BeforeTest
	public void launcher()
	{
		launchUrl();
		ob = new ButtonsPage();
	}
	@Test(priority=1)
	public void clickonClose()
	{
		ob.clickonclose();
	}
	@Test(priority=2)
	public void clickonPractice()
	{
		ob.clickonpractice();
	}
	@Test(priority=3)
	public void clickonElement()
	{
		ob.clickonelement();
	}
	@Test(priority=4)
	public void clickonbuttons()
	{
		ob.clickonbutton();
		}
	@Test(priority=5)
	public void clickonDoubleclick()
	{
		ob.clickondoubleclick();
	}
	
	@Test(priority=6)
	public void clickonRightclick()
	{
		ob.clickonrightclick();
	}
	@Test(priority=7)
	public void clickonClickme()
	{
		ob.clickonclickme();
	}
	
	@Test(priority=8)
	public void buttonsvalidate() {
		ob.buttonValidate();
		}
	
}
