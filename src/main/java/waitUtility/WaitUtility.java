package waitUtility;

import org.openqa.selenium.WebElement;

public interface WaitUtility {
	
	public void waitforClick(WebElement ele);
	public void waitforDisplay(WebElement ele, String val);
	
	

}
