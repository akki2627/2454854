package inetbankingTest;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import inetbankingUtilities.xuttils;
import inetbankingpage.LoginPage;

public class Tc_Login_Test_002 extends BaseClass {

	@Test (dataProvider="Book1")
	public void logintest2(){
    driver.get(readconfig.getApllicationURL());
	Logger.info("application start");
	LoginPage login= new LoginPage(driver); 
    login.setUsername();
	Logger.info("user name enter");
    login.setpassword();
	Logger.info("password enter");
    login.clickbutton();
	}
	@DataProvider(name="Book1")
	String[][] getData() throws IOException
	{
		String path="C:\\Users\\91967\\eclipse-workspace\\2454584\\src\\test\\java\\inetbankingTestData\\Book1.xlsx";
	    int rownum= xuttils.getRowCount(path, "akki");
	    int colcount=xuttils.getcellCount(path, "akki", 1);
	   
	    String Book1[][]=new String[rownum][colcount];
	    for(int i=1; i<=rownum; i++)
	    {
	    	for(int j=0; j<colcount; j++)
	    	{
	    		Book1[i-1][j]=xuttils.getcelldataCount(path, "akki", i, j);
	    	}
	    }
	    return Book1;
	}  

}