package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import baselibrary.BaseLibrary;

public class RadioButtonsPage extends BaseLibrary {
	
	 public RadioButtonsPage()
	{
		PageFactory.initElements(driver, this);
	}
	 @FindBy(xpath="//*[text()='×']")
	 private WebElement close;
	 @FindBy(xpath="//a[text()='Practice']")
	 private WebElement practice;
	 @FindBy(xpath="//button[@data-target='#elements']")
     private WebElement elements;
	 @FindBy(xpath="//a[text()='radio buttons']")
     private WebElement radiobuttons;
	 
	 @FindBy(xpath="//input[@id='yes']")
	 private WebElement yesbutton;
	 @FindBy(xpath="//*[text()='You have selected yes']")
	 private WebElement yestext;
	 
	 @FindBy(xpath="//input[@id='impressive']")
	 private WebElement impressivebuttons;
	 @FindBy(xpath="//*[text()='You have selected impressive']")
	 private WebElement impressivetext;
	 
	 @FindBy(xpath="//input[@id='no']")
	 private WebElement nobuttons;
	 @FindBy(xpath="//*[text()='You have selected no']")
	 private WebElement notext;
	 
	 
	 
	
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
	 public void clickonradiobuttons()
	 {
		 radiobuttons.click();
	 }
	 
	 public void clickyesbutton()
	 {
		 yesbutton.click();
		 String actual= yestext.getText();
	     String expected=getReadData("yes");
	    Assert.assertEquals(actual, expected);
	 }
	 public void clickonimpressivebuttons() 
	 {
		 
		 impressivebuttons.click();
		 String actual= impressivetext.getText();
		 String expected=getReadData("impressive");
		 Assert.assertEquals(actual, expected);
	 }
	 public void clickonnobuttons()
	 
	 {
		 nobuttons.click();
		 String actual=notext.getText();
		 String expected=getReadData("no");
		 
		 Assert.assertEquals(actual, expected);
	 }
	 
	 
	 

}
