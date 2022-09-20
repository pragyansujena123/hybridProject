package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddToCart;
import pomPages.SkillRaryDemoApp;
import pomPages.SkillRaryLoginPage;

public class TestCase extends  BaseClass {
	
	@Test
	public void Tc1()
	{
		SkillRaryLoginPage s=new SkillRaryLoginPage(driver);
		s.GearsButton();
		s.SkillraryDemoApplication();
		
		SkillRaryDemoApp sd=new SkillRaryDemoApp(driver);
		driverutilies.SwitchingTabs(driver);
		driverutilies.mouseHover(driver,sd.getCoursetab());
		sd.SeleniumTrainingTb();
		
		 AddToCart a=new  AddToCart(driver);
		 driverutilies.DoubleClick(driver,a.getAdd());
		 a.addtocart();
	}
	
	 

}
