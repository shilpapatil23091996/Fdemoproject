package demoPro.DemoProject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class superclass {
	static WebDriver driver;
	
public static WebDriver openbrowser() {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");

	System.setProperty("webdriver.chrome.driver",
			"/home/techno/Documents/chromedriver_linux64/chromedriver");

	WebDriver driver = new ChromeDriver(option);

	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");


	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  return driver;
  //gfvhgh
}
}


