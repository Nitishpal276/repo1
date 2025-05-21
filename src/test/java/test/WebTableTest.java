package test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.WebTablesPage;

public class WebTableTest extends BaseLibrary {
	 
	WebTablesPage ob ;

	@BeforeTest
	public void launcher()
	{
		launchUrl();
		ob = new WebTablesPage();
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
	public void clickonelement()
	{
		ob.clickonelement(); 
	}
	@Test(priority=4)
	public void clickonwebtables()
	{
		ob.clickonwebtable();
	}
	@Test(priority=5)
	public void clickonfuilldetailes()
	{
		ob.filldetails();
	}
	@Test(priority=6)
	public void clickonvalidate()
	{
		ob.validate();
	}
	
	@Test(priority=7)
	public void updatetheWebtable() {
		ob.updateWebtable();
		}
	
	/*@Test(priority=7)
	public void printna() {
		ob.printNames();	}
*/
}
