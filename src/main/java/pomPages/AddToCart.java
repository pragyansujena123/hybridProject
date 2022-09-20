package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {

	@FindBy(id="add")
	private WebElement add;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement cartbtn;
	
	public AddToCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdd() {
		return add;
	}
	public void addtocart()
	{
		cartbtn.click();
	}
}
