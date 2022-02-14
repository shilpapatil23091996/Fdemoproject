package demoPro.DemoProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_login2page 
{
	@FindBy(xpath = "//input[@type='password']")
	private WebElement pin;
	

	public Fb_login2page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}





}


