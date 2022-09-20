package genericLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilies {

	//hndle the dropdown by the help of select class
	public void Dropdown(WebElement ele, String text)//so here we pass it as a parameter
	{
	 Select s=new Select(ele);//here we need to pass the address of the elemnt which address we dont know 
	 s.selectByVisibleText(text);
	}
	
	//hadle mouserhover
	public void mouseHover(WebDriver driver, WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	//handle doubleclick
	public void DoubleClick(WebDriver driver, WebElement ele)
	{
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	
	public void dragAndDrop(WebDriver driver, WebElement source, WebElement target)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(source,target).perform();		
	}
	
	public void SwitchFrames(WebDriver driver)
	{
		driver.switchTo().frame(0);
	}
	
	public void SwitchBackFrame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	public void alertPopup(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	public void SwitchingTabs(WebDriver driver)
	{
		Set<String> child = driver.getWindowHandles();
		
		for(String b:child)//child is stored inside a reference variable the return type of this is string
		{
			driver.switchTo().window(b);
		}
	}
   
	public void Scrollbar(WebDriver driver,int x, int y)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
}
