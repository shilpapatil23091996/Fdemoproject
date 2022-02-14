package demoPro.DemoProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_login1page 
{
	

		// Un
		@FindBy(xpath = "")
		private WebElement forgot;

		// Un
		@FindBy(xpath = "//input[@type='text']")
		private WebElement UN;

		// pwd
		@FindBy(xpath = "//input[@placeholder='Password']")
		private WebElement pwd;

		// login
		@FindBy(xpath = "//button[@type='submit']")
		private WebElement login;

		public FB_login1page
		(WebDriver driver){
			PageFactory.initElements(driver, this);
		}

		// step3:

		// enter un
		public void setFb_Login1PageUN(String username) {
			UN.sendKeys(username);
		}

		// enter pwd
		public void setFb_Login1PagePWD(String password) {
			pwd.sendKeys(password);
		}

		// click on login button
		public void clicFb_Login1PageLoginButton() {
			login.click();
		}

		public void clickKiteLogin1PageForgotAcc() {
			forgot.click();
		}

	}


