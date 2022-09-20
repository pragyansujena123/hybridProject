package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoreJava;
import pomPages.SkillRaryLoginPage;

import pomPages.WishlistPage;

public class TestCase3 extends BaseClass {
	
	@Test
	public void Tc3() throws IOException, InterruptedException
	{
		SkillRaryLoginPage s=new SkillRaryLoginPage(driver);
		s.searchtextbox(pdata.getPropertyfiledata("course"));
		s.searchbutton();
		
		CoreJava c=new CoreJava(driver);
		c.corejavapage();
		
		WishlistPage w=new WishlistPage(driver);
		driverutilies.SwitchFrames(driver);
		 Thread.sleep(5000);
		 w.playbutton();
		 Thread.sleep(10000);
		 w.pausebutton();
		 driverutilies.SwitchBackFrame(driver);
		 w.addtowishlistbtn();
		 
		
				
				
	}

}
