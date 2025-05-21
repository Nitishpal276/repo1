package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class Frame_Page extends BaseLibrary 
 {
	public Frame_Page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='×']")
	private WebElement close;
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	@FindBy(xpath = "//*[@data-target='#alerts']")
	private WebElement alertframewindow;
	@FindBy(xpath = "//*[text()='frames']")
	private WebElement frame;
	@FindBy(xpath = "//*[@style='height:200px;width:400px']")
	private WebElement frame1;
	@FindBy(xpath = "")
	private WebElement frame1text;
	@FindBy(xpath="//*[@style='height:80px;width:120px']")
	private WebElement frame2;
	@FindBy(xpath="")
	private WebElement frame2text;
	
	
	public void clickOnClose()
	{
		waitforClick(close);
	}
	public void clickOnPractice()
	{
		waitforClick(practice);
	}
	public void clickOnAlertFrameWindow()
	{
		waitforClick(alertframewindow);
	}

	public void clickOnFrames()
	{
		waitforClick(frame);
	}
	public void clickOnFrame1()
	{
		driver.switchTo().frame(frame1);
		waitforClick(frame1text);
		driver.switchTo().defaultContent();
	}
	public void clickOnFrame2()
	{
		driver.switchTo().frame(frame2);
		waitforClick(frame2text);
		driver.switchTo().defaultContent();
	}
}
