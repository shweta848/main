package projctmg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import prjj.login;
import prjj.logout;
import prjj.prof;


public class dd {
	
	WebDriver driver;
	login L;
	logout l;
	 prof p;
	 
	@BeforeTest
	public void beforetest() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shree\\Desktop\\chromedriver-win64\\chromedriver.exe");
   // driver=new ChromeDriver();
    
	
     driver=new FirefoxDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	 driver.get("https://www.amazon.in");
	 driver.manage().window().maximize();
	 
       }
	
	@BeforeClass
	public void beforeclass() {
	  L=new login(driver);
	  l=new logout(driver);
	   p=new prof(driver);
	 
	}
	
	@BeforeMethod
	public void beforemethod() {
	
	//https://www.flipkart.com/grocery-supermart-store?marketplace=GROCERY&fm=neo%2Fmerchandising&iid=M_07775b41-671e-4d5f-8e7e-cd4328255845_1_372UD5BXDFYS_MC.CBUR1Q46W5F1&otracker=hp_rich_navigation_1_1.navigationCard.RICH_NAVIGATION_Grocery_CBUR1Q46W5F1&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_1_L0_view-all&cid=CBUR1Q46W5F1L.Signin();
	L.Signin();
	L.emailpage();
	L.emailbutton();
	L.Password();
	L.Passwordbutton();
	}
	
	@Test
	
	public void test() {
		p.Search();
		p.Button();
		
	}

	
	
	@AfterMethod
	public void aftemethod() {
	l.profilemani(driver);
	l.Signout(driver);
	}
	
	@AfterClass
	public void afterclass(){
		L=null;
		l=null;
		
		
	}
	@AfterTest
	public void aftertest(){
		System.gc();
		driver.close();
		
		
	}
	

}

