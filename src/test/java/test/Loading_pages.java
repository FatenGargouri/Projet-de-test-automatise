package test;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Loading_pages {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
			
	     //go to website
		 driver.get("https://google.com");
		 
		 //Stratégie normal
		 ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		 Thread.sleep(2000);
		 
		 
		 
		//Stratégie Eager
		 driver.get("https://google.com");
		 ChromeOptions chromeOptions1 = new ChromeOptions();
		 chromeOptions1.setPageLoadStrategy(PageLoadStrategy.EAGER);
		 Thread.sleep(2000);
		 
		 
		//Stratégie None
		 driver.get("https://google.com");
		 ChromeOptions chromeOptions2 = new ChromeOptions();
		 chromeOptions2.setPageLoadStrategy(PageLoadStrategy.NONE);
		 Thread.sleep(2000);
		 
		 
		 
		 

	}

}
