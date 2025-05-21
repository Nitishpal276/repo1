package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baselibrary.BaseLibrary;

public class TextBoxPage extends BaseLibrary {
	public TextBoxPage()// constructor for page factory class and initialize current page WebElement
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//button[text()='×']")  //value of WebElement
	private WebElement close;   // data type and variable of WebElement
	
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath="//button[@data-target=\"#elements\"]")
	private WebElement elements;
	
	@FindBy(xpath="//a[text()='text box']")
	private WebElement textbox;
	
	@FindBy(xpath="//input[@id=\"fullname1\"]")
	private WebElement fullname; 
	
	@FindBy(xpath="//input[@id=\"fullemail1\"]")
	private WebElement fullemail;
	
	@FindBy(xpath="//textarea[@id=\"fulladdresh1\"]")
	private WebElement fulladdress;
	
	@FindBy(xpath="//textarea[@id=\"paddresh1\"]")
	private WebElement paddress ;
	
	@FindBy(xpath="//input[@value=\"Submit\"]")
	private WebElement submit;
	
	@FindBy(xpath="//*[@class=\"col-md-6 mt-5\"]/label")	
	List<WebElement> list; // actual data(webelements) stored in list
	
	
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
	public void clickontextbox()
	{
		textbox.click();
		
	}
	/*public void filldetails() // this is hardcoded 
	{
		fullname.sendKeys("phiroz khan");
		fullemail.sendKeys("xyzdh@gmail.com");
		fulladdress.sendKeys("sec 63 noida uttar pardes");
		paddress.sendKeys("baskhari ambedkar nagar up");
		
	}*/
	public void filldetails()// this is the way of DDT and fettching data from Excel
	{
		fullname.sendKeys(getReadData(0,1,0));
		fullemail.sendKeys(getReadData(0,1,1));
		fulladdress.sendKeys(getReadData(0,1,2));
		paddress.sendKeys(getReadData(0,1,3));
	}
	public void validate()
	{
		SoftAssert softassert= new SoftAssert();
		ArrayList<String> actual= new ArrayList<String>();
		
		ArrayList<String> expected= new ArrayList<String>();
		
		for(int i=1;i<list.size();i=i+2)// data(text) inserting in actual list 
		{
			actual.add(list.get(i).getText());
		}
		for(int i=0;i<4;i++)//data inserted in expected list 
		{
			expected.add(getReadData(0,1,i));
		}
		for(int i=0;i<expected.size();i++)//comparison both list
		{
			softassert.assertEquals(expected.get(i), actual.get(i));
		
		}
		softassert.assertAll();
		
	}
	
	public void submit()
	{
		submit.click();
	}
	
}  
