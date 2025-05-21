package applicationUtility;

import org.openqa.selenium.WebElement;
// nitsh
public interface ApplicationUtility
   {
	
	public void doubleclick(WebElement ele);
	public void rightclick(WebElement ele);
	public void clickme(WebElement ele);
	public void windowHandle(int tab_no);
	public void uploadFile(String filepath);
	public void waitForAlerts(int time);
	public String getDate_time();
	
	

   }
