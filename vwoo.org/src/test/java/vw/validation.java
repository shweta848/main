package vw;

import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class validation {
	 WebDriver driver;
	@Test
	public void openbrowser() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Desktop\\IMPL\\chrome-win32\\chrome.exe");

		//WebDriver driver=new ChromeDriver();
         driver=new FirefoxDriver();
		driver.get("https://vwo.com/");
     
	}
	

}
