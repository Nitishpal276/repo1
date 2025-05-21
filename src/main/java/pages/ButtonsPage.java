package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import baselibrary.BaseLibrary;

public class ButtonsPage extends BaseLibrary
    {
	//initialize current page WebElements
	public ButtonsPage()
	{
		PageFactory.initElements(driver,this);
	}
    @FindBy(xpath="//*[text()='×']")
    private WebElement close;
    @FindBy(xpath="//*[text()='Practice']")
    private WebElement practice;
    @FindBy(xpath="//*[@type=\"button\" and @data-target=\"#elements\"]")
    private WebElement element;
    @FindBy(xpath="//*[text()='buttons']")
    private WebElement button;
    @FindBy(xpath="//*[@ondblclick='doubletext()']")
    private WebElement doubleclick;
    @FindBy(xpath="//*[@id='noContextMenu']")
    private WebElement rightclick;
    @FindBy(xpath="//*[@onclick='clicktext()']")
    private WebElement clickme;
    
    @FindBy(xpath="//*[@id='tab_5']//p")
    private List<WebElement> buttons;
    
    public void clickonclose()
    {
    	close.click();
    }
    public void clickonpractice()
    {
    	practice.click();
    }
    public void clickonelement()
    {
    	element.click();
    }
    public void clickonbutton()
    {
    	button.click();
    }
    
    public void clickondoubleclick()
    {
    	doubleclick(doubleclick);
    }
   
    public void clickonrightclick()
    {
    	rightclick(rightclick);
    }
    public void clickonclickme()
    {
    	clickme(clickme);
    }
   
    public void buttonValidate() {
    	List<String > actualbut= new ArrayList<String>();
    	List<String > expectbut= new ArrayList<String>();
    	String []a= {"Double Click Me","Right Click Me","Click Me"};
    	SoftAssert softassert= new SoftAssert();
    	for(int i=0;i<buttons.size();i++) {
    		actualbut.add(buttons.get(i).getText());
    	}
    	for(int i=0;i<buttons.size();i++) { 
    	expectbut.add(getReadData(a[i]));
    	}
    	for(int i=0;i<buttons.size();i++)
    	{
    		softassert.assertEquals(actualbut, expectbut);
    	}
    //	softassert.assertEquals(actualbut, expectbut);
    }
}
