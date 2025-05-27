package capabilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class capa {
	
	@FindBy (xpath=" ")private WebElement Capa;
	
	public capa(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void capab() {   // change here important here 
		Capa.click();
	}

}
