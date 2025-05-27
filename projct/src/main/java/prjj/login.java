package prjj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	@FindBy (xpath="//span[text()=\"Hello, sign in\"]")private WebElement sign;
	@FindBy (xpath="//input[@type=\"email\"]") private WebElement email;
	@FindBy (xpath="//span[@id=\"continue\"]") private WebElement button;
	@FindBy (xpath="//input[@type=\"password\"]") private WebElement password;
	@FindBy(xpath="//input[@id=\"signInSubmit\"]") private WebElement passbutton;
	
	
	public login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void Signin() {
		sign.click();
	}
	public void emailpage() {
		email.sendKeys("8888569592");
		
	}
	public void emailbutton() {
		button.click();
	}
	public void Password() {
		password.sendKeys("Shweta1234@#");
	}
	public void Passwordbutton() {
		passbutton.click();
		
	}
	


}
