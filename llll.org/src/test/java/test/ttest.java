package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ttest {
	
	@Test
	public void browser() {
	
          System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shree\\Desktop\\chromedriver_Win32(2)\\chromedriver.exe");

  		//WebDriver driver=new ChromeDriver();
  		WebDriver driver=new FirefoxDriver();
  		driver.get("https://www.amazon.in");change here
  	

          
		
	}
}
