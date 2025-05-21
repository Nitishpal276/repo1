package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.BaseLibrary;
import pages.Links_Page;
import pages.Upload_DownloadPage;

public class Upload_DownloadTest extends BaseLibrary {

	Upload_DownloadPage ob;
	@BeforeTest
	public void launcher()
	{
		launchUrl();
		 ob = new Upload_DownloadPage();
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
	public void clickAtUploads()
	{
		ob.clickOnUpload();
	}
	@Test(priority=5)
	public void clickAtChose()
	{
		ob.clickOnChose();
	}
//	@Test(priority=6)
//	public void uploading()

	@Test(priority=6)
	public void uploadDoc()
	{
		ob.uploadtheFile();
	}
}
