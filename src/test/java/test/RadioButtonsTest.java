package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.RadioButtonsPage;

public class RadioButtonsTest extends BaseLibrary {
	
	RadioButtonsPage ob;
	@BeforeTest
	 public void launcher()
	 {
		 launchUrl();
		 ob = new RadioButtonsPage();
	 }
	 @Test(priority=1)
	 public void clickonclose()
	 {
		 ob.clickonclose();
	 }
	 @Test(priority=2)
	 public void clickonpractice()
	 {
		 ob.clickonpractice();
	 }
	 @Test(priority=3)
	 public void clickonelements()
	 {
		 ob.clickonelements();
	 }
	 @Test(priority=4)
	 public void clickonradiobuttons()
	 {
		 ob.clickonradiobuttons();
	 }
	 @Test(priority=5)
	 public void clickonyesbuttons()
	 {
		 ob.clickyesbutton();
	 }
	 @Test(priority=6)
	 public void clickonimpressivebuttons()
	 {
		 ob.clickonimpressivebuttons();
	 }
	 @Test(priority=7)
	 public void clickonnobuttons()
	 {
		 ob.clickonnobuttons();
	 }
	 
	 
	 

}
