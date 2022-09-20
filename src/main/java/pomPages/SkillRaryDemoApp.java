package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryDemoApp {
	
	@FindBy(id="course")
	public WebElement coursetab;
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	public WebElement seleniumtraining;
	
	@FindBy(name="addresstype")
	public WebElement addressdd;
	
	public WebElement getAddressdd() {
		return addressdd;
	}
  
	public  SkillRaryDemoApp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCoursetab() {
		return coursetab;
	}
	
	public void SeleniumTrainingTb()
	{
		seleniumtraining.click();
	}

	
	
}
