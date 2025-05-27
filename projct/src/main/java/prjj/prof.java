package prjj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class prof {
	

	@FindBy(xpath="//input[@placeholder=\"Search Amazon.in\"]") private WebElement Searchbox;
	@FindBy(xpath="//input[@type=\"submit\"]") private WebElement button;

	
	public prof (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Search() {
		Searchbox.sendKeys("womens dresses");
	}
	public void Button() {
		button.click();
	}


}
