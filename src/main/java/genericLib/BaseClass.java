package genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public  WebDriver driver;
	public PropertyFile pdata=new PropertyFile ();
	public WebDriverUtilies driverutilies=new  WebDriverUtilies();
	
	  @BeforeMethod
		public void OpenApp() throws IOException
		{
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get(pdata.getPropertyfiledata("url"));//we call the url from propertyFile
	      driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		
	  @AfterMethod
	  public void CloseApp(ITestResult result) throws IOException
	  {
		  int status = result.getStatus();//it give the status of the Tc
		  String name = result.getName();
		  
		  if(status==2)
		  {
			  Photo p=new Photo();//in photo class the getPhoto method is nonstatic so we need to create object
			  p.getPhoto(driver, name);
		  }
		  driver.quit();
	  }
	

}
