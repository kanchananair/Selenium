package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepkg.Basepg;

public class Fbloginpage extends Basepg{
	WebDriver driver;
	@FindBy(name="login")
	WebElement loginbutton;
	
	@FindBy(name="email")
	WebElement emailIdField;
	
	
	@FindBy(name="pass")
	WebElement pswd;
	
	public Fbloginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickLoginButton()
	{
		loginbutton.click();
	}
	public void setvalues(String UN, String PWD)
	{
		emailIdField.sendKeys(UN);
		pswd.sendKeys(PWD);
	}
	
	
	

}
