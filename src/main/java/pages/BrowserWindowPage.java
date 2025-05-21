package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class BrowserWindowPage extends BaseLibrary {
	
	
	public BrowserWindowPage ()
	{
		PageFactory.initElements(driver,this);
		
	}
	//div[@id='myModal2']/descendant::button[@class='close'
	//@FindBy(xpath="//*[text()='×']")
	@FindBy(xpath="//div[@id='myModal2']/descendant::button[@class='close']")
	private WebElement close;
	@FindBy(xpath="//*[text()='Practice']")
	private WebElement practice;
	@FindBy(xpath="//button[@data-target='#alerts']")
	private WebElement AlertsFrameWindow;
	@FindBy(xpath="//a[text()='browser windows']")
	private WebElement browser_window;
	@FindBy(xpath = "//a[@href='https://www.google.co.in/']")
	private WebElement new_tab;
	@FindBy(xpath = "//a[text()='New Window']")
	private WebElement newwindow;
	@FindBy(xpath = "//a[text()='New Window Message']")
	private WebElement newwindowmsg;
	
	public void clickOnClose() {
		waitforClick(close);
		
	}
	public void clickOnPractice() {
		waitforClick(practice);
	}
	public void clickOnAlertsFrameWindow()
	{
		waitforClick(AlertsFrameWindow);
	}
	//<--------open a new window----------->
	public void clickOnBrowserWindows() {
		waitforClick(browser_window);
	}
	//<---------return to main window-------->
	public void clickOnNewTab() {
		waitforClick(new_tab);
		windowHandle(0);
		}
	public void clickOnNewWindow()
	{
		waitforClick(newwindow);
		
	}
	public void clickOnNewWindowMsg()
	{
		waitforClick(newwindowmsg);
	}
	
	}
