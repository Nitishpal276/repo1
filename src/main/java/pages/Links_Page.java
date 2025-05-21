package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import baselibrary.BaseLibrary;

public class Links_Page extends BaseLibrary {
	
	public Links_Page()
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
	@FindBy(xpath="//*[text()='links']")
	private WebElement links;
	@FindBy(xpath="//*[text()='Demo Page']")
	private WebElement demopage;
	
	@FindBy(xpath="//ul[@class='list-unstyled']/descendant::a[text()='Created']")
	private WebElement created;
	@FindBy(xpath="//*[@id='link-result']")
	private WebElement createdtext;
	
	@FindBy(xpath="//*[@onclick='Content()']")
	private WebElement nocontent;
	@FindBy(xpath="//*[@id='link-result']")
	private WebElement contenttext;
	
	@FindBy(xpath="//*[text()='Moved']")
	private WebElement moved;
	@FindBy(xpath="//*[@id='link-result']")
	private WebElement movedtext;
	
	 
	@FindBy(xpath="//*[@onclick='Request()']")
	private WebElement request;
	@FindBy(xpath="//*[@id='link-result']")
	private WebElement requesttext;
	
	@FindBy(xpath="//*[@onclick='Unauthorized()']")
	private WebElement unauthorize;
	@FindBy(xpath="//*[@id='link-result']")
	private WebElement unauthorizetext;
	
	
	@FindBy(xpath="//*[@onclick='Forbidden()']")
	private WebElement forbidden;
	
	@FindBy(xpath="//*[@onclick='Found()']")
	private WebElement notfound;
	
	
	public void clickClose()
	{
		close.click();
	}
	public void clickOnPractice()
	{
		practice.click();
	}
	public void clickOnElements()
	{
		elements.click();
	}
	public void clickOnLinks()
	{
		links.click();
	}
	public void demoPage()
	{
		demopage.click();
	}
	public void closeNextWindowCloseButton() 
	{
		windowHandle(1);
		
		 WebDriverWait wait = new WebDriverWait(driver, 10); // wait for 10 seconds
		    wait.until(ExpectedConditions.elementToBeClickable(close1));
		close1.click();
		
	}
	// Back to previous window
	public void  backToPrevWindow() 
	{
		windowHandle(0);
	}
	public void clickOnCreated()
	{
		created.click();
		String actual= createdtext.getText();
		String expected = getReadData("Created");
		Assert.assertEquals(actual, expected);
	}
	public void clickOnNoContent()
	{
		nocontent.click();
		String actualcontenttext=contenttext.getText();
		String expectedcontenttext=getReadData("No_Content");
		Assert.assertEquals(actualcontenttext, expectedcontenttext);
	}
	public void clickOnMoved()
	{
		moved.click();
		String actualmovedttext=movedtext.getText();
		String expectedmovedtext=getReadData("Moved");
		Assert.assertEquals(actualmovedttext, expectedmovedtext);
	}
	public void clickOnRequest()
	{
		request.click();
		String Actualrequesttext=requesttext.getText();
		String expectedrequesttext=getReadData("Bad_Request");
		Assert.assertEquals(Actualrequesttext, expectedrequesttext);
	}
	public void clickOnUnauthorize()
	{
		unauthorize.click();
		String actualunauthorizetext=unauthorizetext.getText();
		String expectedunauthorizetext=getReadData("Unauthorized");
		Assert.assertEquals(actualunauthorizetext, expectedunauthorizetext);
	}
	public void clickOnForbidden()
	{
		forbidden.click();
		String actualforbiddentext=forbidden.getText();
		String expectedforbiddentext=getReadData("Forbidden");
		Assert.assertEquals(actualforbiddentext, expectedforbiddentext);
		
	}
	public void clickOnNotFound()
	{
		notfound.click();
		String actualnotfoundtext=notfound.getText();
		String expectednotfoundtext=getReadData("Not_Found");
		Assert.assertEquals(actualnotfoundtext, expectednotfoundtext);
	}
	
}
