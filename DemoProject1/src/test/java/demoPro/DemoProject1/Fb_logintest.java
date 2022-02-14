package demoPro.DemoProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Fb_logintest 
{
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver",
				"/home/techno/Documents/chromedriver_linux64/chromedriver");

		WebDriver driver = new ChromeDriver(option);

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		FB_login1page login1 = new FB_login1page(driver);
     login1.setFb_Login1PageUN("shilpip1234@gmail.com");
     login1.setFb_Login1PagePWD("saibaba@1234");
     login1.clicFb_Login1PageLoginButton();
     Thread.sleep(4000);
     
		
		Thread.sleep(4000);
	    Fb_login3page home=new Fb_login3page(driver);
		home.verifyFb_HomePageProfileName();

		Thread.sleep(3000);
		driver.close();

		
		 
		Thread.sleep(9000);
		driver.close();

	}
}

