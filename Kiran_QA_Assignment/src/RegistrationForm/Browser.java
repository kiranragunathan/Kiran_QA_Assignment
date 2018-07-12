package RegistrationForm;

import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class Browser 
{
	static WebDriver driver;
    Robot rb;
   
    public WebDriver startbrowser(String browserName,String URL) throws InterruptedException
    {
    
    	if(browserName.equalsIgnoreCase("Firefox"))
    	{
    		//System.setProperty("webdriver.chrome.driver","D:\\DATA\\Study_materails\\Automation materials\\Selenium\\geckodriver-v0.12.0-win64\\geckodriver.exe");
                    driver = new FirefoxDriver();
                    driver.manage().window().maximize();
    	}
    	else if(browserName.equalsIgnoreCase("Chrome"))
    	{
    		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe"); 
    		ChromeOptions chromeOptions = new ChromeOptions();
    		chromeOptions.addArguments("--start-maximized");
    		driver = new ChromeDriver(chromeOptions);     	          
    	}
    	else if(browserName.equalsIgnoreCase("IE"))
    	{
    		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
    		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
    		System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe"); 
    		driver = new InternetExplorerDriver();
    		driver.manage().window().maximize();
    	}
    	driver.get(URL);
    	Thread.sleep(1000);
    	return driver;
    }
}
