package inetbankingTest;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import inetbankingUtilities.ReadConfig;
import inetbankingpage.LoginPage;
public class Tc_Login_Test_001 extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException, IOException
	{
		 driver.get(readconfig.getApllicationURL());
		Logger.info("application start");
		
		LoginPage login= new LoginPage(driver); 
	    login.setUsername();
		Logger.info("user name enter");
	    login.setpassword();
		Logger.info("password enter");
	    login.clickbutton();
//	    
//	    if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
//	    {
//	    	Assert.assertTrue(true);
//	    }
//	    else
//	    {
//	    	capturescreenshot("loginTest",driver);
//	    	Assert.assertTrue(false);
//	    }
//	    
	    
		
		

	}
	
}
