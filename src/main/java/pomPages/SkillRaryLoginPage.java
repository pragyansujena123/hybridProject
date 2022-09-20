package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryLoginPage {
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[@class='ignorelink'])[16]")
	private WebElement skillrarydemoApp;
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement searchbtn;
	
	public SkillRaryLoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void GearsButton()
	{
		gearsbtn.click();
	}
	
	public void SkillraryDemoApplication()
	{
		 skillrarydemoApp.click();
	}
	
	public void searchtextbox(String CourseName)
	{
		searchtb.sendKeys(CourseName);
	}
	
	public void searchbutton()
	{
		searchbtn.click();
	}

}
