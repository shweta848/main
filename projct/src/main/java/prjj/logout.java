package prjj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logout {
@FindBy(xpath="//span[text()=\"Hello, Manisha\"]") private WebElement mani;
	
	
	@FindBy(xpath="//span[text()=\"Sign Out\"]")private WebElement signout;
	
	public logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void profilemani(WebDriver driver){
	Actions ac=new Actions(driver);
	ac.moveToElement(mani).perform();
	}
	
	
	public void Signout(WebDriver driver) {
		
	Actions ac=new Actions(driver);
	ac.moveToElement(signout).click().build().perform();
	}
	

}


}
