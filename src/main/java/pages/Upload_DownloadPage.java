package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Upload_DownloadPage extends BaseLibrary {
	
	public Upload_DownloadPage()
	{
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//*[text()='×']")// this is or main window
	private WebElement close;
	@FindBy(xpath="//*[text()='×']")// this is for next window
	private WebElement close1;
	@FindBy(xpath="//*[text()='Practice']")
	private WebElement practice;
	@FindBy(xpath="//*[@data-target='#elements']")
	private WebElement elements;
    @FindBy(xpath="//*[text()='upload and download']")
    private WebElement upload;
    @FindBy(xpath="//*[@id='File1']")
    private WebElement chose;
	
	public void clickClose()
	{
	waitforClick(close);
	}
	public void clickOnPractice()
	{
//		practice.click(); v    n
		waitforClick(practice);
	}
	public void clickOnElements()
	{
//		elements.click();
		waitforClick(elements);
	}
	public void clickOnUpload()
	{
		upload.click();
	}
	public void clickOnChose()
	{
//		chose.click();
		clickme(chose);
	}
	public void uploadtheFile() {
		uploadFile("C:\\Users\\PHIROZ KHAN\\TestingBaba_automation17th_june\\testdata\\Untitled spreadsheet.xlsx");
	}
	
	
	
	
	
	
}
