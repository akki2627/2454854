package inetbankingpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import inetbankingUtilities.ReadConfig;

public class LoginPage {
	
	WebDriver driver;
	ReadConfig readconfig= new ReadConfig();
	public LoginPage(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);
	}
	@FindBy (name="uid")
	@CacheLookup
	WebElement textname;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement textpassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	public void setUsername()
	{
		textname.sendKeys(readconfig.getusername());
	}
	public void setpassword()
	{
		textpassword.sendKeys(readconfig.getpassword());
	}
	public void clickbutton()
	{
		btnLogin.click();
	}

}
