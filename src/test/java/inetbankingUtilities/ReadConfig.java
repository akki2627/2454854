package inetbankingUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	static Properties pro;
	
	public ReadConfig()
	{
		File src= new File("./Configuration\\config.properties");
		try
		{
			FileInputStream fis= new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+e.getMessage());
		}
	}
	public static String getApllicationURL()
	{
		String url=pro.getProperty("baseurl");
		return url;
	}
	public String getusername()
	{
		String username=pro.getProperty("username");
		return username;
	}
	public String getpassword()
	{
		String password=pro.getProperty("password");
		return password;
	}
	public String getchromepath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
//	public String getedgebrowwser()
//	{
//		String edgebrowwser=pro.getProperty("edgebrowser");
//		return edgebrowwser;
//	}
	  
}
