package baselibrary;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.poifs.property.Property;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import applicationUtility.ApplicationUtility;
import excelUtility.ExcelUtility;
import propertyUtility.PropertyUtility;
import screenshotutility.ScreenshotUtility;
import waitUtility.WaitUtility;

public class BaseLibrary implements ExcelUtility, PropertyUtility, ApplicationUtility, WaitUtility, ScreenshotUtility {

	public interface WaitUtility {

	}

	public static WebDriver driver = null;

	public void launchUrl() {

		// <---------------chrome driver folder path-------------------------------->
		String localDir = System.getProperty("user.dir");
		String path = localDir + "\\webdriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		// initialize the driver
		driver = new ChromeDriver();
		// launching the URL
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// implicit wait
		driver.get("https://testingbaba.com/old/");
		driver.manage().window().maximize();

	}

	// <-----------------------Data Reading from
	// Excel--------------------------------->
	@Override
	public String getReadData(int shtno, int rownum, int colnum) {
		String localDir = System.getProperty("user.dir");
		String path = localDir + "\\testdata\\Untitled spreadsheet.xlsx";
		String value = "";
		try {
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(shtno);
			value = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		} catch (Exception e) {
			System.out.println("issue getread data" + e);
		}
		return value;
	}

//<-----------------------------Data Reading From Properties File------------------------->
	@Override
	public String getReadData(String key) {
		String value = "";
		String localDir = System.getProperty("user.dir");
		String path = localDir + "\\testdata\\config.properties";

		try {
			FileInputStream fis = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);
		} catch (Exception e) {
			System.out.println("Issue in getReadData : " + e);
		}
		return value;
	}

	// <--------------------ApplicationUtility codes----------------------------->
	@Override
	public void doubleclick(WebElement ele) {
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
	}

	@Override
	public void rightclick(WebElement ele) {
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
	}

	@Override
	public void clickme(WebElement ele) {
		Actions act = new Actions(driver);
		act.click(ele).perform();
	}

	@Override
	public void windowHandle(int tab_no) {
		Set<String> handles = driver.getWindowHandles();
		ArrayList<String> handle = new ArrayList<String>(handles);
		driver.switchTo().window(handle.get(tab_no));

	}

//<-------------------Wait Utility Code--------------------------->
	@Override
	public void waitforClick(WebElement ele) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();

	}

	@Override
	public void waitforDisplay(WebElement ele, String val) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys(val);

	}
	
	

	// <-----------------------File Uploading------------------------->
	@Override
	public void uploadFile(String filepath) {
		StringSelection ss = new StringSelection(filepath); // taking filepath into ss
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard(); // clipboard into cb
		cb.setContents(ss, null);// set or copy into clipboard

//		press  Ctrl +V and ENTER (virtual   key )		 
		try {
			Robot rb = new Robot();
			rb.delay(400);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.delay(400);
			rb.keyRelease(KeyEvent.VK_ENTER);

		} catch (AWTException e) {

			System.out.println("issue in upload file ....");
			e.printStackTrace();
		}
	}

//<---------------------Wait for Alert----------------------------->
	@Override
	public void waitForAlerts(int time) {
		WebDriverWait wdw = new WebDriverWait(driver, time);
		wdw.until(ExpectedConditions.alertIsPresent());

	}

	@Override
	public void getScreenshot(String foldername, String filename) {
		try {
			String loc = System.getProperty("user.dir");
			String finalpath = loc + "//screenshots//" + foldername + "//" + filename + ".png";

			EventFiringWebDriver efw = new EventFiringWebDriver(driver);
			File src = efw.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(src, new File(finalpath));

		} catch (IOException e) {
			System.out.println("issue in get screenshot ..........");
			e.printStackTrace();
		}

	}
	
	
	@AfterMethod
	public void resultAnalysis(ITestResult result) {
		String methodname= result.getMethod().getMethodName();
		String datetime=getDate_time();
		String finalname=methodname+datetime;
		try {
			if(result.getStatus()==ITestResult.SUCCESS) {
				getScreenshot("passed", finalname);
			}
			else if(result.getStatus()==ITestResult.FAILURE) {
				getScreenshot("failed", finalname);
			}
			else {
				getScreenshot("skip", finalname);
			}
		} catch (Exception e) {
			System.out.println("issue in result analysis.. ");
			e.printStackTrace();
		}
	}
	
	@Override
	public String getDate_time() {
		String value=null;
		try {
			Date date= new Date();
			SimpleDateFormat sf= new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
			value=sf.format(date);
		} catch (Exception e) {
			System.out.println("issue in getDate_time....");
			e.printStackTrace();
		}
		return value;
	}

	/*
	 * @AfterTest public void flush() { try { Thread.sleep(10000); } catch
	 * (InterruptedException e) {
	 * System.out.println("issue in flush wait............."); e.printStackTrace();
	 * } driver.close(); }
	 */

}
