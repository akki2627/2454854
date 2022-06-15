package inetbankingTest;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import inetbankingUtilities.ReadConfig;


public class BaseClass {
	
	ReadConfig readconfig= new ReadConfig();
	
	public static WebDriver driver;
	public static Logger Logger;
	@Parameters("browser")
	@BeforeClass
	public void setup(String browser)
	{
		System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
	    driver=new ChromeDriver();
	    Logger = Logger.getLogger("ebanking");
  	    PropertyConfigurator.configure("log4j.properties");
  	 
  	    
  	 
	}

	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
public static void capturescreenshot(String tname,WebDriver driver) throws InterruptedException, IOException
	
	{
		TakesScreenshot s = (TakesScreenshot)driver;
		File src = s.getScreenshotAs(OutputType.FILE);
		File dst = new File (System.getProperty("user.dir")+"/Screenshot/"+ tname +".png");
		FileHandler.copy(src, dst);    
	}

}
