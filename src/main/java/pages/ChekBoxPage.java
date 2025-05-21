package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import baselibrary.BaseLibrary;

public class ChekBoxPage extends BaseLibrary {
	
	public ChekBoxPage()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='×']")
	private WebElement close;
	@FindBy(xpath="//*[text()='Practice']")
	private WebElement practice;
	@FindBy(xpath="//*[@data-target='#elements']")
	private WebElement elements;
	@FindBy(xpath="//a[text()='check box']")
	private WebElement checkbox;
	@FindBy(xpath="//input[@id='myCheck']")
	private WebElement mobile;
	@FindBy(xpath="//input[@id='mylaptop']")
	private WebElement laptop;
	@FindBy(xpath="//input[@id='mydesktop']")
	private WebElement desktop;
	@FindBy(xpath="//iframe[@src='Checkbox.html']")
	private WebElement iframe;
	
	@FindBy(xpath="//h6[@id='text']")
	private WebElement mobiletext;
	@FindBy(xpath="//*[@id='text1']")
	private WebElement laptoptext;
	@FindBy(xpath="//*[@id='text2']")
	private WebElement desktoptext;
	
	
	public void clickonclose()
	{
		close.click();
	}
	public void clickonpractice()
	{
		practice.click();
	}
	public void clickonelements()
	{
		elements.click();
	}
	public void clickoncheckbox()
	{
		checkbox.click();
	}
	
	public void clickonmobile()//comparing text by using properties
	{
		SoftAssert softassert= new SoftAssert();
		driver.switchTo().frame(iframe);
		mobile.click();
		String actual = mobiletext.getText();
//		String expected = getReadData("mobile");
		String expected=getReadData(0, 3, 0);
		//Assert.assertEquals(actual, expected);
		softassert.assertEquals(actual, expected);
	}
	public void clickonlaptop() 
	{
		SoftAssert softassert= new SoftAssert();
		laptop.click();
		String actual=laptoptext.getText();
//     	String expected=getReadData("laptop");
		String expected=getReadData(0, 4, 0);
     	
		//Assert.assertEquals(actual, expected);
     	softassert.assertEquals(actual, expected);
	}
	public void clickondesktop()
	{
		SoftAssert softassert= new SoftAssert();
		desktop.click();
		String actual=desktoptext.getText();
//		String expected=getReadData("desktop");
		String expected=getReadData(0, 5, 0);
		//Assert.assertEquals(actual, expected);
		softassert.assertEquals(actual, expected);
		driver.switchTo().defaultContent();
	}
	
	
	
}
	
	


