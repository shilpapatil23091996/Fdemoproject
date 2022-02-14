package demoPro.DemoProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_login3page 
{
	public static final String Thread = null;
	@FindBy(xpath = "//div[@dir='auto']")
	private WebElement profileName;

	public Fb_login3page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String verifyFb_HomePageProfileName() {
		String act = profileName.getText();
		String exp = "Add a mobile number";
            return act;
		//if (act.equals(exp)) {
		//	System.out.println("Pass");
	//	} else {
		//	System.out.println("Fail");
		//}


	}}

