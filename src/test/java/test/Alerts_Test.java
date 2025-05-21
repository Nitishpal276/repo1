package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Alerts_Page;

public class Alerts_Test extends BaseLibrary {    
	
	Alerts_Page ob ;
	   
	@BeforeTest
	public void launcher()
	{
		launchUrl();
		ob= new Alerts_Page ();
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
	@Test(priority=5)
	public void cllickAtMyAlerts()
	{
		ob.clickOnMyAlerts();
	}
	@Test(priority=4)
	public void cllicAtalerts()
	{
		ob.clickOnAlerts();
	}
	
	@Test(priority=6)
	public void cllickAt5SecAlerts()
	{
		ob.clickOn5SecAlerts();
	}
	@Test(priority=7)
	public void cllickAtMyConfirmAlert()
	{
		ob.clickOnMyConfirmAlert();
	}@Test(priority=8)
	public void cllickAtMyPrompt()
	{
		ob.clickOnMyPrompt();
	}
}


