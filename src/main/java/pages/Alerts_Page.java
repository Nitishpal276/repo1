package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baselibrary.BaseLibrary;


public class Alerts_Page extends BaseLibrary {
	
	
	
	public Alerts_Page ()
	{
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//*[text()='×']")
	private WebElement close;
	@FindBy(xpath="//*[text()='Practice']")
	private WebElement practice;
	@FindBy(xpath="//button[@data-target='#alerts']")
	private WebElement AlertsFrameWindow;
	@FindBy(xpath="//a[text()='alerts']")
	private WebElement alerts;
	@FindBy(xpath="//button[@onclick='myalert()']")
	private WebElement myalert;
	@FindBy(xpath="//button[@onclick='aftersec5()']")
	private WebElement fivesecalert;
	@FindBy(xpath="//button[@onclick='myconfirm()']")
	private WebElement myconfirmalert;
	
	@FindBy(xpath="//*[text()='You pressed Cancel!']")
	private WebElement myconfirmalerttext;
	
	
	@FindBy(xpath="//*[@onclick='myprompt()']")
	private WebElement myprompt;
	@FindBy(xpath = "//*[@id=\"name-result\"]")
	private WebElement myprompttext;
	
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
	public void clickOnAlerts()
	{
		waitforClick(alerts);
	}
	//<--------normal alert-------->
	public void clickOnMyAlerts()
	{
		waitforClick(myalert);
		driver.switchTo().alert().accept();
		}	
	//<-----------alert after 5sec--------->
	public void clickOn5SecAlerts()
	{
		waitforClick( fivesecalert);
		waitForAlerts(6);
		driver.switchTo().alert().accept();
		}	
	//<-------------confirming alerts------------------>
	public void clickOnMyConfirmAlert()
	{
		waitforClick(myconfirmalert);
		driver.switchTo().alert().dismiss();
		String actualmyconfirm=myconfirmalerttext.getText();
		String expectedmyconfirm="You pressed Cancel!";
		Assert.assertEquals(actualmyconfirm, expectedmyconfirm);
	}
	//<-------------prompt alert----------------->
	public void clickOnMyPrompt()
	{
		String expected= "phiroz";
		waitforClick(myprompt);
		Alert al=driver.switchTo().alert();
		al.sendKeys(expected);
		al.accept();
		String actual=myprompttext.getText();
		Assert.assertEquals(actual, expected);

	}
	
	
	

}
