package TestNgClasses;

import org.testng.annotations.Test;

import Utility.DriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Initialcases {
WebDriver driver;
	
	String expectedURL="https://selenium.obsqurazone.com/index.php";
	DriverManager obj=new DriverManager();

  @Test
  public void ValueCheck1() throws InterruptedException {
	  WebElement inputForm=driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a"));
	  inputForm.click();
	  Thread.sleep(2000);
	  WebElement textbox=driver.findElement(By.id("single-input-field"));
	  textbox.sendKeys("Hello");
	  Thread.sleep(2000);
	  WebElement button=driver.findElement(By.id("button-one"));
	  button.click();
	  Thread.sleep(2000);
	  WebElement getvalue=driver.findElement(By.id("message-one"));
	 String appvaluue= getvalue.getText();
	 if(appvaluue.contains("Hello"))
	 {
		 Assert.assertTrue(true);
	 }
	 else
	 {
		 Assert.fail("String comparison failed");
	  
  }
  }
	 @Test
	 public void ValueCheck2() throws InterruptedException
	 {
		 WebElement inputForm=driver.findElement(By.xpath("//*[@id=\"collapsibleNavbar\"]/ul/li[2]/a"));
		  inputForm.click();
		  Thread.sleep(2000);
		  WebElement textbox=driver.findElement(By.id("value-a"));
		  textbox.sendKeys("25");
		  Thread.sleep(2000);
		  WebElement textbox1=driver.findElement(By.id("value-b"));
		  textbox1.sendKeys("25");
		  Thread.sleep(2000);
		  WebElement button=driver.findElement(By.id("button-two"));
		  button.click();
		  Thread.sleep(2000);
		  WebElement getvalue=driver.findElement(By.id("message-two"));
		 String appvaluue=getvalue.getText();
		 if(appvaluue.contains("50"))
		 {
			 Assert.assertTrue(true);
		 }
		 else
		 {
			 Assert.fail("Comparison failed");
		  
		 
	 }
  
	 }

@BeforeTest
  public void beforeTest() throws InterruptedException {
	  obj.launchBrowser(expectedURL);
	  this.driver=obj.driver;
  }

  @AfterTest
  public void afterTest() {
	  obj.closeBrowser();
  }

}
