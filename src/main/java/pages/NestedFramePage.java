package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

import baselibrary.BaseLibrary;
  
public class NestedFramePage extends BaseLibrary
 {
	public NestedFramePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='×']")
	private WebElement close;
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	@FindBy(xpath = "//*[@data-target='#alerts']")
	private WebElement alertframewindow;
	@FindBy(xpath = "//a[text()='nested frames']")
	private WebElement nestedframe;
//	@FindBy(xpath = "")
//	private WebElement parentframe;
	@FindBy(xpath = "//*[@src='text.html']")
	private WebElement parentframe;
	@FindBy(xpath = "//*[@src='example.html']")
	private WebElement childframe;
	@FindBy(xpath = "//*[text()='Click Here']")
	private WebElement frametext;
	
	
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
	public void clickOnNestedFrame()
	{
		waitforClick(nestedframe);
	}  
	public void clickOnParent()
	{
		driver.switchTo().frame(parentframe);
		driver.switchTo().frame(childframe);
		waitforClick(frametext);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
	}
	
 }
