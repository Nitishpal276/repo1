package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.BaseLibrary;

public class WebTablesPage extends BaseLibrary {
	
	public WebTablesPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='×'] ")
	private WebElement close;
	@FindBy(xpath="//a[text()='Practice']")
	private WebElement practice;
	@FindBy(xpath="//button[@data-target='#elements']")
	private WebElement element;
	
	@FindBy(xpath="//a[text()='web tables']")
	private WebElement webtable;
	
	@FindBy(xpath="//iframe[@src='Webtable.html']")
	private WebElement iframe;
	
	@FindBy(xpath="//*[text()='Name:']/following::input[@name='name']")
	//@FindBy(xpath="//input[@pattern'^[a-zA-Z][\\sa-zA-Z]{2,32}']")
	private WebElement name;
	
	@FindBy(xpath="//*[text()='Email:']/following::input[@name='email']")
	private WebElement email;
	@FindBy(xpath="//button[text()='Save']")
	private WebElement save;
	
	@FindBy(xpath="//button[text()='Edit']")
	public  List<WebElement> edit;
	
	@FindBy(xpath="//button[text()='Delete']")
	private WebElement delete;
	
	
	@FindBy(xpath="//button[text()='Cancel']")
	private WebElement cancel;
	
	@FindBy(xpath="//button[text()='Update']")
	private WebElement update;
	
	@FindBy(xpath="//*[@name='edit_name']")
	private WebElement editname;
	
	@FindBy(xpath="//*[@name='edit_email']")
	private WebElement editemail;
	
//	@FindBy(xpath="//*[@class='table table-bordered data-table']/thead/following::tbody/tr/td[1]")
//	private List<WebElement> namelist;
//	
//	@FindBy(xpath="//*[@class='table table-bordered data-table']/thead/following::tbody/tr/td[2]")
//	private List<WebElement> emaillist;
//	
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
	public void clickonwebtable()
	{
		webtable.click();
	}
	//filling WebTable from excel sheet-1
	public void filldetails()
	{
		driver.switchTo().frame(iframe);
		for(int i=1;i<11;i++) 
		{
			name.sendKeys(getReadData(0, i, 0));
			email.sendKeys(getReadData(0, i, 1));
			save.click();
					}
		
	}
	//updating table and inserting data from excel sheetno3
	
	
	 public void updateWebtable()  {
		 try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("issue in wait .............");
			e.printStackTrace();
		}
		 int j=1;
		 for(int i=0; i<edit.size();i++)
		 
		{		 
		 edit.get(i).click();
		 editname.clear();
		 editname.sendKeys(getReadData(2, j, 0));
		 editemail.clear();
		 editemail.sendKeys(getReadData(2, j, 1));
		 update.click();
		 
		 j++;	 
	 }
		 
		 driver.switchTo().defaultContent();	 
	 }
	
	/*public void printNames() {
		System.out.println("printnems running..........");
	    for (WebElement name : namelist) {
	        System.out.println(name.getText());
	        
	        
	    }
	}*/
	
	public void validate()
	{
		ArrayList<String> actualname=new ArrayList<String>();
		ArrayList<String> actualemail= new ArrayList<String>();
		ArrayList<String> expectednmae=new ArrayList<String>();
		ArrayList<String> expectedemail= new ArrayList<String>();

		for(int i=0;i<edit.size();i++)
		{
//			System.out.println(namelist.get(i).getText());
			actualname.add(editname.getText());
		}
//		System.out.println(actualname+"acutal data ");
		for(int i=1;i<15;i++)
		{
//			System.out.println(getReadData(0, i, 0));
			expectednmae.add(getReadData(0, i, 0));
		}
//		System.out.println(expectednmae+"expected data");
		
	}
	
	

}
