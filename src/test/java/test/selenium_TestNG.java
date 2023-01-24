package test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class selenium_TestNG {
	


	    WebDriver driver = new ChromeDriver();
	    
		@BeforeTest
		public void setup() 
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			
		}
		
		
		

		@Test
		public void test() throws InterruptedException {
			driver.get("https://google.com/");
			driver.findElement(By.name("q")).sendKeys("Automation step by step",Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();
			System.out.println(driver.getTitle());
			driver.findElement(By.xpath("//*[@id=\"menu-item-86\"]/a")).click();
			
			
			
			
			
		}

		//@AfterTest
		public void teardown() {
			driver.close();
			driver.quit();
			System.out.println("Test compledted sucessfully !");
			
		}
	}


