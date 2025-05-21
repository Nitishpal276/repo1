package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import baselibrary.BaseLibrary;


public class ModalDialogsPage extends BaseLibrary {
	
	public ModalDialogsPage()
	{
	PageFactory.initElements(driver, this);
	}
	//<-------Locating WebElements----->
	@FindBy(xpath="//*[text()='×']")
	private WebElement close;
	@FindBy(xpath = "//*[text()='Practice']")
	private WebElement practice;
	@FindBy(xpath = "//*[@data-target='#alerts']")
	private WebElement alertframewindow;
	@FindBy(xpath = "//a[text()='modal dialogs']")
	private WebElement modaldialogs;
	@FindBy(xpath = "//button[@data-target='#exampleModal1']")
	private WebElement smallmodel;
	@FindBy(xpath="//div[@id='exampleModal1']/descendant::div[5]/button[@class='btn btn-primary']")
	private WebElement closesmallbutton;
	@FindBy(xpath="//div[@id='exampleModal1']/descendant::div[4]")
	private WebElement smallboxtext;
	
	@FindBy(xpath = "//button[@data-target='#exampleModal2']")
	private WebElement largbutton;
	@FindBy(xpath = "//*[@id=\"exampleModal2\"]/descendant::div[4]/p/b[text()='This is a Large modal.']")
	private WebElement largebuttontext;
	@FindBy(xpath="//div[@id='exampleModal2']/descendant::div[5]/button[@class='btn btn-primary']")
	private WebElement closelargebutton;
	
//<----------Over the Action On WebElements-------->
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
	public void clickOnModalDialogs()
	{
		waitforClick(modaldialogs);
	}
	public void cllickOnSmallModal()
	{
		SoftAssert soft= new SoftAssert();
		waitforClick(smallmodel);
//		String expected =getReadData("Small");
		String expe= "This is a small modal. It has very less content";
		String actual= smallboxtext.getText();
		soft.assertEquals(expe, actual);
		//Assert.assertEquals(expe, actual);
		waitforClick(closesmallbutton);
		
	}
	public void clickOnLargeModal()
	{
		SoftAssert soft= new SoftAssert();
		waitforClick(largbutton);
//		String expected=getReadData("Large");
//		String actual=largebuttontext.getText();
//		//Assert.assertEquals(expected, actual);
//		soft.assertEquals(expected,actual);
		String expect="This is a Large modal.";
		String actual=largebuttontext.getText();
		soft.assertEquals(expect,actual);
		waitforClick(closelargebutton);
	}
	
	

}
