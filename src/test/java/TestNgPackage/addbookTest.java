package TestNgPackage;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class addbookTest {
   WebDriver driver;
	@BeforeMethod
	public void launch() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver(); // creating object of ChromeDriver class
		driver.manage().window().maximize(); //Maximize the browser window
		driver.get("http://34.67.127.158:32768/addressbook/");
		
	}
	
  @Test
  public void verifyaddbook() {
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//div[@class='v-button v-widget']")).click();
	  driver.findElement(By.id("gwt-uid-5")).sendKeys("kavneet");
	  driver.findElement(By.id("gwt-uid-7")).sendKeys("singh");
	  driver.findElement(By.id("gwt-uid-9")).sendKeys("8826438664");
	  driver.findElement(By.id("gwt-uid-11")).sendKeys("soni@gmail.com");
	  driver.findElement(By.id("gwt-uid-13")).sendKeys("07/13/1992");
	  driver.findElement(By.xpath("//div[@class='v-button v-widget primary v-button-primary']")).click();
  }
  
  @AfterMethod
  public void close(){
	  driver.close();
	  
  }
}
