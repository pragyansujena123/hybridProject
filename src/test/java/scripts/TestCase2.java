package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillRaryDemoApp;
import pomPages.SkillRaryLoginPage;
import pomPages.TestingPage;

public class TestCase2 extends BaseClass{
	
	@Test
	public void Tc2() throws IOException, InterruptedException
	{
		SkillRaryLoginPage s=new SkillRaryLoginPage(driver);
		s.GearsButton();
		s.SkillraryDemoApplication();
		
		SkillRaryDemoApp sd=new SkillRaryDemoApp(driver);
		driverutilies.SwitchingTabs(driver);
		driverutilies.Dropdown(sd.getAddressdd(),pdata.getPropertyfiledata("dropdowndata"));
		
		TestingPage t=new TestingPage(driver);
		driverutilies.dragAndDrop(driver,t.getSeleniumtraning(),t.getCart());
		Thread.sleep(5000);
		
		Point loc = t.getCart().getLocation();
		int x = loc.getX();
		int y = loc.getY();
		driverutilies.Scrollbar(driver,x,y);
	}

}
