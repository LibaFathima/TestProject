package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {
	public WebDriver driver;

	
	public void closeBrowser()
	{
		driver.close();
		
		
	
		  	
		  
	}
	public void launchBrowser(String url) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ROSE\\eclipse-workspace\\TestProject\\src\\main\\resources\\chromedriver.exe");
		  ChromeOptions onarg=new ChromeOptions();
		  onarg.addArguments("--remote-allow-origins=*");
		  driver=new ChromeDriver(onarg);
		  	driver.manage().window().maximize();
		  	driver.get(url);
		  	Thread.sleep(4000);
		  
		
	}

	
}
