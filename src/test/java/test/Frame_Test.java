package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Frame_Page;

public class Frame_Test extends BaseLibrary  {
	
	Frame_Page ob;
	
	@BeforeTest
	public void launcher()
	{
		launchUrl();
		
		ob= new Frame_Page();
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
	public void clickAtAlertFrameWindow()
	{
		ob.clickOnAlertFrameWindow();
	}
	@Test(priority=4)
	public void clickAtFrames()
	{
		ob.clickOnFrames();
	}
	@Test(priority=5)
	public void clickAtFrame1()
	{
		ob.clickOnFrame1();
	}
	public void clickAtFrame2()
	{
		ob.clickOnFrame2();
	}
	
	
	
	
	
	
	
	
	

}
