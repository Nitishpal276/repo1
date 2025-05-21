package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.ModalDialogsPage;
import pages.NestedFramePage;

public class ModalDialogsTest extends BaseLibrary {
	ModalDialogsPage ob;
	@BeforeTest
	public void launcher()
	{
		launchUrl();
		ob = new ModalDialogsPage();
	}
	@Test( priority=1)
	public void clickAtClose()
	{
		ob.clickOnClose();
	}
	
//	<-------calling page class methods--------->
//	@Test( priority=1 ,groups={"sanity","regression","smoke"})
//	public void clickAtClose()
//	{
//		ob.clickOnClose();
//	}
	@Test( priority=2,groups= {"sanity","regression"})
	public void clickAtPractice()
	{
		ob.clickOnPractice();
	}
	@Test(priority=3,groups= {"sanity","regression"})
	public void clickAtAlertFrameWindow()
	{
		ob.clickOnAlertFrameWindow();
	}
	@Test(priority=4,groups= {"resgression","smoke"})
	public void clickAtModalDialogs()
	{
		ob.clickOnModalDialogs();
	}
	@Test(priority=5,groups= {"smoke","sanity"})
	public void clickAtOnSmallModal()
	{
		ob.cllickOnSmallModal();
	}
	@Test(priority=6,groups= {"sanity","smoke"})
	public void clickAtLargeModal()
	{
		ob.clickOnLargeModal();
	}
	
	
	
	
	
	

}
