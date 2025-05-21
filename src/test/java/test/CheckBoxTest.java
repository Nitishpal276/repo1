package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.ChekBoxPage;

public class CheckBoxTest extends BaseLibrary {
	
	ChekBoxPage ob;
    @BeforeTest
	public void launcher()
	{
		launchUrl();
		ob = new ChekBoxPage();
	}
    @Test(priority=1)
    public void clickonclose()
    {
    	ob.clickonclose();
    }
    @Test(priority=2)
    public void cliconpractice()
    {
    	ob.clickonpractice();
    }
    @Test(priority=3)
    public void clickonelements()
    {
    	ob.clickonelements();
    }
    @Test(priority=4)
    public void clickoncheckbox()
    {
    	ob.clickoncheckbox();
    }
    @Test(priority=5)
    public void clickonmobile()
    {
    	ob.clickonmobile();
    }
    @Test(priority=6)
    public void clickonlaptop()
    {
    	ob.clickonlaptop();
    }
    @Test(priority=7)
    public void clickondesktop()
    {
    	ob.clickondesktop();
    }
    
    
}
