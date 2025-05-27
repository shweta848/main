package classpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	
	@FindBy(xpath="//span[@id=\"nav-link-accountList-nav-line-1\"]") private WebElement home:
     
	@findby(xpath=" ")
		
		
	public login(WebDriver driver) {
		PageFactory.initElements(driver, this);
      	}
	
    public void homeclick(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(home).click().build().perform();
		}
	
}
